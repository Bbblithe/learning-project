package com.blithe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/29 18:46
 * Description:
 */

@Controller
public class BootController {

   @RequestMapping("/hello")
   @ResponseBody
   public String doSome(){
      return "hello SpringBoot应用，设置了端口";
   }
}
