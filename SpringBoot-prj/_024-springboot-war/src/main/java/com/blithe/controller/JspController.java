package com.blithe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/3 19:07
 * Description:
 */

@Controller
public class JspController {

   @RequestMapping("/main")
   public String main(Model model){
      model.addAttribute("data","Springboot打包为war文件");
      return "index";
   }
}
