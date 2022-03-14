package com.blithe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/4 19:00
 * Description:
 */

/**
 * @RequestMapping:
 *  value=表示所有请求地址的公共部分（模块名称）
 *  位置：放在类的上面
 */
@Controller(value = "myController")
@RequestMapping(value = "/user")
public class MyController {

    /**
     * @RequestMapping:请求映射
     *  属性：method，表示请求的方式。它的值是requestMethod的类枚举值。
     *      例如:
     *          表示get请求方式，RequestMethod.GET
     *          表示post请求方式，RequestMethod.POST
     *
     *  当声明方法声明get方式，结果以post方式发送，报错405
     */
    // 指定some.do使用get请求的方式
    @RequestMapping(value ="/some.do",method = RequestMethod.GET)
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎使用Springmvc做开发");
        mv.addObject("fun","执行的是doSome方法");
        mv.setViewName("show");
        return mv;
    }

    // 指定other.do是Post请求方式
    @RequestMapping(value ="/other.do",method = RequestMethod.POST)
    public ModelAndView doOther(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎使用Springmvc做开发");
        mv.addObject("fun","============执行的是doOther方法");

        mv.setViewName("other");

        // 返回mv
        return mv;
    }

    // 不指定请求方式
    @RequestMapping(value ="/first.do")
    public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎使用Springmvc做开发" + request.getParameter("name"));
        mv.addObject("fun","============执行的是doFirst方法======");

        mv.setViewName("other");

        // 返回mv
        return mv;
    }
}
