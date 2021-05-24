package com.bjpowernode.javase.random;

import java.util.Random;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/21 08:57
 * Description:
 * 编写程序，生成5个不重复的随机数[0-100]。重复的话重新生成。
 * 最终生成的5个随机数放到数组中，要求数组中这5个随机数不重复。
 */


class RandomTest02 {
    public static void main(String[] args) {
        // 创建random对象
        Random random = new Random();

        // 准备一个长度为5的一维数组(下面的for循环是为了区别生成的随机数0和默认动态初始化的数组，避免不好区分！)
        int []arr = new int[5]; // 这里的默认值都是0
        for(int i = 0 ;i < arr.length; i++){
            arr[i] = -1;
        }
        // 循环，生成随机数
        int index = 0;
        while(index < arr.length){
            // 生成随机数
            //int num1= random.nextInt(5);// 只能生成【0-4】的随机数。用来检验是否会重复！
            //int num1 = random.nextInt(4);// 只能生成[0-3]的随机数，他一共只有一个4个元素，第5个元素怎么随机都会死循环
            int num1 = random.nextInt(5);
            System.out.println("生成的随机数"+num1);
            // 判断arr数组中有没有这个num
            // 如果没有这个num，就放进去。
            if(!contains(arr,num1)){
                arr[index++] = num1;
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    /**
     * @param arr 数组
     * @param key 所找元素
     * @return true包含，flase不包含
     */
    public static boolean contains(int []arr,int key){
        // 这个方案有bug。（排序出问题。）
        // 对数组进行升序
        //Arrays.sort(arr);
        // 进行二分法查找
        // 如果找到了就返回true，没找到就返回false
        //return Arrays.binarySearch(arr,key)>=0;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
}
