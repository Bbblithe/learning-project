package com.blithe.ba06;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/21 11:15
 * Description:
 */
@Component("mySchool")
public class School {
    @Value("航空航天大学")
   private String name;
    @Value("成都")
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
