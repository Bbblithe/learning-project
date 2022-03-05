package com.blithe.ba01;

/**
 * Author:  blithe.xwj
 * Date:    2021/12/1 08:16
 * Description:
 */

import org.springframework.stereotype.Component;

/**
 * Component 创建对象，等同于<bean>的功能
 *    属性value：就是对象的名称，也就是bean的id值，value的值也是唯一
 *    创建的对象在整个spring的容器中就一个
 *    位置：在类的上面
 *
 *    Component(value = "myStudent")等同于
 *      <bean id="myStudent" class="com.blithe.ba01.Student" />
 *
 * spring中和component功能一致，创建对象的注解还有：
 *    1.@Repository（持久层类）： 放在dao的实现类上面，表示创建dao对象，
 *    dao对象的能访问数据库的
 *    2.@Service（业务层类）：放在service的实现类上面，创建service对象，
 *    service对象是做业务处理，可以有事务等功能的
 *    3.@Controller（控制器）：放在控制器（处理器）类的上面，创建控制器对象，
 *    控制器对象，可以接受用户提交的参数，显示请求的处理结果。
 *    以上三个注解的使用语法和component是一样的，都能够创建对象，但是这三个注解还有额外的功能
 *    Repository Service Controller 是给项目的对象分层的
 *
 */

// 使用value属性，来指定对象的名称
@Component(value = "myStudent")
// 省略value
//@Component("myStudent")

// 不指定对象名称，由spring提供默认名称:类名，且首字母小写
//@Component
public class Student {
   private String name;
   private int age;

   public Student() {
      System.out.println("无参构造的调用");
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setAge(int age) {
      this.age = age;
   }

   @Override
   public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", age=" + age +
              '}';
   }
}
