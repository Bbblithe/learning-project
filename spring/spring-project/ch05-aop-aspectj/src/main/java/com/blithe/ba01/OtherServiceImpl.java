package com.blithe.ba01;

/**
 * Author:  blithe.xwj
 * Date:    2022/2/28 14:41
 * Description:
 */

// 目标类
public class OtherServiceImpl implements SomeService{
    @Override
    public void doSome(String name,Integer age){
        // 给doSome这个方法增加功能在doSome()执行之前，输出方法的执行时间
        System.out.println("======目标方法doSome()=======");
    }

    public void doOther(String name,Integer age){
        System.out.println("======目标方法doOther()======");
    }
}
