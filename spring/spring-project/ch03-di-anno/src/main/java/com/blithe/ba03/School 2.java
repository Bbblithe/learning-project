package com.blithe.ba03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/21 11:15
 * Description:
 */
@Component("mySchool")
public class School {
    @Value("内江师范学院")
   private String name;
    @Value("内江")
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
