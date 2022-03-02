package com.blithe.ba07;

/**
 * Author:  blithe.xwj
 * Date:    2021/12/1 08:16
 * Description:
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "myStudent")
public class Student {

   @Value("李佳燕")
   private String name;
   @Value("19")
   private int age;
   /**
    * 引用类型
    * Resource:来自JDK中的注解，spring框架了提供了这个注解的功能支持，可以使用他给引用类型赋值
    *          使用的也是自动注入远离，支持byName，byType，more是byName
    * 位置：1.在属性定义的上面，无需set方法，推荐使用。
    *      2.在set方法使用
    *
    * resource仅使用byName方式：需要增加一个属性 name
    * name的值是bean的id（名称）
    */

   @Resource(name="mySchool")
   private School school;

   public Student() {
      System.out.println("无参构造的调用");
   }


   @Override
   public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", age=" + age +
              ", school=" + school +
              '}';
   }
}
