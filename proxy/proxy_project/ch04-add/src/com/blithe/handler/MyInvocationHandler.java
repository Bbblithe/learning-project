package com.blithe.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/17 11:03
 * Description:
 */

public class MyInvocationHandler implements InvocationHandler {
   Object target = null;

   public MyInvocationHandler(Object target){
      this.target = target;
   }

   @Override
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      // 我在项目中记录数据库
      // 功能加强

      // 调用目标方法，执行print()得到
      Object res = method.invoke(target,args); // 2

      // 需要乘以2的结果
      if(res != null){
         Integer num = (Integer)res;
         res = num * 2;
      }
      return res;
   }
}
