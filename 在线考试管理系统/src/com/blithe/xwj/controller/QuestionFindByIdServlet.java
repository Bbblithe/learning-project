package com.blithe.xwj.controller;

import com.blithe.xwj.dao.QuestionDao;
import com.blithe.xwj.entity.Question;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class QuestionFindByIdServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        Integer questionId;
        QuestionDao dao = new QuestionDao();
        Question question = null;

        // 1.调用请求对象读取请求头中参数信息，得到试题编号
        questionId = Integer.valueOf(request.getParameter("questionId"));

        // 2.调用Dao推送查询命令得到这个试题编号对应的试题信息
        question = dao.findById(questionId,request);

        // 3.调用question_update.jsp将试题信息写入到响应体
        request.setAttribute("key",question);
        request.getRequestDispatcher("/question_update.jsp").forward(request,response);
    }
}
