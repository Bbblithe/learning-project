package com.blithe.model;

import java.io.Serializable;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/1 18:27
 * Description:
 */

public class Student implements Serializable {

    private static final long serialVersionUID = -4656369764916688777L;

    private Integer id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
