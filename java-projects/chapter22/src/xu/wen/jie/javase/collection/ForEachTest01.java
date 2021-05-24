package xu.wen.jie.javase.collection;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/1 09:07
 * Description:
 * JDK5.0之后推出了一个新特性：叫做增强for循环，或者叫做foreach
 */


class ForEachTest01 {
    public static void main(String[] args) {
        // int类型数组
        int[] arr = {45,0,264,3,456,43,56};

        // 遍历数组（普通for循环）
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }

        // 增强for（foreach）
        // 以下是语法
        /*for(元素类型 变量名 : 数组或结合){
            System.out.println(变量名);
        }*/

        System.out.println("=================================");
        // foreach有一个缺点：没有下标。在需要使用下标的循环中，不建议使用增强for循环。
        for(int data : arr){
            // data就是数组中的元素（数组中的每一元素。）
            System.out.println(data);
        }
    }
}
