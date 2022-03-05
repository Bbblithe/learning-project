package com.blithe;

/**
 * Author:  blithe.xwj
 * Date:    2022/2/28 21:19
 * Description:
 */

public class Student {
    String name;

    public Student(){
        this.name = "lijiayan ";
    }

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

