package com.blithe;

import com.blithe.ba06.Student;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/20 09:42
 * Description:
 */

public class MyTest06 {
    @Test
    public void test01(){
        // 加载的是总文件
        String config = "ba06/total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        // 从容器中获取Student对象
        Student she = (Student)ac.getBean("myStudent");
        System.out.println(she);
    }
}
