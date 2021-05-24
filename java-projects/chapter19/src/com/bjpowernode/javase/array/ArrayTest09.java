package com.bjpowernode.javase.array;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/6 16:29
 * Description:
 *  关于java中的二维数组
 *      1、二维数组其实是一个特殊的一维数组，特殊在这个一维数组当中的每一个元素是一个一维数组。
 *      2、三维数组是什么？
 *          三维数组是一个特殊的二维数组，特殊在这个二维数组当中的每一个元素是一个一维数组。
 *          实际的开发中使用最多的就是一维数组。二维数组也很少使用。三维数组几乎不用。
 *      3、二维数组静态初始化
 *          int[][] array = {{1,1,1},{2,3,4,5,6},{0,0,0,0,0}};
 */


class ArrayTest09 {
    public static void main(String[] args) {
        //一维数组
        int[] array={100,2323,2332};
        System.out.println(array.length);// 3

        //二维数组
        //以下代码中的是4个一维数组。
        int[][] a={
                {100,2000,23},
                {23,25,35,36,7},
                {6,7,7,78,},
                {0}
        };
        System.out.println(a.length);// 4
        System.out.println(a[0].length);// 3
        System.out.println(a[1].length);// 5


        //三维数
    }
}
