package com.blithe;

import com.blithe.ba01.Student;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:  blithe.xwj
 * Date:    2021/12/1 08:30
 * Description:
 */

public class MyTest01 {
   @Test
    public void test01(){
       String config = "applicationContext.xml";
       ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
       // 从容器中获取对象
       Student stu = (Student)ctx.getBean("student");
       System.out.println(stu);
   }

}
