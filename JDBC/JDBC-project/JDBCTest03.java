package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/5 15:54
 * Description:
 * 注册驱动的另一种方式(这种方式常用）
 */


public class JDBCTest03 {
    public static void main(String[] args){
        try {
            // 1、注册驱动
            // 这是注册驱动的第一种写法。
            //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            // 注册驱动的第二种方式：常用的。
            // 为什么这种方式常用？因为参数是一个字符串，字符串可以写到xxx.properties文件中。
            // 以下方式不需要接受返回值，因为我们只想用到它的类加载动作
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2、获取连接
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blithexwj","root","2015022136");
            // com.mysql.cj.jdbc.ConnectionImpl@393671df
            System.out.println(connection);
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
