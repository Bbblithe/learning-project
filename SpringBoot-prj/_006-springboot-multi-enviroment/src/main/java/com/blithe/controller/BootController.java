package com.blithe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/29 19:10
 * Description:
 */

@Controller
public class BootController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloSprintBoot(){
        return "你好Springboot";
    }
}
