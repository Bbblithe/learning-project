package com.bjpowernode.javase.array;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/6 10:17
 * Description:
 *  当一个方法的参数是一个数组的时候，我们还可以采用这种方式传。
 */


class ArrayTest04 {
    public static void main(String[] args) {
        //静态初始化一维数组
        int[] a={1,2,3};
        printArray(a);

        System.out.println("+++++++++++++++++++++++++++++");
        //没有这种语法
        //printArray({1,2,3,4});
        // 如果直接传递一个静态数组的话，语法必须这样写。
        printArray(new int[]{1,2,3,1234});


        // 动态初始化一维数组
        int a2[]= new int[4];
        printArray(a2);

        System.out.println("==============================");
        printArray(new int[3]);
    }

    // 为什么用静态方法？方便啊，不需要new对象啊。
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
