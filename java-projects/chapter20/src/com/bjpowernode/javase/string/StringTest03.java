package com.bjpowernode.javase.string;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/13 16:13
 * Description:
 * 分析以下程序，一共创建了几个对象
 */


class StringTest03 {
    public static void main(String[] args) {
        /*
        一共三个对象：
            方法区的字符串常量池中有一个:"hello"
            堆内存当中有两个String对象。
            一共3个。
         */
        String s1 =new String("hello");
        String s2 =new String("hello");
    }
}
