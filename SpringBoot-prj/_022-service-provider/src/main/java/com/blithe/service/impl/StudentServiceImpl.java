package com.blithe.service.impl;

import com.blithe.model.Student;
import com.blithe.service.StudentService;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/1 19:07
 * Description:
 */

/**
 * 使用dubbo中的注解暴露服务
 */
// @Component 可以不用加
@DubboService(interfaceClass = StudentService.class,version = "1.0.0",timeout = 50000)
public class StudentServiceImpl implements StudentService {
    @Override
    public Student queryStudent(Integer id) {
        Student stu = new Student();
        if( 1001 == id){
            stu.setId(id);
            stu.setName("爱上；快点减肥；啊上课交电费；安静 1001 blithe");
            stu.setAge(20);
        }else if(1002 == id){
            stu.setId(id);
            stu.setAge(10);
            stu.setName("1002 andy");
        }
        return stu;
    }
}
