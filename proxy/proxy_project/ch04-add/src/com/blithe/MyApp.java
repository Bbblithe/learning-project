package com.blithe;

import com.blithe.handler.MyInvocationHandler;
import com.blithe.service.GonNeng;
import com.blithe.service.HelloService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/17 11:01
 * Description:
 */

class MyApp {
   public static void main(String[] args) {
//      GonNeng gn = new GonNeng();
//      int num = gn.print("销售");
//      System.out.println(num);

      GonNeng gonNeng = new GonNeng();
      InvocationHandler handler = new MyInvocationHandler(gonNeng);

      System.out.println("gonNeng.getClass().getInterface() = " + gonNeng.getClass().getInterfaces()[0].getName());
      HelloService proxy = (HelloService)Proxy.newProxyInstance(gonNeng.getClass().getClassLoader(),gonNeng.getClass().getInterfaces(),handler);
      int num = proxy.print("市场");
      System.out.println("num = " + num);
   }
}
