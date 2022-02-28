package com.blithe.ba03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

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
     */
    public Object myAround(ProceedingJoinPoint pjp){
        // 实现环绕通知的功能
        return null;
    }
}
