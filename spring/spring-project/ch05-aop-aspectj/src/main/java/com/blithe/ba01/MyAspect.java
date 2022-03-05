package com.blithe.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * Author:  blithe.xwj
 * Date:    2022/2/28 14:55
 * Description:
 * Aspect注解的作用：是Aspectj框架中的注解，表示当前类是切面类
 * 切面类：用来给业务方法增加功能的类，在这个类中有切面的功能代码
 * 位置：在类定义的上面
 */

@Aspect
public class MyAspect {
    /**
     * 定义方法，方法是实现切面功能的.
     * 方法的定义要求：
     *      1、公共方法 public
     *      2、方法没有返回值
     *      3、方法名称自定义
     *      4、方法可以有参数，也可以无参数
     *      如果有参数，这个参数不是自定义的，有几个参数类型可以使用。
     */

    // @Before：前置通知注解
    //  属性：value，是切入点表达式，表示切面的功能执行的位置。
    // 位置：在方法的上面。 特点：1、在目标方法之前先执行 2、不会改变目标方法的执行结果 3、不会影响目标方法的执行
//    @Before(value = "execution(void *.*(String,Integer))")
//    public void MyBefore(){
//        // 就是你切面执行的功能代码
//        System.out.println("前置通知，切面功能：在目标方法之前输出执行时间(" + new Date() + ")");
//    }

    /**
     * 指定通知方法的参数：JoinPoint
     * JoinPoint：业务方法，要加入切面功能的业务方法
     * 作用：可以在通知方法中获取方法执行时的信息，例如方法名称，方法的实参。
     * 如果你的切面功能中需要用到方法的信息，就加入JoinPoint
     * 这个JointPoint参数的值时框架赋予，必须时第一个位置的参数
     */
    @Before(value = "execution(void *.*(String,Integer))")
    public void MyBefore(JoinPoint jp){
        // 获取方法的完整定义
        System.out.println("方法的定义 = " + jp.getSignature());
        System.out.println("方法的名称 = " + jp.getSignature().getName());
        Object args[] = jp.getArgs();
        for(Object arg : args){
            System.out.println("参数 = " + arg);
        }
        // 就是你切面执行的功能代码
        System.out.println("前置通知，切面功能：在目标方法之前输出执行时间(" + new Date() + ")");
    }
}
