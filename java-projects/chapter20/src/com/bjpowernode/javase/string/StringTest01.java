package com.bjpowernode.javase.string;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/12 20:03
 * Description:
 * 关于java JKD中内置的一个类：java.lang.String
 *      1、String表示字符串类型，属于引用数据类型，不属于基本数据类型。
 *      2、在java中随便使用双引号括起来的都是String对象。例如："abc" ,"def" ,"Hello world!",这个是3个String对象
 *      3、java中规定，双引号括起来的字符串，是不可变的，也就是说"abc"自出生到最终死亡，不可变，不能变成"abcd"，也不能变成"ab"
 *      4、在JDK当中双引号括起来的字符串，例如："abc" "def"都是直接存储在"方法区"的"字符串常量池"当中的。
 *       为什么SUN公司把字符串存储在一个"字符串常量池"当中呢。因为字符串在实际的开发中使用太频繁。为了执行效率，
 *       所以把字符串放到方法区的字符串常量池当中。
 */


class StringTest01 {
    public static void main(String[] args) {
        // 这两行代码表示底层创建了3个字符串对象，都在字符串常量池当中。
        String s1= "abcdef";
        String s2= "abcdef" + "xy";

        // 分析：这是使用new的方法创建的字符串对象。这个代码中的"xy"是从哪里来的？
        // 凡是双引号括起来的都在字符串常量池中有一份。
        // new对象的时候一定在堆内存当中开辟空间的。
        String s3= new String("xy");

        // i变量中保存的是100这个值。
        int i= 100;

        // s变量中保存的是字符串对象的内存地址
        // s引用中保存的不是"abc"，是0x123123这样的16进制的内存地址
        // 而0x123123是"abc"字符串对象在"字符串常量次"当中的内存地址。
        String s="abc";
    }
}
