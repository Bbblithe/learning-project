package com.blithe.controller;

import com.blithe.service.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/30 11:02
 * Description:
 */

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/student/qureyId")
    @ResponseBody
    public String queryStudent(Integer id){
        return studentService.queryStudent(id).toString();
    }
}
