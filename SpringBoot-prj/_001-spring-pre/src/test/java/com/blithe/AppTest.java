package com.blithe;

import com.blithe.config.SpringConfig;
import com.blithe.vo.Cat;
import com.blithe.vo.Student;
import com.blithe.vo.Tiger;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * 使用xml作为容器配置文件
     */
    @Test
    public void test01() {
        String config = "bean.xml";
        ApplicationContext ctx  =  new ClassPathXmlApplicationContext(config);
        Student student = (Student) ctx.getBean("myStudent");
        System.out.println("容器中的对象" + student);
    }

    /**
     * 使用javaConfig
     */
    @Test
    public void test02(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println((Student)ctx.getBean("createStudent"));
    }

    @Test
    public void test03(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println((Student)ctx.getBean("andy"));
    }

    @Test
    public void test04(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println((Cat)ctx.getBean("myCat"));
    }

    @Test
    public void test05(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println((Tiger)ctx.getBean("tiger"));
    }
}
