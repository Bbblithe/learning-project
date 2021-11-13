package com.blithe;


import com.blithe.domain.Student;
import com.blithe.utils.MyBatisUtils;

import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/3 14:59
 * Description:
 */

public class MyApp2 {
    public static void main(String[] args) throws IOException {
        // 【重要】获取SqlSession对象，从SqlSessionFactory中获取
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        // 【重要】指定要执行sql语句的标识。sql映射文件中的namespace + "." + 标签的id值
        String sqlId = "com.blithe.dao.StudentDao" + "." + "selectStudents";
        // 执行sql语句，通过sqlId找到语句
        List<Student> studentList = sqlSession.selectList(sqlId);
        //输出结果
        // jdk8 新特性：forEach循环
         studentList.forEach(student -> System.out.println(student));

        // 关闭sqlSession对象
        sqlSession.close();
    }
}
