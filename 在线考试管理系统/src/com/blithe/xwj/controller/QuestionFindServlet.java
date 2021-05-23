package com.blithe.xwj.controller;

import com.blithe.xwj.dao.QuestionDao;
import com.blithe.xwj.entity.Question;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionFindServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        QuestionDao dao = new QuestionDao();
        List<Question> questionList = new ArrayList();

        // 1.调用Dao类，获取sql数据库中所有的问题信息,通过请求转发发送到question_show.jsp中
        questionList= dao.findAll(request);

        // 2.通过请求转发，向Tomcat申请调用question_show.jsp处理结果，写入到响应体中
        request.setAttribute("result",questionList); // 将查询结果集写入到请求作用域对象，与question_show.jsp一同展示
        request.getRequestDispatcher("/question_show.jsp").forward(request,response);
    }
}
