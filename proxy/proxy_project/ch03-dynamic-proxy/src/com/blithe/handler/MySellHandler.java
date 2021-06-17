package com.blithe.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/15 11:31
 * Description:
 */

// 必须实现invocationHandler接口，完成代理类要做的功能(1.调用目标方法，2.功能增强)
public class MySellHandler implements InvocationHandler {
   private Object target = null;

   // 动态代理：目标代理对象是活动,不是固定的，需要传入进来
   // 传入的是谁，就给谁创建代理
   public MySellHandler(Object target){
      // 给目标对象赋值
      this.target = target;
   }
   @Override
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      Object res = null;
      res = method.invoke(target,args);// 执行目标方法

      if(res != null){
         Float price = (Float) res;
         price += 25;
         res = price;
      }
      System.out.println("淘宝店家，给你返回一个优惠卷，或者红包");
      return res;
   }
}
