package com.blithe.controller;

import com.blithe.model.Student;
import com.blithe.service.StudentService;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/2 16:48
 * Description:
 */

@RestController
public class DubboController {
    /**
     * 引用远程服务，把创建好的代理对象，注入给studentService
     */
    // @DubboReference(interfaceClass = StudentService.class,version = "1.0.0")
    /**
     * 没有使用interfaceClass，默认的就是 引用类型的数据类型
     */

    @DubboReference(version="1.0.0")
    private StudentService studentService;

    @GetMapping("/query")
    public String queryStudent(Integer id){
        Student student = studentService.queryStudent(id);
        return "调用远程接口，获取对象：" + student;
    }
}
