package com.blithe.model;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/5 20:20
 * Description:
 */

public class SysUser {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;

    public SysUser() {
    }

    public SysUser(Integer id, String name, String sex, Integer age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
