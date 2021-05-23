package com.blithexwj.controller;

import com.alibaba.fastjson.JSON;
import com.blithexwj.dao.QueryDao;
import com.blithexwj.entity.City;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Author:  andy.xwt
 * Date:    2021/5/11 08:21
 * Description:
 */

public class QueryCityServlet extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{

   }
   protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
       String json = "{}";
       // 获取请求传过来的，省份id
       String strProvinceId = request.getParameter("proid");
       if(strProvinceId != null && !"".equals(strProvinceId)){
           QueryDao dao = new QueryDao();
           List<City> cityList = dao.queryCityList(Integer.valueOf(strProvinceId));
           // 把cityList转换为json数据格式
           json = JSON.toJSONString(cityList);
       }

       // 输出数据
       response.setContentType("application/json;charset=utf-8");
       PrintWriter out = response.getWriter();
       out.print(json);
       out.flush();
       out.close();
   }
}
