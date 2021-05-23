package com.blithe.controller;

import com.blithe.dao.ProvinceDao;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class QueryProvinceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 处理get请求
        String strProid = req.getParameter("proid");
        System.out.println("strProid:" + strProid );

        String provinceName = "默认无数据";
        // 访问dao,查询数据库
        if(strProid != null && !"".equals(strProid.trim())){
            // 调用dao对象
            ProvinceDao dao = new ProvinceDao();
            provinceName = dao.queryProvinceNameById(Integer.valueOf(strProid));
        }

        // 使用HttpResponse输出这个数据
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.print(provinceName);
        out.flush();
        out.close();
    }
}
