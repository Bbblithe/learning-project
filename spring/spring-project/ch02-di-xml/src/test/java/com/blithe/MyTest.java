package com.blithe;

import com.blithe.ba01.Student;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/20 09:42
 * Description:
 */

public class MyTest {
    @Test
    public void test01(){
        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        // 从容器中获取Student对象
        Student myStudent = (Student)ac.getBean("myStudent");
        System.out.println(myStudent);
        Date myDate = (Date)ac.getBean("myDate");
        System.out.println(myDate);
    }

}
