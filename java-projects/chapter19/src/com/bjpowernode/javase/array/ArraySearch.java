package com.bjpowernode.javase.array;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/11 21:43
 * Description:
 * 数组的元素查找
 *      数组元素查找的两种方式：
 *          第一种方式：一个一个挨着找，知道找到为止。
 *          第二种方式：二分法查找（算法），这个效率较高。
 *
 */

class ArraySearch {
    public static void main(String[] args) {
        // 这个例子演示一下第一种方式
        int[] arr={4,5,6,81,9};

        // 需求：找出87的下标，如果没有返回-1
        // 一个一个挨着找。
        /*
        for(int i=0;i<arr.length;i++){
            if(arr[i]==87){
                System.out.println("对象字面值为87元素存在，且其下标为"+i);
                return;
            }
            if(i==arr.length-1){
                System.out.println("不好意思，该数组中并不存在字面子为87的元素！");
            }
        }

         */

        // 以上的程序封装一个方法，思考：传什么参数？返回什么值
        // 传什么？：传一个数组，和一个你需要找的字面值
        // 返回值：返回被查找的这个元素的下标。如果找不到返回-1。
        arraySearch(arr,81);
    }

    /**
     * 从数组中检索某个元素的下标（如果该数组中有两个相同的字面值的元素，则返回的是第一个元素的下标）
     * @param arr 被检索的数组
     * @param i 被检索的元素
     * @return 大于等于0的数表示元素的下标，-1表示该元素不存在
     */
    public static int arraySearch(int []arr,int i) {
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] == i) {
                System.out.println("对象字面值为" + i + "的元素存在，且其下标为" + a);
                return a;
            }
        }
        System.out.println("不好意思，该数组中并不存在字面值为" + i + "的元素");
        return -1;
    }

}
