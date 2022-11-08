package com.blithe.model;

import java.io.Serializable;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/8 14:35
 * Description:
 */

public class Student implements Serializable {


    private static final long serialVersionUID = -4656369764916688777L;
    private Integer id;
    private String name;
    private String phone;
    private Integer age;

    public Student(Integer id, String name, String phone, Integer age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public static Student defaultStudent(){
        Student student = new Student();
        student.setId(0);
        student.setName("-");
        student.setPhone("-");
        student.setAge(0);
        return student;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
