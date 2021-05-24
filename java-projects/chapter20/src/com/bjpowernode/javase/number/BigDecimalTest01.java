package com.bjpowernode.javase.number;

import java.math.BigDecimal;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/21 08:45
 * Description:
 * 1、BigDecimal 属于大数据，精度极高。不属于基本数据类型，属于java对象(引用数据类型)
 * 这是SUN提供的一个类。专门用在财务软件当中。
 *
 * 2、注意：财务软件中double是不够的。咱们之前有一个学生去用邮面试，经理就问了这样的一个问题：
 *      你处理过财务数据吗？用的哪一种类型？
 *          千万别说double，说java.math.BigDecimal
 */


class BigDecimalTest01 {
    public static void main(String[] args) {
        // 这个100 不是普通的100，是精度极高的100
        BigDecimal v1 = new BigDecimal(100);
        // 精度极高的200
        BigDecimal v2 = new BigDecimal(200);
        //求和
        // v1+v2；//这样不行，v1和v2都是引用，不能直接使用+求和
        BigDecimal v3 = v1.add(v2); // 调用方法求和。
        System.out.println(v3); //300

        BigDecimal v4 = v2.divide(v1);
        System.out.println(v4); // 2
    }
}
