package com.blithe.xwj.controller;

import com.blithe.xwj.entity.Question;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

public class ExamServlet extends HttpServlet {
    public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        List<Question> questionList = null;
        int score = 0;

        // 1.从当前用户私人储物柜得到系统提供四道题目信息
        questionList = (List) session.getAttribute("key");

        // 2.从请求包读取用户对于这4道题目给出答案
        for(Question question : questionList){
            String answer = question.getAnswer();
            Integer questionId = question.getQuestionId();
            String userAnswer = request.getParameter("answer_"+questionId);
            // 3.判分
            if(answer.equals(userAnswer)){
                score += 25;
            }
        }


        // 4.将分数写入request,作为共享数据
        request.setAttribute("info",session.getAttribute("userName")+"本次考试成绩:" + score);

        // 5.通过请求转发，调用jsp将用户本次考试分数写入到响应体
        request.getRequestDispatcher("info.jsp").forward(request,response);
    }
}
