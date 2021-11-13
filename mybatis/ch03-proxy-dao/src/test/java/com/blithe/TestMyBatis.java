package com.blithe;

import com.blithe.dao.StudentDao;
import com.blithe.domain.Student;
import com.blithe.utils.MyBatisUtils;

import org.apache.ibatis.session.SqlSession;
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
        /**
         * 使用mybaits动态代理的机制，使用sqlSession.getMapper(dao接口)
         * getMapper能够获取dao接口对应的实现类对象。
         */
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);

        // 调用dao的方法，执行dao数据库的操作
        List<Student> students = dao.selectStudent();
        sqlSession.close();
        for(Student stu:students){
            System.out.println(stu);
        }
    }

    @Test
    public void testInsertStudent(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        int result = dao.insertStudent(new Student(10010,"李飞跃","lfy@163.com",54));

        sqlSession.close();
        System.out.println("添加对象的数量：" + result );
    }
}
