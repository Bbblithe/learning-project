package com.bjpowernode.javase.array;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/6 09:48
 * Description:
 *  当一个方法上，参数的类型是一个数组的时候。
 *
 */


public class ArrayTest03 {
    // main方法的编写方法，还可以采用c++的语法格式哦！
    public static void main(String args[]) {
        // java的风格。
        int[] a1={1,23,3};
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
        }

        // C++的写法，不建议
        int a2[]={3,4,2};
        for(int i=0;i<a2.length;i++){
            System.out.println(a2[i]);
        }

        System.out.println("=======================");

        //调用方法时传一个数组
        int[] x={1,2,3,4};
        printArray(x);

        //创建String数组
        String[] strs={"abc","def","hehe","haha"};
        printArray(strs);

        String[] strArray = new String[10];
        printArray(strArray);// 10个null

        System.out.println("=======================");
        printArray(new String[3]);
        System.out.println("**************************");
        printArray(new int[4]);

    }

    public static void printArray(int []array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void printArray(String[] args){
        for(int i=0;i<args.length;i++){
            System.out.println("String数组中的元素："+args[i]);
        }
    }
}
