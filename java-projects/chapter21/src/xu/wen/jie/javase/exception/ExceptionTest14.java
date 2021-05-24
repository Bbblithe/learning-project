package xu.wen.jie.javase.exception;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/25 19:47
 * Description:
 * final finally finalize有什么区别？
 *      final 关键字
 *          final修饰的类无法继承
 *          final修饰的方法无法覆盖
 *          final修饰的变量不能重新赋值。
 *
 *      finally 关键字
 *          和try联合使用
 *          finally语句块中的代码是必须执行的。
 *
 *      finalize 标识符
 *          是一个Object类中的方法名。
 *          这个方法是由垃圾回收器GC负责调用的。
 */


class ExceptionTest14 {
    public static void main(String[] args) {

        // final 是一个关键字。修饰的变量表示最终的。不变的。
        final int i = 100;
        //i = 100;

        // finally 也是一个关键字，和try联合使用，使用在异常处理机制中
        // finally语句块中的代码是一定会执行的。
        try {

        }finally{
            System.out.println("finally....");
        }

        // finalize()是Object类中的一个方法。作为方法名出现。
        // 所以finalize是标识符。
        // finalize()方法是JVM的GC垃圾回收器负责调用。
        Object obj;
    }
}

// final修饰的类无法继承
final class A{
    //常量。
    public static final double MATH_PI = 3.14159265353;
}

class B{
    // final修饰的方法无法覆盖
    public final void doSome(){

    }
}