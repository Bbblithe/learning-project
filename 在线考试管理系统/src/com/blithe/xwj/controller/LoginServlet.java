package com.blithe.xwj.controller;

import com.blithe.xwj.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName,password;
        int result = 0;
        UserDao dao = new UserDao();
        //1、调用请求对象对请求体使用utf-8字符集进行重新编辑
        request.setCharacterEncoding("utf-8");
        //2、调用请求对象读取请求体中参数信息
        userName = request.getParameter("userName");
        password = request.getParameter("password");
        //3、调用Dao将查询验证信息推送到数据库服务器上
        result = dao.login(userName,password);

        //4、调用响应对象根据验证结果将不同的资源文件地址写入到资源文件的响应头中，交给浏览器
        if(result == 0){ //用户不存在
            response.sendRedirect("login_error.html");
        }else{
            // 在判定来访用户身份合法后，通过请求对象像Tomcat申请为当前用户申请一个HttpSession
            HttpSession session = request.getSession();
            session.setAttribute("userName",request.getParameter("userName"));
            response.sendRedirect("index.html");
        }

    }
}
