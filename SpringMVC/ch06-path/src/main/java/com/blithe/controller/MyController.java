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

    @RequestMapping(value ="/user/some.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎使用Springmvc做开发");
        mv.addObject("fun","执行的是doSome方法");
        mv.setViewName("/index.jsp");
        return mv;
    }
}
