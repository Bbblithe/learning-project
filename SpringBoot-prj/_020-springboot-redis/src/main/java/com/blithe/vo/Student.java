package com.blithe.vo;

import java.io.Serializable;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/31 18:49
 * Description:
 */

public class Student implements Serializable {

    private static final long serialVersionUID = -3025036376533785716L;
    private Integer id;
    private String name;
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
