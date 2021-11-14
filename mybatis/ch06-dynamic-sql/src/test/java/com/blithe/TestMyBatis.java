package com.blithe;

import com.blithe.dao.StudentDao;
import com.blithe.domain.Student;
import com.blithe.utils.MyBatisUtils;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/7 15:05
 * Description:
 */

public class TestMyBatis {
    @Test
    public void TestSelectStudentIf(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student stu = new Student();
//        stu.setName("李四");
//        stu.setAge(18);

//        stu.setName("李四");

        stu.setAge(19);
        List<Student> students = dao.selectStudentIf(stu);
        for(Student student : students){
            System.out.println(student);
        }
    }

    @Test
    public void TestSelectStudentWhere(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student stu = new Student();
        stu.setAge(19);
        stu.setName("李四");
        List<Student> students = dao.selectStudentWhere(stu);
        for(Student student : students){
            System.out.println(student);
        }
    }

    @Test()
    public void testFor(){
        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);

        // String sql = "select * from student where id in(1001,1002,1003)";
        String sql = "select * from student where id in";

        StringBuilder builder = new StringBuilder("");

        int init = 0;
        int leng = list.size();
        builder.append('(');
        for(Integer i :list){
            builder.append(i).append(',');
        }
        // 循环的结尾也需要加入')'
        builder.append(")");
        sql = sql + builder.toString();
        System.out.println(sql);
    }

    @Test
    public void testSelectForeach(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1002);
        list.add(1003);
        List<Student> students = dao.selectForeachOne(list);
        for(Student stu:students){
            System.out.println(stu);
        }
    }
}
