package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/7 10:18
 *  1、需求：
 *          模拟用户登陆功能的实现。
 *      2、业务描述：
 *          程序运行的时候，提供一个输入的入口，可以让用户输入用户名和密码
 *          用户输入用户名和密码之后，提交信息，java程序收集到用户信息
 *          java程序连接数据库验证用户名和密码是否合法
 *          合法：显示登陆成功
 *          不合法：显示登陆失败
 *      3、数据的准备：
 *          在实际开发中，表的设计会使用专业的建模工具，我们这里安装一个建模工具：PowerDesigner
 *          使用PD工具来进行数据库表的设计
 */


class JDBCTestFake06 {
    public static void main(String[] args){
        // 用户登陆界面UI
        Map<String,String> loginInfo =  InitUI();

        // 验证登陆密码
        boolean loginSuccess = login(loginInfo);
        System.out.println(loginSuccess ? "恭喜登陆成功" : "不好意思登陆失败");

    }


    /**
     * 验证所获取登陆信息正误，通过连接数据库来验证
     * @param loginInfo 用户输入信息
     * @return 返回true登陆成功，返回false登陆失败
     */
    private static boolean login(Map<String, String> loginInfo) {
        // 布尔标记
        boolean flag = false;

        // 使用资源绑定器来解耦合
        ResourceBundle bundle = ResourceBundle.getBundle("JDBC/jdbcfaketest");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        Connection conn = null;
        Statement smt = null;
        ResultSet rs = null;
        try {
            // 1、注册驱动
            Class.forName(driver);

            // 2、获取连接
            conn = DriverManager.getConnection(url,user,password);

            // 3、获取数据库操作对象
            smt = conn.createStatement();

            // 4、执行SQL语句
            rs = smt.executeQuery("select * from t_user where loginName = '"+loginInfo.get("loginName")+"' and loginPwd = '"+loginInfo.get("loginPwd")+"'");

            // 5、处理查询结果集
            if (rs.next()) {
                flag = true;
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            // 6、释放资源
            if(rs != null){
                try{
                    rs.close();
                } catch(SQLException e){
                    e.printStackTrace();
                }
            }

            if(smt != null){
                try {
                    smt.close();
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

        return flag;
    }

    /**
     * 用户登陆界面
     * @return 返回用户输入的信息
     */
    private static Map<String, String> InitUI() {
        Scanner s = new Scanner(System.in);
        System.out.print("用户名:");
        String loginName = s.nextLine();
        System.out.print("密码：");
        String loginPwd = s.nextLine();
        Map<String,String> loginInfo = new HashMap<>();
        loginInfo.put("loginName",loginName);
        loginInfo.put("loginPwd",loginPwd);
        return loginInfo;
    }
}
