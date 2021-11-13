package com.blithe;

import com.blithe.dao.StudentDao;
import com.blithe.domain.Student;
import com.blithe.utils.MyBatisUtils;
import com.blithe.vo.QueryParam;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
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
        Student student = dao.SelectStudentById(1005,20);
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
    public void TestSelectMultiObject(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        QueryParam param = new QueryParam();
        param.setParamName("关羽");
        param.setParamAge(20);
        List<Student> students = dao.selectMultiObject(param);
        sqlSession.close();
        for(Student stu : students){
            System.out.println(stu);
        }
    }

    @Test
    public void TestSelectMultiStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Student param = new Student(1003,"张飞","zhangfei@qq.com",20);
        List<Student> students = dao.selectMultiStudent(param);
        sqlSession.close();
        for(Student stu : students){
            System.out.println(stu);
        }
    }

    @Test
    public void TestSelectMultiPosition(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = dao.selectMultiPosition("张飞",20);
        sqlSession.close();
        for(Student stu : students){
            System.out.println(stu);
        }
    }

    @Test
    public void TestSelectMultiByMap(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        Map<String,Object> data = new HashMap<>();
        data.put("myname","张三");
        data.put("age",28);
        List<Student> students = dao.selectMultiByMap(data);
        sqlSession.close();
        for(Student stu : students){
            System.out.println(stu);
        }
    }
}
