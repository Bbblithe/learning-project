package com.bjpowernode.javase.string;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/13 16:16
 * Description:
 * 关于String类中的构造方法。
 *  第一个：String s =new String("");
 *  第二个：String s = ""; 最常用
 *  第三个：String s =new String(char数组);
 *  第四个：String s =new String(char数组,起始下标,长度);
 *  第五个：String s =new String(byte数组);
 *  第六个：String s =new String(byte数组,起始下标,长度);
 *  
 */


class StringTest04 {
    public static void main(String[] args) {

        // 创建字符串对象最常用的一种方式
        String s1 = "hello world!";
        // s1这个变量中保存的是一个内存地址。
        // 按理说以下代码应该输出一个地址。
        // 但是输出了一个字符串，说明String类重写toString()方法。
        System.out.println(s1);
        System.out.println(s1.toString());

        // 这里只掌握常用的的构造方法。
        byte[] bytes = {97, 98, 99}; //97是a, 98是b, 99是c 这里的97对应a是因为a的ascii码就是97
        String s2 = new String(bytes);

        // 虽然这里s2是一个引用，但是由于String类中重写了toString方法，所以最后输出的结果不是s2的引用地址，而直接是97，98，99编码后对应的字母。
        // 通过输出结果我们得出一个结论：String类已经重写了toString()方法。
        // 输出字符串对象的话，输出的不是对象的内存地址，而是字符串本身。
        System.out.println(s2.toString());
        System.out.println(s2);

        // String(字节数组，数组元素下标的起始位置，长度)
        // 将byte数组中的一部分转换成字符串。
        String s3 =new String(bytes,1,2);
        System.out.println(s3); //bc

        char[] chars = {'我','是','中','国','人'};

        // 将char数组全部转换成字符串
        String s4 = new String(chars);
        System.out.println(s4);

        // 将char数组的一部分转换成字符串
        String s5 = new String(chars,2,3);
        System.out.println(s5);

        String s6 = new String("hello world");
        System.out.println(s6);
    }
}