package com.blithe;

import com.blithe.dao.StudentDao;
import com.blithe.domain.Student;
import com.blithe.service.StudentService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/2 11:05
 * Description:
 */

public class myTest01 {
    @Test
    public void Test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        System.out.println("spring容器中bean的数量" + ac.getBeanDefinitionCount());
        String Names[] = ac.getBeanDefinitionNames();
        for(String name : Names){
            System.out.println("bean名字 ==== " + name + ac.getBean(name));
        }

    }

    @Test
    public void TestDaoInsert(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 获取Spring容器中的dao对象
        StudentDao dao = (StudentDao)ac.getBean("studentDao");
        int num = dao.insertStudent(new Student(1008,"宋骏","@163.com",21));
//        System.out.println(num);

    }

    @Test
    public void TestServiceImpl(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 获取Spring容器中的Service对象
        StudentService service = (StudentService) ac.getBean("studentService");
        // spring和mybatis整合在一起使用，事务是自动提交的，无需执行SqlSession.commit()
        System.out.println(service.addStudent(new Student(1008,"人小满","renxiao@163.com",20)));
    }

    @Test
    public void TestServiceImplSelect(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 获取Spring容器中的Service对象
        StudentService service = (StudentService) ac.getBean("studentService");
        // spring和mybatis整合在一起使用，事务是自动提交的，无需执行SqlSession.commit()
        List<Student> students = service.queryStudent();
        for(Student student : students){
            System.out.println(student);
        }
    }
}
