package com.bjpowernode.javase.enum2; // 标识符，关键字不能够做标识符，enum是关键字。

/**
 * Author:  blithe.xwj
 * Date:    2020/12/21 16:11
 * Description:
 * 这个案例没有使用java中的枚举类型，分析以下程序，在设计方面有什么缺陷？
 *      以下代码可以编译，也可以运行。这些都没有问题。
 *      就是设计上你觉得有什么缺陷？
 */


class EnumTest01 {
    public static void main(String[] args) {
        //System.out.println(10/0);java.lang.ArithmeticException: / by zero
        /*
        int retValue = divide(10,5);
        System.out.println(retValue == 1 ?"计算成功":"计算失败");// 1

        int retValue2 = divide(10,0);
        System.out.println(retValue2 == 1?"计算成功":"计算失败");// 0

         */
        boolean success = divide(10,0);
        System.out.println(success ?"计算成功":"计算失败");
    }

    /**
     * 需求（这是设计者说的话！）：以下程序计算两个int类型数据的商，计算成功返回1，计算失败返回0
     * @param a int类型数据
     * @param b int类型数据
     * @return 返回1 表示成功，返回0 表示失败
     */
    /*
    public static int divide(int a ,int b ){
        try{
            int c = a / b;
            // 程序执行到此处，表示以上代码没有发生异常。表示执行成功！
            return 1;
        } catch (Exception e){
            // 程序执行到此处表示以上程序出现了异常！
            // 表示执行失败！
            return 0;
        }
    }

     */

    // 设计缺陷？在这个方法的返回值类型上。返回一个int不恰当。
    // 既然最后的结果只是成功和失败，最好使用布尔类型。因为布尔类型true和false正好可以表示两种不同的状态。
    /*
    public static int divide(int a ,int b ){
        try{
            int c = a / b;
            // 返回10已经偏离了需求，实际上已经出错了，但是编译器没有编译出来。
            // 我们一直想追求的是：所有的错误尽可能让编译器让编译器找出来，所有的错位越找发现越好！
            return 10;
        } catch (Exception e){
            return 0;
        }
    }

     */
    public static boolean divide(int a ,int b ){
        try{
            int c = a / b;
            return true;
        } catch (Exception e){
            return false;
        }
    }

    /*
    思考：以上的这个方法设计没毛病，挺好，返回true和false表示两种情况，
    但是在以后的开发中，有可能遇到一个方法的执行结果可能包括三种情况，
    四种情况，五种情况不等，但是每一个都是可以数清楚的，一枚一枚都是可以
    列举出来的。这个布尔类型就无法满足需求了。此时需要使用java语言当中的
    枚举类型。
     */
}

