package com.bjpowernode.javase.array;

import java.util.Arrays;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/10 22:32
 * Description:
 *  使用一下SUN公司提供的数组工具类：java.util.Arrays;
 */


class ArraysTest01 {
    public static void main(String[] args) {

        int[] arr={213,123,1,23,634,243,2,4};

        // 工具类当中的方法大多数都是静态的。
        Arrays.sort(arr);

        //遍历输出
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
