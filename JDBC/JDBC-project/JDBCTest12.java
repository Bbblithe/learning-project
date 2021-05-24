package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBC.utils.DBUtil;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/7 19:49
 * Description:
 * 这个程序两个任务：
 *      第一：测试DBUtil是否好用
 *      第二：模糊查询怎么写？
 */


class JDBCTest12 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // 获取连接
            conn = DBUtil.getConnection();
            // 获取预编译的数据库操作对象

            // 错误的写法
            /*
            String sql = "select ename from emp where ename like '_?%'";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"A");
             */

            String sql = "select ename from emp where ename like ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"_A%");
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("ename"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally{
            DBUtil.close(conn,ps,rs);
        }
    }
}
