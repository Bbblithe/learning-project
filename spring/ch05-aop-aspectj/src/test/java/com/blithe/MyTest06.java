package com.blithe;

import com.blithe.ba06.SomeService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:  blithe.xwj
 * Date:    2022/2/28 19:27
 * Description:
 */

public class MyTest06 {
   @Test
    public void test01(){
       String config = "applicationContext.xml";
       ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
       // 从容器中获取目标对象
       SomeService proxy = (SomeService) ctx.getBean("someService");

      System.out.println("proxy= " + proxy.getClass().getName());
       proxy.doThird();
   }
}
