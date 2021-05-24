package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/5 18:56
 * Description:
 */


public class JDBCTest05 {
    public static void main(String[] args){
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("JDBC/jdbctest");
            String driver = bundle.getString("driver");
            String url = bundle.getString("url");
            String user = bundle.getString("user");
            String password = bundle.getString("password");
            String sql = bundle.getString("sql");
            //1、注册驱动
            Class.forName(driver);

            //2、获取连接
            conn = DriverManager.getConnection(url,user,password);

            //3、获取操作对象
            sta = conn.createStatement();

            //4、执行SQL语句
            rs = sta.executeQuery(sql);// 专门执行DQL语句的方法
            // int executeUpdate(insert/delete/update)
            // ResultSet executeQuery(select)

            //5、处理查询结果集
            int count = 0;
            System.out.println("|--------------------|\n|empno|ename|sal  |\n|--------------------|");
            long begin = System.currentTimeMillis();
            while (rs.next()) {
                //取数据
                //getString()方法的特点是：不管数据库中的数据类型是什么，都以String的形式取出。
                // 以下程序的columnIndex:1,2,3都是说的第几列。
                /*
                String empno = rs.getString(1);// JDBC中所有下标从1开始。不是从0开始。
                String ename = rs.getString(2);
                String sal = rs.getString(3);
                */

                // 这个不是以列的下标获取，以列的名字获取
                /*
                String empno = rs.getString("编号"); // 重点注意：列名称不是表中的列名称，是查询结果集的列名称。
                String ename = rs.getString("ename");
                String sal = rs.getString("sal");

                 */

                // 除了可以以String类型取出之外，还可以以特定的类型取出。
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                double sal = rs.getDouble("sal");

                System.out.println("|" + empno + " |" + ename + "   |" + (sal+100) + "|");
                System.out.println("|-----|-------|------|");

                count ++;
            }
            long end = System.currentTimeMillis();
            System.out.print("\n" + count + " rows in set" + "("+ ((end - begin)*0.001 < 0.00999999999999 ? "0.00" : (end - begin)*0.001) +" sec)");

        } catch (ClassNotFoundException e ){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            //6、释放资源
            if( rs!= null){
                try{
                    rs.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if(sta != null){
                try{
                    sta.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if(conn != null){
                try{
                    conn.close();
                } catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
