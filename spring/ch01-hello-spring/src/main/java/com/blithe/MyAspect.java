package com.blithe;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * Author:  blithe.xwj
 * Date:    2022/2/28 21:22
 * Description:
 */

@Aspect
class MyAspect {
    @AfterReturning(value = "execution(* *..*(..))",returning = "res")
    public void myAfterReturning(Object res){
        // Object res:是目标方法执行后的返回值，根据返回值做你的切面的功能处理
        System.out.println("后置通知：在目标方法之后执行，获取的返回值 = " + res);
        // 修改目标方法的返回值
        // res = new Student("nimade"); 不会变，因为这里的res是局部变量，你将一个新的值赋值给了局部变量并不会改变原来doOther返回引用值的结果
        ((Student) res).setName("nimade"); // 会变
    }
}
