package com.blithe.xwj.controller;

import com.blithe.xwj.dao.QuestionDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

public class QuestionRandServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        QuestionDao dao = new QuestionDao();
        List questionList = null;
        HttpSession session = request.getSession(false);
        // 1.调用Dao对象随机从question表拿出4道题目
        questionList = dao.findRand(request);

        // 2.将4道题目添加到request作为共享数据
        session.setAttribute("key",questionList);

        // 3.请求转发，申请调用exam.jsp将4道题目写入到响应体
        request.getRequestDispatcher("/exam.jsp").forward(request,response);
    }
}
