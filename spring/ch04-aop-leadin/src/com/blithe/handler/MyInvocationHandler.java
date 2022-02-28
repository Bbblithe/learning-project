package com.blithe.handler;

import com.blithe.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author:  blithe.xwj
 * Date:    2021/12/10 13:49
 * Description:
 */

public class MyInvocationHandler implements InvocationHandler {

    // 目标对象
    private Object target;// SomeServiceImpl类

    public MyInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 通过代理对象执行方法时，会执行invoke()方法
        System.out.println("执行了MyInvocationHandler中的invoke()方法");
        System.out.println("method名称 ：" + method.getName());
        Object result = null;
        ServiceTools.doLog();
        // 执行目标类的方法，通过Method类实现
        result = method.invoke(target,args);// SomeServiceImpl.doOther(),doSome()
        ServiceTools.doTrans();
        return result;
    }
}
