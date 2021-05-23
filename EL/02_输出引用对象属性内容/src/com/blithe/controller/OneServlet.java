package com.blithe.controller;

import com.blithe.entity.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class OneServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.创建一个引用数据类型对象
        Student student = new Student(20,"allen");

        // 2.将引用数据对象存入到作用域对象作为共享数据
        request.setAttribute("key",student);

        // 3.通过请求转发，向Tomcat申请调用index_1.jsp
        request.getRequestDispatcher("/index_1.jsp").forward(request,response);
    }
}
