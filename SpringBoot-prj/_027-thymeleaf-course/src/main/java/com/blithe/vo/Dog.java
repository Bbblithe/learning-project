package com.blithe.vo;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/7 19:48
 * Description:
 */

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
