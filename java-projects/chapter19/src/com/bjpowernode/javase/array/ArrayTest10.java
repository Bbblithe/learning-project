package com.bjpowernode.javase.array;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/6 20:08
 * Description:
 *  关于二维数组的元素的：读和改。
 */


class ArrayTest10 {
    public static void main(String[] args){
        //二维数组
        int[][] a={
                {34,4,65},
                {100,200,39000,111},
                {0}
        };

        //请取出以上二维数组重的第一个一维数组。
        System.out.println(a[0][0]);

        //请取出第2个一维数组当中的第三个元素
        System.out.println(a[1][2]);

        //取出第2个一维数组当中第1个元素
        System.out.println(a[1][0]);

        //改
        a[2][0]=123131;
        System.out.println(a[2][0]);
    }
}
