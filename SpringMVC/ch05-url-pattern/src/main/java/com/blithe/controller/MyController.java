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
     * 处理器方法返回一个String--表示逻辑视图名称，需要配置视图解析器
     */
    @RequestMapping(value ="/some.do")
    public ModelAndView doSome(String name, Integer age){
        System.out.println("doSome name = " + name + "  age = " + age);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        mv.setViewName("show");
        return mv;
    }
}
