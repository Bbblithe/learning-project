package test021;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/19 18:51
 * Description:
 */


class FinalTest04 {
    public static void main(String[] args) {
        System.out.println(Chinese.GUO_JI);
        System.out.println("圆周率："+Math.PI);
    }
}

class Math{
    public static final double PI=3.1415926;
}

//中国人
class Chinese{
    //国籍
    //需求：每一个中国人的国籍都是中国，而且国籍不会发生改变，为了防止国籍被修改，建议加final修饰。
    //final 修饰的实例变量是不可变的，这种变量和static联合使用，请称为"常量"
    //常量的定义语法格式：
    //      public static final 类型 常量名=值;
    //java规范中要求所有常量的名字全部大写，每个单词之间使用下划线链接

    //static final String country="中国";

    public static final String GUO_JI ="中国"; //java语言中称为常量公开

}
