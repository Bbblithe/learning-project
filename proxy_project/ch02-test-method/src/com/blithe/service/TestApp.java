package com.blithe.service;

import com.blithe.service.impl.HelloServiceImpl;
import com.blithe.service.impl.HelloServiceImpl2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/14 16:48
 * Description:
 */

class TestApp {
   public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      // HelloService service = new HelloServiceImpl();
      // service.sayHello("张三");

      // 使用反射机制执行sayHello方法。核心Method（类中的方法）
      HelloService target = new HelloServiceImpl();
      // 获取sayHello，名称对应的Method类对象
      Method method = HelloService.class.getMethod("sayHello",String.class);
      // 通过method可以执行sayHello方法调用
      /*
         invoke是Method类中的一个方法，表示执行方法的调用
         参数：
            1.Object obj：表示对象，表示需要执行这个对象的方法
            2.Object...args：方法执行时的参数值
         返回值：
            Object：方法执行后的返回值
       */
      // method.invoke表达的意思就是执行target对象的sayHello()，参数是"里斯"
      HelloService service2 = new HelloServiceImpl2();
      Object ret = method.invoke(service2,"里斯");
   }
}
