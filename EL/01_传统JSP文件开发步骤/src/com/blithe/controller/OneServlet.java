package com.blithe.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class OneServlet extends HttpServlet {
    public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {

        // 1.分别将共享数据添加到作用域对象
        ServletContext application = request.getServletContext();
        HttpSession session = request.getSession();

        application.setAttribute("sid",10);
        session.setAttribute("sname","mike");
        request.setAttribute("home","天府新区");

        // 2.通过请求转发方式，向Tomcat申请调用index_1.jsp，由index_1.jsp负责将作用域对象数据读取并写入到响应体中
        request.getRequestDispatcher("/index_1.jsp").forward(request,response);
    }
}
