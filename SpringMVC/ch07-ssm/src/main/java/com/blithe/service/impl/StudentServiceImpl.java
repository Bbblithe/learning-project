package com.blithe.service.impl;

import com.blithe.dao.StudentDao;
import com.blithe.domain.Student;
import com.blithe.service.StudentService;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/7 20:11
 * Description:
 */

@Service
public class StudentServiceImpl implements StudentService {
    // 引用类型的自动注入@Autowired,@Resource
    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student){
        return studentDao.insertStudent(student);
    }

    @Override
    public List<Student> findStudents(){
        return studentDao.selectStudents();
    }

}
