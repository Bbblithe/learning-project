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

    @RequestMapping(value ="/some.do")
    public ModelAndView doSome(String name,Integer age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        // 显式转发
        System.out.println("执行MyController中的doSome方法");
        mv.setViewName("show");
        return mv;
    }
}
