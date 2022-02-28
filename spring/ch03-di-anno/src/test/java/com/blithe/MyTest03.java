package com.blithe;

import com.blithe.ba03.Student;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:  blithe.xwj
 * Date:    2021/12/1 08:30
 * Description:
 */

public class MyTest03 {

   @Test
   public void test02(){
      String config = "applicationContext.xml";
      ApplicationContext context = new ClassPathXmlApplicationContext(config);
      Student stu = (Student)context.getBean("myStudent");
      System.out.println(stu);
   }
}
