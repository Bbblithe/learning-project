package com.blithe.ba02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * Author:  blithe.xwj
 * Date:    2022/2/28 14:55
 * Description:
 */

@Aspect
public class MyAspect {
    /**
     *  后置通知定义方法要求：
     *      1、公共方法 public
     *      2、方法没有返回值
     *      3、方法名称自定义
     *      4、方法有参数
     */


    /**
     // @AfterReturning:后置通知
     *  属性：1.value 切入点表达式
     *      2.returning 自定义的变量，表示目标方法的返回值的。
     *         自定义变量必须和通知方法的形参名一样。
     *  位置：方法定义的上面
     *  特点：
     *      1.在目标方法之后执行的。
     *      2.能够获取到目标方法的返回值，可以根据这个返回值做不同的处理功能
     *      3.可以修改这个返回值
     */
    @AfterReturning(value = "execution(* *..SomeService.doOther(..))",returning = "res")
    public void myAfterReturning(Object res){
        // Object res:是目标方法执行后的返回值，根据返回值做你的切面的功能处理
        System.out.println("后置通知：在目标方法之后执行，获取的返回值 = " + res);
        // 修改目标方法的返回值
        res = (Object) "abcd";
    }

}
