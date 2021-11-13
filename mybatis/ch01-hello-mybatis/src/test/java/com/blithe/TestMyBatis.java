package com.blithe;

import com.blithe.domain.Student;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/3 22:07
 * Description:
 */

public class TestMyBatis {
    // 测试方法，测试功能
    @Test
    public void testInsert() throws IOException {
        String config="mybatis.xml";
        // 2.读取这个config表示的文件
        InputStream in = Resources.getResourceAsStream(config);
        // 3.创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 4.创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(in);
        // 5.【重要】获取SqlSession对象，从SqlSessionFactory中获取
        SqlSession sqlSession = factory.openSession(true);
        // 6.【重要】指定要执行sql语句的标识。sql映射文件中的namespace + "." + 标签的id值
        String sqlId = "com.blithe.dao.StudentDao" + "." + "insertStudent";
        // 7.执行sql语句，通过sqlId找到语句
        Student stu = new Student(1010,"关羽","guanyu@qq.com",123);
        int result = sqlSession.insert(sqlId,stu);

        // mybatis 默认不是自动提交事务的，所以在insert，update，delete后要手动提交事务
//        sqlSession.commit();
        System.out.println("执行insert的结果" + result);
        sqlSession.close();
    }
}
