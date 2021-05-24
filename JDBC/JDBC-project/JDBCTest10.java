package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/7 18:45
 * Description:
 * JDBC事务机制：
 *      1、JDBC中的事务是自动提交的，什么是自动提交？
 *          只要执行任意一条DML语句，则自动提交一次。这是JDBC默认的事务行为。
 *          但是在实际的业务当中，通常都是N条DML语句共同联合才能完成的，必须
 *          保证他们这些DML语句在同一个事务中同时成功或者同时失败。
 *
 *      2、以下程序先来验证一下JDBC的事务是否是自动提交机制！
 *          测试结果：JDBC只要执行任意一条DML语句，就提交一次。
 */


public class JDBCTest10 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            //1、注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2、获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blithexwj","root","2015022136");
            //3、获取预编译数据库操作对象
            String sql1 = "update dept set dname = ? where deptno = ?";

            ps = conn.prepareStatement(sql1);

            // 第一次给占位符传值
            ps.setString(1,"X部门");
            ps.setInt(2,30);
            int count = ps.executeUpdate();// 执行第一条UPDATE语句
            System.out.println(count);

            // 重新给占位符传值
            ps.setString(1,"y部门");
            ps.setInt(2,20);
            count = ps.executeUpdate();// 执行第二条UPDATE语句
            System.out.println(count);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if(ps != null){
                try{
                    ps.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if(conn != null){
                try{
                    conn.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
