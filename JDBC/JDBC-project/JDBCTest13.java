package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBC.utils.DBUtil;

/**
 * Author:  blithe.xwj
 * Date:    2021/3/7 20:32
 * Description:
 * 这个程序开启一个事务，这个事务专门进行查询，并且使用行级锁/悲观锁，锁住相关的记录。
 */


class JDBCTest13 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DBUtil.getConnection();
            // 开启事务
            con.setAutoCommit(false);

            String sql = "select ename ,job,sal from emp where job = ? for update ";
            ps = con.prepareStatement(sql);
            ps.setString(1,"manager");

            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("ename") + "," + rs.getString("job") + "," + rs.getString("sal"));
            }

            // 提交事务(事务结束）
            con.commit();
        } catch (SQLException throwables) {
            if(con != null){
                try {
                    // 回滚事务（事务结束）
                    con.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            throwables.printStackTrace();
        } finally {
            DBUtil.close(con,ps,rs);
        }
    }
}
