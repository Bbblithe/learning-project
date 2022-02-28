package com.blithe;

import com.blithe.ba01.SomeService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:  blithe.xwj
 * Date:    2022/2/28 19:27
 * Description:
 */

public class MyTest01 {
   @Test
    public void test01(){
       String config = "applicationContext.xml";
       ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
       // 从容器中获取目标对象
       SomeService proxy1 = (SomeService) ctx.getBean("someService");

       // 通过代理的对象执行方法，实现目标方法执行时，增强了功能
       proxy1.doSome("李佳燕",20);
   }
}
