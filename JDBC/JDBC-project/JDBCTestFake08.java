package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/7 14:42
 * Description:
 */


class JDBCTestFake08 {
    public static void main(String[] args) {
        // 用户再控制台输入desc就是降序，输入asc就是升序
        String order = control();
        act(order);
    }

    private static void act(String order) {
        Connection conn = null;
        Statement sta = null;
        ResultSet rst = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blithexwj","root","2015022136");
            sta = conn.createStatement();
            rst = sta.executeQuery("select * from emp order by sal " + order);
            while (rst.next()){
                System.out.println(rst.getString(1)+ "," + rst.getString(2)+ "," +
                        rst.getString(3) + "," + rst.getString(4) + "," +
                        rst.getString(5) + "," + rst.getString(6) + "," +
                        rst.getString(7) + "," + rst.getString(8));

            }

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        } finally{
            if(rst != null){
                try{
                    rst.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if(sta != null){
                try {
                    sta.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }

            if(conn != null){
                try{
                    sta.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }

    private static String control() {
        Scanner s = new Scanner(System.in);
        System.out.print("输入指令:");
        return s.nextLine();
    }
}
