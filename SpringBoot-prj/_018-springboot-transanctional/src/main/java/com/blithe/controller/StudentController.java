package com.blithe.controller;

import com.blithe.model.Student;
import com.blithe.service.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/30 16:37
 * Description:
 */

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/insert")
    @ResponseBody
    public String insertStudent(Integer id,Integer age,String name){
        Student s1 = new Student();
        s1.setId(id);
        s1.setName(name);
        s1.setAge(age);
        return " 插入学生"  + studentService.insertStudent(s1);
    }

}
