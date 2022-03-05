package com.blithe;

import com.blithe.ba02.SomeService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:  blithe.xwj
 * Date:    2022/2/28 19:27
 * Description:
 */

public class MyTest02 {
   @Test
    public void test01(){
       String config = "applicationContext.xml";
       ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
       // 从容器中获取目标对象
       SomeService proxy = (SomeService) ctx.getBean("someService");
       String str = proxy.doOther("李佳燕" ,20);
      System.out.println(str);
   }
}
