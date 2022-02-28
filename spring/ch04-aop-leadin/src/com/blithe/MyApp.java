package com.blithe;

import com.blithe.handler.MyInvocationHandler;
import com.blithe.service.SomeService;
import com.blithe.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Author:  blithe.xwj
 * Date:    2021/12/10 13:58
 * Description:
 */

class MyApp {
   public static void main(String[] args) {
      // 使用jdk的proxy创建代理对象
      // 创建目标对象
      SomeService target = new SomeServiceImpl();

      // 创建InvocationHandler对象
      InvocationHandler handler = new MyInvocationHandler(target);

      // 使用Proxy创建代理
      SomeService proxy = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);

      // 通过代理执行方法，会调用Handler中的invoke()
      proxy.doOther();
   }
}
