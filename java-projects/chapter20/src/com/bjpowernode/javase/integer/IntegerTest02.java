package com.bjpowernode.javase.integer;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/17 20:37
 * Description:
 * 1、8种基本数据类型对应的包装类型名是什么？
 *      基本数据类型              包装类型
 *      —————————————————————————————————————
 *      byte                    java.Lang.Byte(父类Number)
 *      short                   java.Lang.Short(父类Number)
 *      int                     java.Lang.Integer(父类Number)
 *      long                    java.Lang.Long(父类Number)
 *      double                  java.Lang.Double(父类Number)
 *      float                   java.Lang.Float(父类Number)
 *      boolean                 java.Lang.Boolean(父类Object)
 *      char                    java.Lang.Character(父类Object)
 *
 * 2、以上八种包装类中，重点以java.Lang.Integer为代表进行学习，其他的类型照葫芦画瓢就行。
 *
 * 3、八种包装类中其中6个都是数字对应的包装类，他们的父类都是Number，可以先研究一下Number中公共的方法：
 *      Number是一个抽象类，无法实例化对象。
 *      Number这个类中有这样的方法：
 *          byte byteValue()以byte 形式返回指定的数值。
 *          abstract double doubleValue()以double 形式返回指定的数值。
 *          abstract float floatValue()以float 形式返回指定数值。
 *          abstract int intValue()以int 形式返回指定的数值。
 *          abstract long longValue()以long 形式返回指定的数值。
 *          short shortValue()以short 形式返回指定的数值。
 *          这些方法其实所有的数字包装类的子类都有，这些方法是负责拆箱的。
 */


class IntegerTest02 {
    public static void main(String[] args) {
        // 123这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型的转换。
        // 基本数据类型-(转换为)->引用数据类型（装箱）
        Integer i = new Integer(123);

        // 将引用数据类型-(转换)->基本数据类型（拆箱）
        float f = i.floatValue();
        System.out.println(f);// 123.0

        // 将引用数据类型-(转换)->基本数据类型（拆箱）
        int retValue = i.intValue();
        System.out.println(retValue);// 123

    }
}
