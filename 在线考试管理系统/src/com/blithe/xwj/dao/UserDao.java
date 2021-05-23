package com.blithe.xwj.dao;

import com.blithe.xwj.entity.User;
import com.blithe.xwj.util.JdbcUtil;
import jakarta.servlet.http.HttpServletRequest;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    // 用户注册
    // JDBC规范中，Connection创建与销毁最浪费时间
    public int add(User user, HttpServletRequest request){
        String sql = "insert into users(userName,password,sex,email) values(?,?,?,?)";

        PreparedStatement ps = JdbcUtil.createStatement(sql,request);
        int result = 0;
        try {
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getSex());
            ps.setString(4, user.getEmail());
            result = ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        } finally{
            JdbcUtil.close(request);
        }
        return result;
    }
    public int add(User user){
        String sql = "insert into users(userName,password,sex,email) values(?,?,?,?)";
        
        PreparedStatement ps = JdbcUtil.createStatement(sql);
        int result = 0;
        try {
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getSex());
            ps.setString(4, user.getEmail());
            result = ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        } finally{
            JdbcUtil.close();
        }
        return result;
    }

    //查询所有用户信息
    public List findAll(){
        String sql = "select * from users";
        PreparedStatement ps = JdbcUtil.createStatement(sql);
        ResultSet rs = null;
        List<User> userList = new ArrayList();
        try {
            rs = ps.executeQuery();
            while (rs.next()) {
                Integer userId = rs.getInt("userId");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                String sex = rs.getString("sex");
                String email = rs.getString("email");
                User user = new User(userId, userName, password, sex, email);
                userList.add(user);
            }
        } catch(SQLException e){
            e.printStackTrace();
        } finally{
            JdbcUtil.close(rs);
        }
        return userList;
    }

    public List findAll(HttpServletRequest request){
        String sql = "select * from users";
        PreparedStatement ps = JdbcUtil.createStatement(sql,request);
        ResultSet rs = null;
        List<User> userList = new ArrayList();
        try {
            rs = ps.executeQuery();
            while (rs.next()) {
                Integer userId = rs.getInt("userId");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                String sex = rs.getString("sex");
                String email = rs.getString("email");
                User user = new User(userId, userName, password, sex, email);
                userList.add(user);
            }
        } catch(SQLException e){
            e.printStackTrace();
        } finally{
            JdbcUtil.close(rs,request);
        }
        return userList;
    }

    // 根据用户编号删除用户信息
    public int delete(String userId) {
        String sql = "delete from users where userId = ?";
        PreparedStatement ps = JdbcUtil.createStatement(sql);
        int result = 0;
        try {
            ps.setInt(1, Integer.valueOf(userId));
            result = ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            JdbcUtil.close();
        }
        return result;
    }

    public int delete(String userId,HttpServletRequest request) {
        String sql = "delete from users where userId = ?";
        PreparedStatement ps = JdbcUtil.createStatement(sql,request);
        int result = 0;
        try {
            ps.setInt(1, Integer.valueOf(userId));
            result = ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            JdbcUtil.close(request);
        }
        return result;
    }

    // 登陆验证
    public int login(String userName, String password) {
        String sql = "select count(*) from users where UserName = ? and password = ? ";
        PreparedStatement ps = JdbcUtil.createStatement(sql);
        ResultSet rs = null;
        int result = 0;
        try {
            ps.setString(1, userName);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while(rs.next()){
                result = rs.getInt("count(*)");
            }

        } catch(SQLException e){
            e.printStackTrace();
        } finally{
            JdbcUtil.close(rs);
        }
        return result;
    }
}
