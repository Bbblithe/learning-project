package com.blithe.xwj.controller;

import com.blithe.xwj.dao.UserDao;
import com.blithe.xwj.entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class UserFindServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        UserDao dao = new UserDao();
        PrintWriter out = null;

        // 1、[调用DAO]将查询命令推送到数据库服务器上，得到所有用户信息【List】
        Date start = new Date();
        List<User> userList = dao.findAll(request);
        Date end = new Date();
        System.out.println(end.getTime() - start.getTime());

        // 2、[调用响应对象]将用户信息结合<table>标签命令以二进制形式写入到响应体
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        out.print("<table border='2px' align='center'>");
        out.print("<tr>");
        out.print("<td>用户编号</td>");
        out.print("<td>用户名称</td>");
        out.print("<td>用户密码</td>");
        out.print("<td>用户性别</td>");
        out.print("<td>用户邮箱</td>");
        out.print("<td>操作</td>");
        out.print("</tr>");
        for(User user : userList){
            out.print("<tr>");
            out.print("<td>"+user.getUserId()+"</td>");
            out.print("<td>"+user.getUserName()+"</td>");
            out.print("<td>******</td>");
            out.print("<td>"+user.getSex()+"</td>");
            out.print("<td>"+user.getEmail()+"</td>");
            out.print("<td><a href='/myWeb/user/delete?userId="+user.getUserId()+"'>删除用户</a></td>");
            out.print("</tr>");
        }
        out.print("</table>");
    }
}
