package com.blithe.controller;

import com.alibaba.fastjson.JSON;
import com.blithe.dao.ProvinceDao;
import com.blithe.entity.Province;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class QueryJsonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 默认值——，{}：表示json格式的数据{}。
        // 即使用户输入为空，方法也不会报错
        String json = "{}";

        // 获取请求参数，省份id
        String strProid = req.getParameter("proid");

        // 判断proid有值时，调用dao查询数据
        if( strProid != null && strProid.trim().length() > 0){
            ProvinceDao dao = new ProvinceDao();
            Province p = dao.queryProvinceById(Integer.valueOf(strProid));
            // 需要使用fastjson 把 Province对象转换 成json
            json = JSON.toJSONString(p);
        }

        // 把获取的数据，通过网络传给ajax的异步对象，响应结果数据
        // 指定服务器端(servlet)返回给浏览器的是json格式的数据
        resp.setContentType("application/json;charset=utf-8");
        PrintWriter pw = resp.getWriter();
        pw.print(json); // 输出数据---会赋值给ajax中 xmlHttp.responseText属性
        pw.flush();
        pw.close();
    }
}
