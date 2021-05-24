package com.bjpowernode.javase.integer;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/19 20:23
 * Description:
 *
 * 好消息：在JDK1.5之后（在java5之后），引入了一种新特性，自动拆箱和自动装箱。
 *  自动装箱：基本数据类型自动转换成包装类。
 *  自动拆箱：包装类自动转换成基本数据类型。
 *
 *  有了自动拆箱之后，Number类中的方法就用不着了！
 *
 *  自动装箱和自动拆箱的好处？
 *      方便编程。
 */


class IntegerTest05 {
    public static void main(String[] args) {

        // 900是基本数据类型
        // a是包装类型
        // 基本数据类型-(自动转换)->包装类型：自动装箱
        Integer a = 900;
        System.out.println(a);

        // a是包装类型
        // b是基本数类型。
        // 包装类型-(自动转换)->基本数据类型：自动拆箱
        int b = a;
        System.out.println(b);

        //z是一个引用，z是一个变量，z还是保存的一个对象的内存地址。
        Integer z = 1000; // 等同于：Integer z =new Integer(1000);
        // 分析这个为什么没有报错呢？
        // +两边要求是基本数据类型的数字，z是包装类，不属于基本数据类型，这里会进行自动拆箱。将z转换成基本数据类型
        // 在java5之前你这样写肯定编译器报错。
        System.out.println(z+1);

        Integer x = 1000; // Integer x = new Integer(1000); x是一个引用，保存内存地址指向对象。
        Integer y = 1000; // Integer y = new Integer(1000); y也是一个引用，保存内存地址指向对象。
        // == 比较的是对象的内存地址。x和y两个引用中保存的对象内存地址不同。
        // == 这个运算符不会触发自动拆箱机制.（+ - * / 等运算才会。）
        System.out.println(x==y); //false

        // 这里弹幕讲了Integer在128以下，不会创建对象。
        Integer i = 3;
        Integer o = 3;
        System.out.println(i==o);// true
    }
}
