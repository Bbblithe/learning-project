package com.blithe.ba02;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/21 11:15
 * Description:
 */

public class School {
   private String name;
   private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
