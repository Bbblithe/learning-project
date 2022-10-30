package com.blithe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/30 09:09
 * Description:
 */

@Controller
@RequestMapping("/user")
public class BootController {

   @RequestMapping("/account")
   @ResponseBody
   public String userAccount(){
      return "访问user/account地址";
   }

   @RequestMapping("/login")
   @ResponseBody
   public String userLogin(){
      return "访问user/login地址";
   }
}
