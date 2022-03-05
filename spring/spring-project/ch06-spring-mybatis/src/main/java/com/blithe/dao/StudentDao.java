package com.blithe.dao;

import com.blithe.domain.Student;

import java.util.List;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/1 21:11
 * Description:
 */

public interface StudentDao {
    int insertStudent(Student student);
    List<Student> selectStudents();
}
