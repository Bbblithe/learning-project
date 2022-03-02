package com.blithe.ba05;

/**
 * Author:  blithe.xwj
 * Date:    2021/12/1 08:16
 * Description:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myStudent")
public class Student {

   @Value("李佳燕")
   private String name;
   @Value("19")
   private int age;
   /**
    * 引用类型
    * Autowired：spring框架提供的注解，实现引用类型的赋值。
    * spring通过注解给引用类型赋值，使用的是自动注入的远离，支持byName，byType
    * Autowired：默认使用的是byType自动注入
    *
    *    属性：required，是一个boolean类型的，默认为true
    *       required=true：表示引用类型赋值失败，程序报错，并终止执行。
    *       required=false：表示引用类型即使失败，依然可以正常运行，只不过该引用类型为null
    *
    * 位置：1.在属性的定义的上面，无需set方法，推荐
    *      2.在set方法上
    *
    * 如果使用byName方式，需要做的是：
    *    1.在属性上面加入@Autowired
    *    2.在属性上面加入@Qualifier(value="bean的id")：表示使用指定名称的bean完成赋值
    */

   // byName自动注入
   @Autowired
   @Qualifier("mySchool-1")
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
