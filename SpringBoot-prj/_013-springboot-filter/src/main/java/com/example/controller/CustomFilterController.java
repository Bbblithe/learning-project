package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/30 09:47
 * Description:
 */

@Controller
public class CustomFilterController {

    @RequestMapping("/user/account")
    @ResponseBody
    public String userAccount(){
        return "user/account";
    }

    @RequestMapping("/query")
    @ResponseBody
    public String queryAcoount(){
        return "/query";
    }
}
