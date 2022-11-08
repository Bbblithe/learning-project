package com.blithe.demo.controller;

import com.blithe.model.Student;
import com.blithe.service.StudentService;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/8 15:34
 * Description:
 */

@RestController
public class DubboController {

    @DubboReference(interfaceClass = StudentService.class)
    private StudentService studentService;

    @PostMapping("/student/add")
    public String addStudent(Student student){
        // 对student的数据做验证 , name 需要有值，phone ,age 必须有值
        int result = studentService.addStudent(student);
        String msg = "请稍后处理";
        if(result == 1){
            msg = "添加学生：" + student.getName() + ",成功";
        }else if(result == 2){
            msg = student.getPhone() + ",该电话号码已经被注册";
        }else{
            msg = "手机号为空！";
        }
        return "消费者添加学生 : " + msg ;
    }

    @GetMapping("/student/query")
    public String queryStudent(Integer id){

        String msg = "";
        Student student = null;
        if(id != null && id > 0){
            student = studentService.queryStudent(id);
            if(student != null){
                msg = "查询到的学生信息：" + student.toString();
            }else{
                msg = "没有该学生";
            }
        }else{
            msg = "查询的id 不正确";
        }

        return msg;
    }
}
