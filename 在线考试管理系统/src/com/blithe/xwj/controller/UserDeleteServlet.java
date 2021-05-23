package com.blithe.xwj.controller;

import com.blithe.xwj.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class UserDeleteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {
        String userId;
        UserDao dao = new UserDao();
        int result = 0;
        PrintWriter out = null;
        response.setContentType("text/html;charset=utf-8");
        // 1、【调用请求对象】读取【请求头】参数（用户编号）
        userId = request.getParameter("userId");

        // 2、【调用DAO】将用户编号填充到delete命令并发送到数据库服务器上
        Date start = new Date();
        result = dao.delete(userId,request);
        Date end = new Date();
        System.out.println("删除执行时间 " + (start.getTime() - end.getTime())+ "毫秒");
        // 3、【调用响应对象】将处理结果以二进制形式写入响应体中，交给浏览器
        out = response.getWriter();
        if(result == 1){
            out.print("<font style='color:red;font-size:40px;'>用户信息删除成功</font>");
        }else{
            out.print("<font style='color:red;font-size:40px;'>用户信息删除失败</font>");
        }
    }
}
