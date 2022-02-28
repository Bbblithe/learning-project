package com.blithe;

import com.blithe.ba05.Student;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:  blithe.xwj
 * Date:    2021/12/1 16:11
 * Description:
 */

public class MyTest05 {
    @Test
    public void Test01(){
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        Student stu = (Student)context.getBean("myStudent");
        System.out.println(stu);
    }
}
