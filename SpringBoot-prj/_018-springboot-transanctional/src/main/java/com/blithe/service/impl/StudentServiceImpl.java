package com.blithe.service.impl;

import com.blithe.dao.StudentMapper;
import com.blithe.model.Student;
import com.blithe.service.StudentService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/30 16:34
 * Description:
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentDao;

    @Override
    @Transactional
    public Integer insertStudent(Student student) {
        System.out.println("开始插入");
        int row = studentDao.insert(student);
        // int m = 10 /0;
        return row;
    }
}
