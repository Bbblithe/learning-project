package test016;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/17 11:18
 * Description:
 * 实例语句块/代码块【了解内容，使用的非常少】
 *  1、实例代码块可以编写多个，也是遵循自上而下的顺序依次执行
 *  2、实例代码块在构造方法执行之前执行，构造方法执行依次，实例代码块对象执行一次。
 *  3、实例代码块也是java语言为程序员准备的一份特殊的时机，这个特殊时机被称为对象初始化时机。
 */


class Test {
    //构造函数
    public Test(){
        System.out.println("Test类的缺省构造器执行");
    }

    //实例代码块
    {
        System.out.println(1);
    }

    //实例代码块
    {
        System.out.println(2);
    }

    //实例代码块
    {
        System.out.println(3);
    }

    //主方法
    public static void main(String[] args) {
        System.out.println("main begin");
        new Test();
        new Test();
    }
}
