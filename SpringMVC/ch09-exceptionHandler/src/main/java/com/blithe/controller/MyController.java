package com.blithe.controller;

import com.blithe.exception.AgeException;
import com.blithe.exception.MyUserException;
import com.blithe.exception.NameException;

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
    public ModelAndView doSome(String name,Integer age) throws MyUserException {
        ModelAndView mv = new ModelAndView();
        // 根据请求参数，抛出异常
        // 不手动处理异常（try catch),而是将异常交给SpringMVC同一处理
        if("".equals(name)){
            throw new NameException("姓名为空值");
        }

        if(age == null || age>80){
            throw new AgeException("年龄太大，或者为空值");
        }
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        // 显式转发
        // mv.setViewName("forward:/WEB-INF/view/show.jsp");
        mv.setViewName("show");
        return mv;
    }
}
