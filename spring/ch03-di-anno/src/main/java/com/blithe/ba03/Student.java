package com.blithe.ba03;

/**
 * Author:  blithe.xwj
 * Date:    2021/12/1 08:16
 * Description:
 */

import org.springframework.beans.factory.annotation.Autowired;
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
   @Value("李佳燕")
   private String name;
   @Value("19")
   private int age;
   /**
    * 引用类型
    * Autowired：spring框架提供的注解，实现引用类型的赋值。
    * spring通过注解给引用类型赋值，使用的是自动注入的原理，支持byName，byType
    * Autowired：默认使用的是byType自动注入
    *
    * 位置：1.在属性的定义的上面，无需set方法，推荐
    *      2.在set方法上
    */
   @Autowired
   private School school;

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
              ", school=" + school +
              '}';
   }
}
