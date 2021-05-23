package com.blithe.entity;

public class Student {
    private Integer sid;
    private String name;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(Integer sid, String name) {
        this.sid = sid;
        this.name = name;
    }
}
