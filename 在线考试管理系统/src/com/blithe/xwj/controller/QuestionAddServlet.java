package com.blithe.xwj.controller;

import com.blithe.xwj.dao.QuestionDao;
import com.blithe.xwj.entity.Question;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class QuestionAddServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String title,optionA,optionB,optionC,optionD,answer;
        QuestionDao dao = new QuestionDao();
        Question question = null;
        int result = 0;

        // 1.调用请求对象读取请求信息，得到新增信息内容
        title = request.getParameter("title");
        optionA = request.getParameter("optionA");
        optionB = request.getParameter("optionB");
        optionC = request.getParameter("optionC");
        optionD = request.getParameter("optionD");
        answer = request.getParameter("answer");
        question = new Question(null,title,optionA,optionB,optionC,optionD,answer);

        // 2.调用Dao对象将Insert命令推送到数据库中，并得到处理结果
        result = dao.add(question,request);

        // 3.通过请求转发，向Tomcat索要info.jsp将处理结果写入到响应体
        if(result == 1){
            request.setAttribute("info","试题添加成功");
        }else{
            request.setAttribute("info","试题添加失败");
        }
        request.getRequestDispatcher("/info.jsp").forward(request,response);
    }
}
