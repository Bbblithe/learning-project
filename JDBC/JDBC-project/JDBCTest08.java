package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/7 14:59
 * Description:
 */


class JDBCTest08 {
    public static void main(String[] args) {
        // 用户再控制台输入desc就是降序，输入asc就是升序
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("请输入desc或asc，desc表示降序，asc表示升序");
        System.out.print("请输入:");
        String keyWord = s.nextLine();

        // 执行SQL
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // 注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blithexwj","root","2015022136");
            // 获取预编译的数据库操作对象
            ps = conn.prepareStatement("select * from emp order by sal ?" );
            ps.setString(1,keyWord);
            // 执行SQL语句
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

         */

        Scanner s = new Scanner(System.in);
        System.out.println("请输入desc或asc，desc表示降序，asc表示升序");
        System.out.print("请输入:");
        String keyWord = s.nextLine();

        // 执行SQL
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blithexwj","root","2015022136");
            // 获取预编译的数据库操作对象
            stmt = conn.createStatement();
            // 执行SQL语句
            rs = stmt.executeQuery("select ename from emp order by sal " + keyWord);
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
