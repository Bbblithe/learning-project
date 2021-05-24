package com.bjpowernode.javase.integer;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/20 19:48
 * Description:
 */


class IntegerTest08 {
    public static void main(String[] args) {
        //String-->int
        int a = Integer.parseInt("134");

        //int-->String
        String b = 0+"";
        String c = String.valueOf(100);

        //int-->integer
        // 手动装箱
        Integer d = new Integer(100);
        // 自动装箱
        Integer d1= 100;

        //integer-->int
        // 手动拆箱
        int e = new Integer(100).intValue();
        // 自动拆箱
        int e1 = new Integer(101);

        //String-->integer
        Integer f = Integer.valueOf("123");

        //integer-->String
        String g = String.valueOf(new Integer(1));
    }
}
