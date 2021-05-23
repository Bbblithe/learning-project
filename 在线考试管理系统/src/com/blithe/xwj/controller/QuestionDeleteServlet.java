package com.blithe.xwj.controller;

import com.blithe.xwj.dao.QuestionDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class QuestionDeleteServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Integer id = null;
        QuestionDao dao = new QuestionDao();
        int result = 0;

        // 1.从请求头获取参数信息
        id = Integer.valueOf(request.getParameter("questionId"));

        // 2.使用QuestionDao类的delete方法删除
        result = dao.delete(id,request);

        // 3.使用请求转发，向Tomcat调用info_2.jsp申请处理结果，写入到响应体中
        request.setAttribute("result",result);
        request.getRequestDispatcher("/info_2.jsp").forward(request,response);
    }
}
