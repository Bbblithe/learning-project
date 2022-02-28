package com.blithe;

import com.blithe.ba05.Student;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/20 09:42
 * Description:
 */

public class MyTest05 {
    @Test
    public void test01(){
        String config = "ba05/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        // 从容器中获取Student对象
        Student she = (Student)ac.getBean("myStudent");
        System.out.println(she);
    }
}
