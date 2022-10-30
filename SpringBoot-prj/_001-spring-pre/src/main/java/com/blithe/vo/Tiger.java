package com.blithe.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/29 09:31
 * Description:
 */

@Component("tiger")
public class Tiger {
   @Value("${tiger.name}")
   private String name;
   @Value("${tiger.age}")
   private Integer age;

   @Override
   public String toString() {
      return "Tiger{" +
              "name='" + name + '\'' +
              ", age=" + age +
              '}';
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
