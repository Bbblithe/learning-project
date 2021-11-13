package com.blithe.dao;

import com.blithe.domain.MyStudent;
import com.blithe.domain.Student;
import com.blithe.vo.ViewStudent;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/7 14:48
 * Description:
 */

public interface StudentDao {

    public Student SelectStudentById(Integer id);

    List<Student> selectMultiParam(@Param("myname")String name, @Param("myage") Integer age);

    ViewStudent selectStudentReturnViewStudent(@Param("id") Integer id);

    int countStudent();

    // 定义方法返回Map
    Map<Object,Object> selectMapById(Integer id);

    /**
     * 使用resultMap定义映射关系
     */
    List<Student> selectAllStudents();

    List<MyStudent> selectDiffColProperty ();
}
