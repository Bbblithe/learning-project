package com.blithe.controller;

import com.blithe.vo.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/4 19:00
 * Description:
 */


@Controller(value = "myController")
public class MyController {

    /**
     * 处理器方法返回一个String--表示逻辑视图名称，需要配置视图解析器
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value ="/returnString-view.do")
    public String doReturnView(HttpServletRequest request,String name, Integer age){
        System.out.println("doReturnView,name = " + name);
        // 手工添加数据到request作用域
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);
        // show：逻辑视图名称，项目中配置了视图解析器
        // 框架对视图执行forward转发操作
        return "show";
    }

    // 处理器方法返回String，表示完整视图路径，此时不能配置视图解析器
    @RequestMapping(value ="/returnString-view2.do")
    public String doReturnView2(HttpServletRequest request,String name, Integer age){
        System.out.println("=========-doReturnView2,name = " + name);
        // 手工添加数据到request作用域
        request.setAttribute("myname",name);
        request.setAttribute("myage",age);
        // show：逻辑视图名称，项目中配置了视图解析器
        // 框架对视图执行forward转发操作
        return "/WEB-INF/view/show.jsp";
    }

    // 处理器方法返回void，响应ajax请求
    // 手动实现ajax，json数据：代码有重复的1.java对象转为json；2.通过HttpServletResponse输出json数据
    @RequestMapping(value ="/returnVoid-ajax.do")
    public void doReturnVoidAjax(HttpServletResponse response, String name, Integer age) throws IOException {
        System.out.println("=========-doReturnVoidAjax,name = " + name);
        // 处理ajax，使用json做数据的各所
        // service调用完成，使用student表示处理结果
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        String json = "";
        // 把结果的对象转为json格式的数据
        if(student != null) {
            ObjectMapper om = new ObjectMapper();
            json = om.writeValueAsString(student);
            System.out.println("student转换的json == " + json );
        }

        // 输出数据，响应ajax的请求
        response.setContentType("application/json;charset=utf8");
        PrintWriter writer = response.getWriter();
        writer.println(json);
        writer.flush();
        writer.close();
    }


    /**
     * 处理器方法返回一个student，通过一个框架转为寄json，响应ajax请求
     * @ResponseBody:
     *  作用：把处理器方法返回对象转为json后，通过HttpServletResponse输出给浏览器。
     *  位置：在方法的定义上面，和其他注解没有顺序先后
     * 返回对象框架的处理流程：
     *  1.框架会把返回值Student类型，调用框架中的ArrayList<HttpMessageConverter>中每个类的canWrite()方法
     *    检查哪个HttpMessageConverter接口的实现类能处理Student类型的数据。
     *
     *  2.框架会调用实现类的write方法把李佳燕的student对象转为json，调用jackson的ObjectMapper实现转为json
     *  contentType:application/json;charset=utf-8
     *
     *  3.框架会调用ResponseBody把2的结果数据输出到浏览器，ajax请求处理完成。
     */
    @RequestMapping(value ="/returnStudentJson.do")
    @ResponseBody
    public Student doStudentJsonObject( String name, Integer age) {
        // 调用service，获取请求结果数据，Student对象表示结果数据
        Student student = new Student();
        student.setAge(20);
        student.setName("李佳燕");
        return student;
    }

    /**
     * 处理器方法返回一个List<Student>
     */
    @RequestMapping(value ="/returnStudentJsonArray.do")
    @ResponseBody
    public List<Student> doStudentJsonObjectArray(String name, Integer age) {
        List<Student> list = new ArrayList<>();
        // 调用service，获取请求结果数据，Student对象表示结果数据
        Student student = new Student();
        student.setAge(20);
        student.setName("李佳燕");
        list.add(student);

        student = new Student();
        student.setAge(19);
        student.setName("徐文杰");
        list.add(student);

        return list;
    }

    /**
     * 处理器方法返回的是String，String表示数据的，不是视图
     * 区分返回值String是数据，还是视图，看有没有@ResponseBody注解
     * 如果有@ResponseBody注解，返回String就是数据，反之就是视图
     *
     * 默认使用"text/plain;charset=ISO-8859-1"作为contentType，导致中文有乱码
     * 解决方案：给RequestMapping增加一个属性 produces，使用这个属性指定新的contentType
     */

    @RequestMapping(value = "/returnStringData.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doStringData(String name,Integer age){
        return "Hello SpringMVC 返回对象，表示数据";
    }
}
