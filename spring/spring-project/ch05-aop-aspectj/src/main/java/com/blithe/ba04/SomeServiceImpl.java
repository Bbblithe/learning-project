package com.blithe.ba04;

/**
 * Author:  blithe.xwj
 * Date:    2022/2/28 14:41
 * Description:
 */

// 目标类
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name,Integer age){
        // 给doSome这个方法增加功能在doSome()执行之前，输出方法的执行时间
        System.out.println("======目标方法doSome()=======");
    }

    public String doOther(String name,Integer age){
        System.out.println("======目标方法doOther()======");
        return "abcd";
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("===========业务方法doFirst()=====");
        return "doFirst";
    }

    @Override
    public void doThird() {
        System.out.println("====业务方法doThird()=====");
    }
}
