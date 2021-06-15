package com.blithe.service.impl;

import com.blithe.service.HelloService;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/14 16:47
 * Description:
 */

public class HelloServiceImpl implements HelloService {
   @Override
   public void sayHello(String name) {
      System.out.println("您好：" + name);
   }
}
