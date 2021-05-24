package com.bjpowernode.javase.enum2;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/21 16:57
 * Description:
 */


class SwitchTest {
    public static void main(String[] args) {

        // switch语句支持枚举类型
        // switch也支持String、int
        // 低版本的JDK，只支持int、String、枚举。
        // byte short char也可以，因为存在自动类型转换。

        switch (Season.AUTUMN){
            // 必须省略Season.
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}
