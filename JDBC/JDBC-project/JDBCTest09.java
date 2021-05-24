package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/7 15:15
 * Description:
 * PreparedStatement完成INSERT DELETE UPDATE
 */


class JDBCTest09 {
    public static void main(String[] args){
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            //1、注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2、获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blithexwj","root","2015022136");
            //3、获取预编译的数据库操作对象
            /*
            ps = conn.prepareStatement("insert into dept(deptno,dname,loc) values(?,?,?)");
            ps.setInt(1,100);
            ps.setString(2,"教研部");
            ps.setString(3,"海南");*/
            /*
            String sql = "update dept set dname = ?,loc = ? where deptno = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"研发一部");
            ps.setString(2,"北京");
            ps.setInt(3,100);
             */
            String sql = "delete from dept where deptno = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,100);
            //4、执行SQL"
            int count = ps.executeUpdate();
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
