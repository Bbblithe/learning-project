package com.blithe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/5 19:48
 * Description:
 */

@Controller
public class HelloThymeleafController {

    @RequestMapping("/hello")
    public String helloThymeleaf(Model model ,HttpServletRequest request){
        // 添加数据到request作用域，模版引擎可以从request中获取数据
        request.setAttribute("data","欢迎使用thymeleaf模版引擎");

        // model存放数据
        model.addAttribute("mydata","model中存放的数据");

        // 指定视图（模版引擎使用的页面(html)）
        // 逻辑名称
        return "hello";
    }
}
