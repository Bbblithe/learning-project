package com.blithe.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class OneServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        request.setAttribute("key1","100");
        request.setAttribute("key2",200);

        request.getRequestDispatcher("/index_1.jsp").forward(request,response);
    }
}
