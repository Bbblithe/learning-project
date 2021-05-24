package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/7 14:02
 * Description:
 * 1、解决SQL注入问题
 *      只要用户提供的信息不参与SQL语句的编译过程，问题就解决了。
 *      即使用户提供的信息中含有SQL语句的关键字，但是没有参与编译，不起作用。
 *      要想用户信息不参与SQL语句的编译，那么必须使用java.sql.PreparedStatement
 *      PreparedStatement继承了java.sql.Statement
 *      PreparedStatement是属于预编译的数据库操作对象。
 *      PreparedStatement的原理是：预先对SQL语句的框架进行编译，然后再给SQL语句传"值"。
 * 2、测试结果：
 *      用户名：fdas
 *      密码：fasa' or '1' = '1
 *      登陆失败
 * 3、解决SQL注入的关键是什么？
 *      用户提供的信息中即使含有sql语句的关键字，但是这些关键字并没有参与编译。不起作用。
 *
 * 4、对比一下Statement和PreparedStatement？
 *      - Statement存在sql注入问题。PreparedStatement解决了SQL注入问题。
 *      - Statement是编译一次执行一次。PreparedStatement是编译一次，可执行N次。PreparedStatement效率较高一些。
 *      - PreparedStatement会再编译阶段做类型的安全检查。
 *
 *      综上所述，PreparedStatement使用较多，只有极少数的情况下需要使用Statement
 * 5、什么情况下必须使用Statement呢？
 *      业务方面要求必须支持SQL注入的时候。
 *      Statement支持SQL注入，凡是业务方面要求是进行sql语句进行拼接的，必须使用Statement。
 */


class JDBCTest07 {
    public static void main(String[] args){
        // 初始化一个界面
        Map<String,String> userLoginInfo =  initUi();
        // 验证用户名和密码
        boolean loginSuccess = login(userLoginInfo);
        System.out.println(loginSuccess ? "登陆成功":"登陆失败");
    }

    /**
     * 用户登陆
     * @param userLoginInfo 用户登陆信息
     * @return false表示失败，true表示成功
     */
    private static boolean login(Map<String, String> userLoginInfo) {
        // 打标记
        boolean flag = false;

        // 单独定义变量
        String loginName = userLoginInfo.get("loginName");
        String loginPwd = userLoginInfo.get("loginPwd");

        // JDBC代码
        Connection conn = null;
        PreparedStatement ps =null;// 这里使用PreparedStatement（预编译的数据库操作对象）
        ResultSet rs = null;
        try{
            // 1、注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2、获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blithexwj","root","2015022136");

            // 3、获取预编译的数据库操作对象
            // SQL语句的框架。其中一个？，表示一个占位符，一个？将来接受一个"值"，注意：占位符不能使用''单引号括起来。
            String sql = "select * from t_user where loginName = ? and loginPwd = ?";
            // 程序执行到此处，会发送sql语句框架给DBMS，然后DBMS进行sql语句的预先编译。
            ps = conn.prepareStatement(sql);
            //给占位符？传值（第一个问号下标是1，第二个问号下标是2，JDBC中所有下标从1开始。）
            ps.setString(1,loginName);
            ps.setString(2,loginPwd);
            // 4、执行SQL
            rs = ps.executeQuery();

            // 5、处理查询结果集
            if(rs.next()){
                flag = true;
            }


        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }

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
        return flag;
    }

    /**
     * 初始化用户界面
     * @return 用户输入的用户名和密码等登陆信息
     */
    private static Map<String,String> initUi() {
        Scanner s = new Scanner(System.in);

        System.out.print("用户名：");
        String username = s.nextLine();

        System.out.print("密码：");
        String password = s.nextLine();

        Map<String,String> userLoginInfo = new HashMap<>();
        userLoginInfo.put("loginName",username);
        userLoginInfo.put("loginPwd",password);
        return userLoginInfo;
    }
}
