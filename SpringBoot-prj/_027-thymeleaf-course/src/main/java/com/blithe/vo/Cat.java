package com.blithe.vo;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/7 19:48
 * Description:
 */

public class Cat {
   private String name;

   public Cat(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Cat{" +
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
