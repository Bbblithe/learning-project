package com.blithe.ba02;

/**
 * Author:  blithe.xwj
 * Date:    2021/12/1 08:16
 * Description:
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myStudent")
public class Student {
   /**
    * value 简单类型赋值
    * 属性：value 是String类型，表示简单类型的属性值
    * 位置：1.在属性定义的上面，无需set方法，推荐使用
    *      2.在set方法的上面
    */
//   @Value("李佳燕")
   @Value("${myname}")
   private String name;
//   @Value("19")
   @Value("${myage}")
   private int age;

   public Student() {
      System.out.println("无参构造的调用");
   }

//   public void setName(String name) {
//      this.name = name;
//   }
//
//   public void setAge(int age) {
//      this.age = age;
//   }

   @Override
   public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", age=" + age +
              '}';
   }
}
