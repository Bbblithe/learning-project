package com.blithe.ba03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

/**
 * Author:  blithe.xwj
 * Date:    2022/2/28 14:55
 * Description:
 */

@Aspect
public class MyAspect {
    /**
     * 环绕通知方法的定义的格式
     *  1.public
     *  2.必须有一个返回值，推荐使用Object类型
     *  3.方法名称自定义
     *  4.方法有参数，固定的参数名称 ProceedingJoinPoint
     */

    /**
     // @Around：环绕通知
     *   属性：value 切入点表达式
     *   位置：方法定义上面
     *   特点：
     *      1.功能最强的通知
     *      2.他可以在目标方法的前和后都能增强功能。
     *      3.控制目标方法是否被调用执行
     *      4.修改原来的目标方法的执行结果。影响最后的调用结果
     *
     *  环绕通知，等同于jdk动态代理invocationHandler
     *
     *  参数：ProceedingJoinPoint 就等同于Method，作用是用来执行目标方法的
     *  返回值：就是目标方法的执行结果，可以被修改
     *
     *  环绕通知经常用来做事务，在目标方法之前开启事务，执行目标方法，在目标方法之后提交事务
     */
    @Around(value ="execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable{
        // 实现环绕通知的功能

        String name = "";
        Object args[] = pjp.getArgs();
        if(args != null && args.length >= 1){
            Object arg = args[0];
            name = (String) arg;
        }

        Object result = null;
        System.out.println("环绕通知:在目标方法之前，输入时间" + new Date());
        //1.目标方法的调用
        if("张san".equals(name)){ // 符合条件
            // 调用目标方法
            result = pjp.proceed(); // 等同于jdk动态代理的method.invoke()
        }
        System.out.println("环绕通知：在目标方法之后，提交事务...");

        // 修改目标方法的执行结果，影响方法最后的调用结果
        if(result != null) {
            result = "nimade";
        }
        return result;

        // 2.在目标方法之前或者之后加入功能

    }
}
