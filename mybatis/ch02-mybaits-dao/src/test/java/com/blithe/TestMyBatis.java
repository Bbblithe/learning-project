package com.blithe;

import com.blithe.dao.StudentDao;
import com.blithe.dao.impl.StudentDaoImpl;
import com.blithe.domain.Student;

import org.junit.Test;

import java.util.List;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/7 15:05
 * Description:
 */

public class TestMyBatis {
    @Test
    public void testSelectStudents(){
        // com.blithe.dao.StudentDao
        StudentDao dao = new StudentDaoImpl();
        /**
         * List<Student> studentList = dao.selectStudent();
         * 1.dao对象，类型是StudentDao,全限定名称是：com.blithe.dao.StudentDao
         *  全限定名称和namespace是一样的
         *
         * 2.方法名称,selectStudent,这个方法就是mapper文件中的id值 selectStudent
         *
         * 3.通过dao中方法的返回值也可以确定MyBatis要调用的SqlSession的方法
         *  如果返回值是list，调用的是SqlSession.selectList()方法
         *  如果返回值 int，或是非List，看mapper文件中的标签是<insert>,<update> 就会调用
         *  SqlSession的insert，update等方法。
         *
         * mybatis的动态代理：mybatis根据dao的方法调用，来获取执行sql语句的信息。
         *  mybatis根据你的接口，创建出一个dao的接口实现类，并创建这个类的对象。
         *  完成SqlSession调用方法，访问数据库。
         */
        List<Student> studentList = dao.selectStudent();
        for(Student stu : studentList){
            System.out.println(stu);
        }
    }

    @Test
    public void testInsertStudent(){
        Student stu = new Student();
        stu.setId(1005);
        stu.setName("关羽");
        stu.setEmail("guanyu@163.com");
        stu.setAge(90);
        StudentDao dao = new StudentDaoImpl();
        int num = dao.insertStudent(stu);
        System.out.println("添加对象的数量" + num);
    }
}
