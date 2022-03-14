package com.blithe.service;

import com.blithe.domain.Student;

import java.util.List;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/7 20:10
 * Description:
 */

public interface StudentService {
    int addStudent(Student student);
    List<Student> findStudents();
}
