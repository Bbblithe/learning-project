package com.blithe.dao;

import com.blithe.domain.Student;
import com.blithe.vo.QueryParam;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/7 14:48
 * Description:
 */

public interface StudentDao {
    /**
     * 简单类型：mybatis吧java中基础数据类型和String都叫做简单数据类型
     * @param id 一个简单类型的参数
     * @return 一个查询到的学生
     *
     * 在mapper文件中获取简单类型的一个参数的值，使用#{任意字符}
     */
    public Student SelectStudentById(@Param("id1")Integer id,@Param("id2")Integer age);

    /**
     * 多个参数： 命名参数，在形参定义的前面加入@Param("自定义参数名称")
     */
    List<Student> selectMultiParam(@Param("myname")String name, @Param("myage") Integer age);

    /**
     * 多个参数，使用java对象作为接口中方法参数
     */
    List<Student> selectMultiObject(QueryParam param);

    List<Student> selectMultiStudent(Student student);

    /**
     * 多个参数-简单类型，按位置传值
     * mybatis 3.4之前，使用#{0},#{1}
     * mybatis 3.4之后，使用#{arg0},#{arg1}
     */
    List<Student> selectMultiPosition(String name, Integer age);

    /**
     * 多个参数，使用map存放多个值
     */
    List<Student> selectMultiByMap(Map<String,Object> map);
}
