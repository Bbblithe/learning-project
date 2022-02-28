package com.blithe.ba03;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/20 20:18
 * Description:
 */

public class Student {
    private String name;
    private int age;

    public Student(String name, int age, School school) {
        System.out.println("有参构造调用");
        this.name = name;
        this.age = age;
        this.school = school;
    }

    // 声明一个引用类型
    private School school;

    public void setSchool(School school) {
        this.school = school;
    }

    public void setName(String name) {
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
                ", school=" + school +
                '}';
    }
}
