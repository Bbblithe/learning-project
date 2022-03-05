package com.blithe.ba04;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Author:  blithe.xwj
 * Date:    2022/2/28 14:55
 * Description:
 */

@Aspect
public class MyAspect {

    @After(value = "mypt()")
    public void myAfter(){
        System.out.println("执行最终通知，总是会被执行的代码！");
    }

    @Before(value ="mypt()")
    public void myBefore(){
        System.out.println("前置通知，在目标方法之前先执行的");
    }

    /**
     * @Pointcut：定义和管理切入点，如果你的项目中有多个切入点表达式是重复的，可以复用的
     *          可以使用PointCut进行定义
     * 属性：value 切入点表达式
     * 位置：在自定义的方法的上面
     * 特点：当使用了@PointCut定义在一个方法的上面，此时这个方法的名称就是切入点表达式的别名。
     *      其他的通知中，value属性就可以使用这个方法名称，来代替切入点表达式
     */
    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    private void mypt(){
        // 无需代码
    }
}
