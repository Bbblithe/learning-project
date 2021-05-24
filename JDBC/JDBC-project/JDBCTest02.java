package JDBC;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/5 09:45
 * Description:
 *      JDBC完成delete
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCTest02 {
    public static void main(String[] args){
        Connection conn = null;
        Statement statement = null;
        try {
            // 1、注册驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            // 2、获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blithexwj","root","2015022136");

            // 3、获取数据库操作对象
            statement = conn.createStatement();

            // 4、执行SQL语句
            //String sql = "delete from dept where deptno = 50";
            // JDBC中的sql语句不需要提供分号结尾。
            String sql = "update dept set dname = '销售部',loc = '天津' where deptno = 20";
            int count = statement.executeUpdate(sql);
            System.out.println(count == 1 ? "删除成功" : "删除失败");

            // 5、处理结果查询集


        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            // 6、释放资源
            try{
                if(statement != null){
                    statement.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }

            try{
                if(conn != null){
                    conn.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
