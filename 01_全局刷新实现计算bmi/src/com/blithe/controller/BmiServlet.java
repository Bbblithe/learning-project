package com.blithe.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class BmiServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
        String name = request.getParameter("name");
        String height = request.getParameter("h");
        String weight = request.getParameter("w");

        float h = Float.valueOf(height);
        float w = Float.valueOf(weight);

        // 计算bmi：bmi = 体重/身高的平方
        float bmi = w/(h*h);

        String msg = "";
        // 判断bmi范围
        if(bmi <= 18.5){
            msg = "您太轻了";
        }else if( bmi <= 23.9){
            msg = "您的bmi指数非常正常";
        }else if( bmi <= 27){
            msg = "您的身体比较胖";
        }else {
            msg = "您真是你妈头猪";
        }
        System.out.println("msg = " + msg);

        msg = "您好：" + name + "先生/女生，您的bmi值是：" + bmi + "," + msg;

        // 把数据存入到request
        request.setAttribute("msg",msg);

        // 转发到新的页面
        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }
}
