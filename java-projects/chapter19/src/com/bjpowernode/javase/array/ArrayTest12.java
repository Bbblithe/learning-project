package com.bjpowernode.javase.array;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/6 20:28
 * Description:
 *  动态初始化二维数组
 */


class ArrayTest12 {
    public static void main(String[] args){

        //3行4列
        //3个一维数组，每个一维数组当中4个元素
        int[][] array=new int[3][4];

        // 二维数组遍历
        /*
        for(int i=0;i<array.length;i++){
            for(int a=0;a<array[i].length;a++){
                System.out.print(array[i][a]+" ");
            }
            System.out.println("\n");
        }

         */

        int[][] a={
                {1,2,3,4},
                {2,5,5,5},
                {1,223,4}
        };

        printArray(a);

        //没有这种语法
        //printArray({{123,12,31,3},{1231,1231,3},{1231}});

        //可以这样写。
        printArray(new int[][]{{231,1231,5,34,6},{2131,53453},{0}});
    }
    public static void printArray(int[][] array) {
        // 遍历二维数组。
        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array[i].length; a++) {
                System.out.print(array[i][a] + " ");
            }
            System.out.println("\n");
        }
    }
}
