package com.blithe.service;

import com.blithe.model.Student;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/8 14:38
 * Description:
 */

// Dubbo接口
public interface StudentService {
    int addStudent(Student student);

    Student queryStudent(Integer id);
}
