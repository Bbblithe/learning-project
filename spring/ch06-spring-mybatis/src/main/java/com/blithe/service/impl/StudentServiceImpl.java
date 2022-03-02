package com.blithe.service.impl;

import com.blithe.dao.StudentDao;
import com.blithe.domain.Student;
import com.blithe.service.StudentService;

import java.util.List;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/2 10:21
 * Description:
 */

public class StudentServiceImpl implements StudentService {

    public StudentDao studentDao;

    // 使用set注入来赋值
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int result = studentDao.insertStudent(student);
        return result;
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> students = studentDao.selectStudents();
        return students;
    }
}
