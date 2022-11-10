package com.blithe.service.impl;

import com.blithe.dao.StudentDao;
import com.blithe.model.Student;
import com.blithe.service.StudentService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/30 11:01
 * Description:
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public Student queryStudent(Integer id) {
        return studentDao.selectById(id);
    }
}
