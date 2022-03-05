package com.blithe;

import com.blithe.ba03.Student;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/20 09:42
 * Description:
 */

public class MyTest03 {
    @Test
    public void test01(){
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        // 从容器中获取Student对象
        Student she = (Student)ac.getBean("myStudent");
        Student I = (Student)ac.getBean("myStudent2");
        System.out.println(she);
        System.out.println(I);

        File myfile = (File)ac.getBean("myfile");
        System.out.println(myfile.getName());
    }
}
