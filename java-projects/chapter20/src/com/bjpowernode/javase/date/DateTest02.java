package com.bjpowernode.javase.date;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/20 20:38
 * Description:
 * 获取1970年1月1日 00:00:00 000到当前系统时间的总毫秒数。
 * 1秒 = 1000毫秒
 *
 * 简单总结一下System类的相关属性和方法：
 *      System.out 【out是System类的静态变量。】
 *      System.out.println() 【这个println()方法不是System类的，是PrintStream的方法】
 *      System.gc() 建议启动垃圾回收器
 *      System.currentTimeMillis() 获取自1979年1月1日到系统当前时间的总毫秒数。
 *      System.exit(0) 退出JVM。
 */


class DateTest02 {
    public static void main(String[] args){
        // 获取自1970年1月1日 00:00:00 000到当前系统时间的总毫秒数。
        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);//1608468123919（这个数字是变化的）

        // 统计一个方法耗时
        // 在调用目标方法之前记录一个毫秒数
        long begin = System.currentTimeMillis();
        print();
        // 在执行完目标方法之后记录一个毫秒数
        long end = System.currentTimeMillis();
        System.out.println("耗费时长"+(end-begin)+"毫秒");

    }

    // 需求：统计一个方法执行所耗费的时长
    public static void print(){
        for(int i =0;i<1000000000;i++){
            System.out.println("i="+i);
        }
    }
}
