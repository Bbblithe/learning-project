package com.blithe.controller;

import com.blithe.entity.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class OneServlet extends HttpServlet {
    public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
        Student stu = new Student(10,"mike");
        request.setAttribute("key",stu);
        request.getRequestDispatcher("/index_1.jsp").forward(request,response);
    }
}
