package com.blithe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/5 18:28
 * Description:
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data","Springboot 打包为jar");
        modelAndView.setViewName("main");
        return modelAndView;
    }

}
