package com.blithe.ba01;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/20 20:18
 * Description:
 */

public class Student {
    private String name;
    private int age;

    public void setEmail(String email){
        System.out.println("setEmail= " + email);
    }

    /*
    需要有set方法，没有set方法是报错的
    Bean property 'age' is not writable or has an invalid setter method
     */
    public void setName(String name) {
        System.out.println("调用set方法"
        );
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
