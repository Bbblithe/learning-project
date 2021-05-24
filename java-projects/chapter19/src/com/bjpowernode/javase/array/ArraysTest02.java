package com.bjpowernode.javase.array;

import java.util.Arrays;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/12 19:22
 * Description:
 * 好消息：
 *  SUN公司已经为我们程序员写好了一个数组工具类。
 *  java.util.Arrays;
 */


class ArraysTest02 {
    public static void main(String[] args) {
        // java.util.Array; 工具类中有哪些方法，我们开发的时候需要参加API帮助文档
        // 不要死记硬背。
        int[] arr ={2,23,23,1,4,12,4,25235345,3};
        // 排序
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //二分法查找(建立在排序基础之上)

        int index =Arrays.binarySearch(arr,5);
        System.out.println("----------------------------");
        // 这里之所以判断小于0 是由于调用该方法的时候发现源码上返回的值是return -(low-1)
        // 视频中老师的源码 的return -1;
        System.out.println(index <0 ?"该元素不存在":"该元素存在，且该元素下标为"+index);
    }
}
