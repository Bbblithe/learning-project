package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/24 14:05
 * Description:
 * 删除部门39及其部门下所有的职员信息
 *
 * SQL:
 *      delete from dept where deptno = 30 #dept.bak
 *      delete from emp where deptno = 30  #emp.bak
 *
 * 规则：
 *      在一个需求中，只要任意一个SQL命令无法执行的。
 *      此时应该将需求所有的SQL命令都判定执行失效。
 */


public class 事务管理 {
    public static void main(String[] args) {
        String sql_1 = "delete from emp where deptno = 30";
        String sql_2 = "delete from dept where deptno = 30";

        Connection con = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        try{
            // 1.注册Driver驱动器
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2.建立通道
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blithexwj","root","2015022136");

            // 3.通过【连接通道】向MySql服务器发送命令"start translation"

            // 将自动提交事务，改变成手动提交
            con.setAutoCommit(false);

            // 4.建立交通工具
            ps1 = con.prepareStatement(sql_1);
            ps2 = con.prepareStatement(sql_2);
            // 5.推送SQL命令
            try{
                // 如果能执行到这里，说明推送的两条sql命令都能执行，此时通知mysql服务器将将本次操作中表文件备份进行删除处理
                ps1.executeUpdate();
                ps2.executeUpdate();
                con.commit();// 向mysql服务器推送commit();
            } catch(Exception e){
                // 由connection通知mysql服务器将本次操作中所有表文件备份覆盖表文件
                con.rollback(); // 向mysql服务器推送 rollback
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally{
            // 资源的销毁

            if(ps1 != null) {
                try {
                    ps1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(ps2 != null){
                try{
                    ps2.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(con != null) {
                try{
                    con.close();
                } catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
