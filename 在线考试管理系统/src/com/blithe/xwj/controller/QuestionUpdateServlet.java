package com.blithe.xwj.controller;

import com.blithe.xwj.dao.QuestionDao;
import com.blithe.xwj.entity.Question;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class QuestionUpdateServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {
        String title,optionA,optionB,optionC,optionD,answer,questionId;
        QuestionDao dao = new QuestionDao();
        Question question = null;
        int result = 0;

        // 1.调用请求对象读取请求头参数信息
        questionId = request.getParameter("questionId");
        title = request.getParameter("title");
        optionA = request.getParameter("optionA");
        optionB = request.getParameter("optionB");
        optionC = request.getParameter("optionC");
        optionD = request.getParameter("optionD");
        answer = request.getParameter("answer");
        // 2.调用Dao实现更新操作
        question = new Question(Integer.valueOf(questionId),title,optionA,optionB,optionC,optionD,answer);
        result = dao.update(question,request);

        // 3.调用info.jsp将操作结果写入到响应体
        if(result == 1){
            request.setAttribute("info","试题更新成功");
        }else{
            request.setAttribute("info","试题更新失败");
        }
        request.getRequestDispatcher("/info.jsp").forward(request,response);
    }
}
