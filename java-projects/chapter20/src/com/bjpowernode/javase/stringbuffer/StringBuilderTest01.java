package com.bjpowernode.javase.stringbuffer;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/17 20:05
 * Description:
 * java.lang.StringBuilder
 * StringBuffer 和 StringBuilder的区别？
 *      StringBuffer中的方法都有：synchronized关键字修饰。表示StringBuffer在多线程环境下运行是安全的。
 *      StringBuilder中的方法没有：synchronized关键字修饰，表示StringBuilder在多线程环境下运行是不安全的。
 *
 *      StringBuffer是线程安全的。
 *      StringBuilder是非线程安全的。
 *  以后的多线程课，会给我们讲解多线程
 */


class StringBuilderTest01 {
    public static void main(String[] args) {

        // 使用StringBuilder也是可以完成字符串的拼接
        StringBuilder sb = new StringBuilder();
        sb.append(100);
        sb.append(true);
        sb.append("hello");
        sb.append("kitty");
        System.out.println(sb);
    }
}
