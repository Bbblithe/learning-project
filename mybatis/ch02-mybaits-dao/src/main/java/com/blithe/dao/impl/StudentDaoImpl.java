package com.blithe.dao.impl;

import com.blithe.dao.StudentDao;
import com.blithe.domain.Student;
import com.blithe.utils.MyBatisUtils;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/7 15:01
 * Description:
 */

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudent() {
        // 获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.blithe.dao.StudentDao.selectStudent";
        // 执行sql语句
        List<Student> students = sqlSession.selectList(sqlId);
        sqlSession.close();
        return students;
    }

    @Override
    public int insertStudent(Student student) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        String sqlId = "com.blithe.dao.StudentDao.insertStudent";
        int i = sqlSession.insert(sqlId,student);
        // 提交事务
        sqlSession.commit();
        sqlSession.close();
        return i;
        }
}
