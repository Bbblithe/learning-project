package JDBC;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/4 21:59
 * Description:
 */


/*
	JDBC编程六步
*/

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest01{
    public static void main(String[] args){
        Statement stmt = null;
        Connection conn = null;
        try{
            // 1、注册驱动
            Driver driver = new com.mysql.cj.jdbc.Driver();
            // Driver driver = new oracle.jdbc.driver.OracleDriver();  Orcale驱动
            DriverManager.registerDriver(driver);
            // 2、获取连接
            /*
                url:统一资源定位符（网络中某个资源的绝对路径）
                https://www.baidu.com/ 这就是url。
                URL包括哪几部分？
                    协议
                    IP
                    PORT
                    资源名

                http://110.242.68.3/index.html
                    http:// 通信协议
                    182.61.200.7 服务器IP地址
                    80 服务器上软件的端口
                    index.html 是服务器上某个资源名

                jdbc:mysql://127.0.0.1:3306/blithexwj
                    jdbc:mysql://   协议
                    127.0.0.1       IP地址
                    3306    mysql数据库端口号
                    blithexwj 具体的数据库实例名。

                说明：localhost和127.0.0.1都是本机IP地址。

                什么是通信协议？有什么用？
                    通信协议是通信之前就提前定好的数据传送格式。
                    数据包具体怎么传送数据，格式提前定好的。

                Oracle的URL：
                    jdbc:oracle:thin:@localhost:1521:orcl

             */
            String url = "jdbc:mysql://127.0.0.1:3306/blithexwj?serverTimezone=UTC";
            String user = "root";
            String password = "2015022136";
            conn = DriverManager.getConnection(url,user,password);
            // com.mysql.cj.jdbc.ConnectionImpl@61df66b6
            System.out.println("数据库连接对象 = " + conn);

            // 3、获取数据库操作对象
            stmt = conn.createStatement();

            // 4、执行SQL语句
            String sql = "insert into dept(deptno,dname,loc) values(50,'人事部','北京')";
            // 专门执行DML语句的(insert delete update）
            // 返回值是"影响数据库中的记录条数"
            int count = stmt.executeUpdate(sql);
            System.out.println(count == 1 ? "保存成功" : "保存失败");

            // 5、处理查询结果

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            // 6、释放资源
            // 为了保证资源一定释放，在finally语句块中关闭资源
            // 并且遵循从小到大依此关闭
            // 分别对其try...catch
            if(stmt != null){
                try{
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(conn != null){
                try{
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

            /*
            // 这是老师的写法
            try{
                if(stmt != null){
                    stmt.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }

             */
        }
    }
}