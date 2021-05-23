package com.blithexwj.controller;

import com.alibaba.fastjson.JSON;
import com.blithexwj.dao.QueryDao;
import com.blithexwj.entity.Province;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Author:  andy.xwt
 * Date:    2021/5/9 21:44
 * Description:
 */

public class QueryProvinceServlet extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
      String json = "{}";
      // 调用dao，获取所有的省份信息。是一个List集合
      QueryDao dao = new QueryDao();
      List<Province> provinces =  dao.queryProvinceList();
      // 把这个list转为json格式数据，输出给ajax请求
      if(provinces != null){
         // 调用fastjson工具库实现List转为json
         json = JSON.toJSONString(provinces);
      }

      // 输出json数据，响应ajax请求，返回数据
      response.setContentType("application/json;charset=utf-8");
      PrintWriter out = response.getWriter();
      out.print(json);
      out.flush();
      out.close();
   }
}
