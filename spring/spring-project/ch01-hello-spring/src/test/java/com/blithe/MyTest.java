package com.blithe;

import com.blithe.impl.SomeServiceImpl;
import com.blithe.service.SomeService;

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
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }


    /**
     * spring默认创建对象的时间：在创建spring的容器时，会创建配置文件中所有的对象
     * spring创建对象：默认调用的是无参构造
     */
    @Test
    public  void test02(){
        // 使用spring容器创建的对象
        // 1.指定spring配置文件的名称
        String config = "beans.xml";
        // 2.创建表示spring容器的对象，ApplicationContext
        // ApplicationContext就是表示Spring容器，通过容器获取对象
        // ClassPathXmlApplicationContext：表示从类路径（target目录中的classes）中加载spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        // 从容器中获取某个对象，你要调用对象的方法
        // getBean("配置文件中的bean的id值");
        SomeService service = (SomeService)ac.getBean("someService");

        // 使用spring创建好的对象
        service.doSome();
    }

    /**
     * 获取spring容器中java对象的信息
     */
    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 使用spring提供的方法，获取容器中定义的对象的数量
        int number = ac.getBeanDefinitionCount();
        System.out.println(number);
        // 容器中每个定义的对象的名称
        String names[] = ac.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
    }
    // 获取一个非自定义的类对象
    @Test
    public void test04(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date my = (Date)ac.getBean("mydate");
        System.out.println(my);
    }

    @Test
    public void test05(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService proxy = (SomeService) ac.getBean("someService");
        Student stu = proxy.doOther("blithe");
        System.out.println(stu);
    }
}
