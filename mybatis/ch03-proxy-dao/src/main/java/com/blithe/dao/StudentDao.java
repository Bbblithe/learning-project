package com.blithe.dao;

import com.blithe.domain.Student;

import java.util.List;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/7 14:48
 * Description:
 */

public interface StudentDao {
    List<Student> selectStudent();

    int insertStudent(Student student);
}
