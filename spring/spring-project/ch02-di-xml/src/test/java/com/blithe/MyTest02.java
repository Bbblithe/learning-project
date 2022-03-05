package com.blithe;

import com.blithe.ba02.School;
import com.blithe.ba02.Student;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/20 09:42
 * Description:
 */

public class MyTest02 {
    @Test
    public void test01(){
        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        // 从容器中获取Student对象
        Student myStudent = (Student)ac.getBean("myStudent");
        System.out.println(myStudent);
    }

    @Test
    public void test02(){
        System.out.println("===test02===");

        Student student = new Student();
        student.setAge(19);
        student.setName("李佳燕");
        School school =  new School();
        school.setName("内江师范学院");
        school.setAddress("内江");
        student.setSchool(school);

        System.out.println("student=" + student);
    }
}
