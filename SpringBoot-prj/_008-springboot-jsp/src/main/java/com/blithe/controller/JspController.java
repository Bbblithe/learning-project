package com.blithe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/29 19:56
 * Description:
 */

@Controller
public class JspController {

   @RequestMapping("/myjsp")
   public String doJsp(HttpServletRequest request){
      request.setAttribute("data","Springboot使用Jsp");
      return "index";
   }
}
