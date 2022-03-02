package com.blithe;

import com.blithe.ba05.SomeServiceImpl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:  blithe.xwj
 * Date:    2022/2/28 19:27
 * Description:
 */

public class MyTest05 {
   @Test
    public void test01(){
       String config = "applicationContext.xml";
       ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
       // 从容器中获取目标对象
       SomeServiceImpl proxy = (SomeServiceImpl) ctx.getBean("someService");

      /**
       * 当目标类没有接口，使用cglib进行动态代理，spring会自动应用cglib
       * 代理名称：com.blithe.ba05.SomeServiceImpl$$EnhancerBySpringCGLIB$$1ed8b59c
       */
      System.out.println("proxy= " + proxy.getClass().getName());
       proxy.doThird();
   }
}
