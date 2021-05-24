package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/5 16:16
 * Description:
 * 将连接数据库的所有信息配置到配置文件中
 * 实际开发中不建议把连接数据库的信息死到java程序中。
 */


public class JDBCTest04 {
    public static void main(String[] args){
        // 使用资源绑定器绑定属性配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("JDBC/jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Connection conn = null;
        Statement statement = null;
        try {
            //String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            conn = DriverManager.getConnection(url,user,password);

            statement = conn.createStatement();

            int count = statement.executeUpdate("insert into dept(deptno,dname,loc) values(71,'管理部1','成都1')");

            System.out.println(count == 1 ? "修改成功":"修改失败");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if(statement != null){
                try{
                    statement.close();
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
