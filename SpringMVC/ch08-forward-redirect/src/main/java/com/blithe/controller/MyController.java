package com.blithe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/4 19:00
 * Description:
 */

@Controller(value = "myController")
public class MyController {

    /**
     * 处理器方法返回ModeAndzsView，实现转发forward
     * 语法：setViewName("forward:视图文件完整路径")
     * forward特点：不和视图解析器一同使用，就当视图解析器不存在
     */

    @RequestMapping(value ="/doForward.do")
    public ModelAndView doSome(String name,Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        // 显式转发
        // mv.setViewName("forward:/WEB-INF/view/show.jsp");
        mv.setViewName("forward:/hello.jsp");
        return mv;
    }

    /**
     * 处理器方法返回ModelAndView，实现重定向redirect
     * 语法：setViewName("redirect:视图完整路径")
     * redirect：不和视图解析器一同使用，就当视图解析器不存在
     *
     * 框架对重定向的操作：
     *  1.框架会把Model中的简单类型的数据，转为String使用，作为hello.jsp的get请求参数使用。
     *      目的是在doRedirect.do 和 hello.jsp 这两次请求之间传递数据
     *
     *  2.在目标hello.jsp页面中可以使用参数集合对象${param}获取请求参数值
     *      ${param.myname}
     */
    @RequestMapping(value ="/doRedirect.do")
    public ModelAndView dowithRedirect(String name,Integer age){
        ModelAndView mv = new ModelAndView();
        // 数据放入到request作用域
        mv.addObject("myname",name);
        mv.addObject("myage",age);

        // 重定向
        // mv.setViewName("redirect:/hello.jsp");

        // 重定向不能访问/WEB-INF资源
        mv.setViewName("redirect:/WEB-INF/view/show.jsp");
        return mv;
    }
}
