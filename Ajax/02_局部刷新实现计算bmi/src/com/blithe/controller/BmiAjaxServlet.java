package com.blithe.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class BmiAjaxServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{

        try {
            System.out.println("====Ajax成功发送请求到服务端====");

            // 接收参数
            String strName = request.getParameter("name");
            String weight = request.getParameter("w");
            String height = request.getParameter("h");

            // 计算bmi：bmi = 体重/身高的平方
            float w = Float.valueOf(weight);
            float h = Float.valueOf(height);
            float bmi = w / (h * h);

            String msg = "";
            // 判断bmi范围
            if (bmi <= 18.5) {
                msg = "您太轻了";
            } else if (bmi <= 23.9) {
                msg = "您的bmi指数非常正常";
            } else if (bmi <= 27) {
                msg = "您的身体比较胖";
            } else {
                msg = "您真是你妈头猪";
            }
            System.out.println("msg = " + msg);

            msg = "您好：" + strName + "先生/女生，您的bmi值是：" + bmi + "," + msg;

            // 响应ajax需要的数据，使用HttpServletResponse输出数据
            response.setContentType("text/html;charset=utf-8");
            PrintWriter pw = response.getWriter();
            pw.println(msg);
            pw.flush();
            pw.close();
        }catch(Exception e){
            e.printStackTrace();
            PrintWriter out = response.getWriter();
            out.print("ajax");
        }
    }
}
