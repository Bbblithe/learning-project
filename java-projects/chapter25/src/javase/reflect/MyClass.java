package javase.reflect;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/14 09:46
 * Description:
 */


public class MyClass{

    // 静态代码块在类加载时执行，并且只执行一次。
    static{
        System.out.println("MyClass类的静态代码块执行了！");
    }
}
