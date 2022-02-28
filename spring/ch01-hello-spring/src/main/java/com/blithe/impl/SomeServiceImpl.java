package com.blithe.impl;

import com.blithe.Student;
import com.blithe.service.SomeService;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/20 09:41
 * Description:
 */

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl() {
        System.out.println("someServiceImpl的无参构造方法！");
    }

    @Override
    public void doSome() {
        System.out.println("执行了SomeService的doSome()方法");
    }

    @Override
    public Student doOther(String name){
        System.out.println("doOther方法执行-----------");
        return new Student(name);
    }
}
