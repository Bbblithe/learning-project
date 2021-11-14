package com.blithe.dao;

import com.blithe.domain.Student;

import java.util.List;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/7 14:48
 * Description:
 */

public interface StudentDao {
    // 动态sql，使用java对象作为参数
    List<Student> selectStudentIf(Student student);

    // where使用
    List<Student> selectStudentWhere(Student student);

    List<Student> selectForeachOne(List<Integer> myid);
}
