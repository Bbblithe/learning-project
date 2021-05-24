package com.bjpowernode.javase.stringbuffer;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/19 21:21
 * Description:
 * 1、面试题：String为什么是不可变得？
 *      我看过源代码，String类中有一个byte[]数组，这个byte[]数组采用了final修饰，
 *      因为数组一旦创建了长度不可变。并且被final修饰的引用一旦指向某个对象之后，不
 *      可再指向其他对象，所以String是不可变的！
 *      "abc"无法变成"abcd"
 * 2、StringBuilder/StringBuffer为什么是可变的呢？
 *      我看过源代码，StringBuffer/StringBuilder内部实际上是一个byte[]数组，
 *      这个byte[]数组没有被final修饰，StringBuffer/StringBuilder的初始化
 *      容量我记得应该是16，当存满之后会进行扩容，底层调用了数组拷贝的方法
 *      System.arraycopy()...是这样扩容的。所以StringBuilder/StringBuffer
 *      适合用于字符串的频繁拼接操作。
 */


class StringBufferTest04 {
    public static void main(String[] args) {
        // 字符串不可变是什么意思？
        // 是说双引号里面的字符串对象一旦创建不可变。
        String s = "abc";//"abc"放到了字符串常量池当中。"abc"不可变。

        // s变量是可以指向其他对象的。
        // 字符串不可变不是说以上变量s不可变。说的是"abc"这个对象不可变。
        s = "xyz";//"xyz"放到了字符串常量当中。"xyz"不可变。

    }
}
