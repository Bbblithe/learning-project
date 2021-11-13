package com.blithe;

import com.blithe.dao.StudentDao;
import com.blithe.domain.MyStudent;
import com.blithe.domain.Student;
import com.blithe.utils.MyBatisUtils;
import com.blithe.vo.ViewStudent;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/7 15:05
 * Description:
 */

public class TestMyBatis {
    @Test
    public void selectStudentById(){
        /**
         * 使用mybaits动态代理的机制，使用sqlSession.getMapper(dao接口)
         * getMapper能够获取dao接口对应的实现类对象。
         */
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        // 调用dao的方法，执行dao数据库的操作
        Student student = dao.SelectStudentById(1005);
        System.out.println(student);
        sqlSession.close();
    }

    @Test
    public void TestSelectMultiParam(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectMultiParam("张飞",54);
        for(Student stu : students){
            System.out.println(stu);
        }
        sqlSession.close();
    }

    @Test
    public void TestSelectStudentReturnViewStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        ViewStudent vs = dao.selectStudentReturnViewStudent(1001);
        System.out.println(vs);
    }

    @Test
    public void TestCountStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        int count = dao.countStudent();
        System.out.println("学生数量：" + count);
    }

    @Test
    public void TestSelectMapById(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Map<Object,Object> map = dao.selectMapById(1001);
        System.out.println("map=== " + map);
    }

    @Test
    public void TestSelectAllStudents(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectAllStudents();
        for(Student stu : students){
            System.out.println(stu);
        }
    }

    @Test
    public void TestSelectDiffcolProperty(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<MyStudent> students = dao.selectDiffColProperty();
        for(MyStudent stu : students){
            System.out.println(stu);
        }
    }
}
