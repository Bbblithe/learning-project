package com.blithe.controller;

import com.blithe.domain.Student;
import com.blithe.service.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import javax.annotation.Resource;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/7 20:20
 * Description:
 */

@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    // 注册学生
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student){
        String tips = "注册失败!";
        ModelAndView mv = new ModelAndView();

        // 调用Service来处理student
        int nums  = studentService.addStudent(student);
        if(nums > 0){
            // 注册成功
            tips = "学生【" + student.getName() + "】注册成功!";
        }
        // 指定结果页面
        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }

    // 处理查询，响应ajax
    @RequestMapping("/queryStudents.do")
    @ResponseBody
    public List<Student> queryStudent(){
        // 参数检查,简单的一些数据处理
        return studentService.findStudents();
    }
}
