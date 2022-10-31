package com.blithe.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/31 08:47
 * Description:
 */

@RestController
public class MyRestController {

    // 学习注解的使用

    // 查询id = 1001 的学生

    /**
     * @PathVariable:获取url中的数据 属性：value（路径变量名）
     * 位置：放在控制器方法的形参的前面
     * {stuId}:定义路径变量，stuId自定义名称
     */
    @GetMapping("/student/{stuId}")
    public String queryStudent(@PathVariable("stuId") Integer studentId) {
        return "查询学生的id = " + studentId;
    }

    /**
     * 创建资源 POST请求方式
     */
    @PostMapping("/student/{name}/{age}")
    public String createStudent(@PathVariable("name") String name, @PathVariable("age") Integer age) {
        return "创建资源 student: name = " + name + ",age = " + age;
    }

    /**
     * 更新资源
     * <p>
     * 当路径变量名称和形参名一样时，@pathVariable中的value可以不写
     */
    @PutMapping("/student/{id}/{age}")
    public String modifyStudent(@PathVariable Integer id, @PathVariable Integer age) {
        return "更新资源，执行put请求方式： id = " + id + "; age = " + age;
    }

    /**
     * 删除资源
     */

    @DeleteMapping("/student/{id}")
    public String removeStudentById(@PathVariable Integer id) {
        return "删除资源， id = " + id;
    }

    @PutMapping("/student/test")
    // @RequestMapping(value = "/student/test",method = RequestMethod.PUT)
    public String test() {
        return "执行Student/test,使用的请求方式 put";
    }

    @DeleteMapping ("/student/testDelete")
    // @RequestMapping(value = "/student/test",method = RequestMethod.PUT)
    public String testDelete() {
        return "执行Student/testDelete,使用的请求方式 delete";
    }
}
