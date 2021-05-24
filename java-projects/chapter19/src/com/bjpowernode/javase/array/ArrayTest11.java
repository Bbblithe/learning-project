package com.bjpowernode.javase.array;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/6 20:19
 * Description:
 *  二维数组的遍历
 */


class ArrayTest11 {
    public static void main(String[] args){

        //二维数组
        String[][] array={
                {"java","oracle","c++","python","c#"},
                {"张三","李四","王五"},
                {"lucy","jack","rose"}
        };

        //遍历二维数组
        for(int i=0;i< array.length;i++){// 负责外层循环3次。(负责纵向)也就是循环一次加一个数组

            for(int a=0;a <array[i].length;a++){//内层循环负责将这个数组的所有元素输出
                System.out.println("第"+(i+1)+"数组的第"+(a+1)+"元素是"+array[i][a]);
            }
            System.out.println("\n");
        }
    }
}
