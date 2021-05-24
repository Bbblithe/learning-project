package com.bjpowernode.javase.integer;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/20 15:57
 * Description:
 * 总结一下之前所学的经典异常？
 *      空指针异常:NullPointerException
 *      类型转换异常:ClassCastException
 *      数组下标越界异常:ArrayIndexOutOfBoundsException
 *      数字格式化异常:NumberFormatException
 * Integer类当中有哪些常用的方法呢？
 *
 */


class IntegerTest07 {
    public static void main(String[] args) {

        //手动装箱。（已经过时）
        Integer x = new Integer(10000);

        //手动拆箱
        int y = x.intValue();
        System.out.println(y);

        Integer a = new Integer("123");

        // 编译的时候没问题，一切符合java语法，运行时会不会出问题呢？
        // 不是一个"数字"，可以包装成Integer吗？不能。运行时出现异常。
        // java.lang.NumberFormatException
        //Integer b = new Integer("中文");

        // 重点方法
        // static int parseInt(String s)
        // 静态方法，传参String，返回int
        // 网页上文本框中输入的100实际上是"100"字符串。后台数据库中要求存储100数字，此时java程序需要将"100"转化成100数字。
        int retValue = Integer.parseInt("123"); // String -转换-> int
        //int retValue = Integer.parseInt("中文");// NumberFormatException
        System.out.println(retValue+100);

        //照葫芦画瓢
        double retValue2 =  Double.parseDouble("3.14");
        System.out.println(retValue2 + 1); //4.140000000000001（精度问题）

        float retValue3 = Float.parseFloat("1.0");
        System.out.println(retValue3 + 1); //2.0

        //----------------------------------------以下内容仅需要了解，不需要掌握----------------------------------------------
        // static String toBinaryString(int i)
        // 静态的：将十进制转换成二进制字符串。
        String binaryString = Integer.toBinaryString(3);
        System.out.println(binaryString); // "11" 二进制字符串

        // static String toHexString(int i)
        // 静态的：将十进制转换成十六进制字符串。
        String hexString1 = Integer.toHexString(16);
        System.out.println(hexString1); // "10"

        // 十六进制：1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d
        String hexString2 = Integer.toHexString(17);
        System.out.println(hexString2); // "11"

        // static String toOctalString(int i)
        // 静态的：将十进制转换成八进制字符串。
        String octalString = Integer.toOctalString(8);
        System.out.println(octalString); //"10"

        System.out.println(new Object()); // java.lang.Object@23fc625e

        // valueOf方法作为了解
        //static Integer valueOf(int i)
        // 静态的：int-->Integer
        int i1 = Integer.valueOf(100);
        System.out.println(i1);

        //static Integer valueOf(String s)
        // 静态的：String-->Integer
        int i2 = Integer.valueOf("100");
        System.out.println(i2);

    }
}
