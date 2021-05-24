package com.bjpowernode.javase.array;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/6 13:47
 * Description:
 *
 *  main方法上面的"String[] args"有什么用？
 *      分析v一下：谁调用main方法(JVM)
 *      JVM调用main方法的时候，会自动传一个String数组过来。
 */


class ArrayTest05 {
    //这个方法程序员负责写出来，JVM负责调用。JVM调用的时候一定会传一个String数组过来
    public static void main(String[] args) {

        // JVM默认传递的这个数组对象的长度？默认0
        // 通过测试得出：args不是null。
        System.out.println("JVM给传递过来的数组参数，他这个数组的长度是多少？"+args.length);

        // 以下注释代码表示的含义：数组对象创建了，但是数组中没有任何数据。
        //String[] args1=new String[0];
        //printLength(new String[0]);

        // 这个数组什么时候里面会有值呢？
        // 其实这个数组是留给客户的，用户在控制台上输入参数，这个参数自动会被转换为"String[] args"
        // 例如这样运行程序：java ArrayTest05 abc def xyz
        // 那么这个时候JVM会自动将abc def xyz 通过空格的方式进行分离，分离完成之后，自动放到"String[] args"数组当中。
        // 所以main方法上面的String[] args数组主要是用来接受用户输入参数的。
        // abc def xyz 转换成字符串数组：{"abc","def","xyz"}
    }

    public static void printLength(String[] args){
        System.out.println(args.length);
    }
}
