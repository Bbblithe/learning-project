package xu.wen.jie.javase.exception;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/25 20:17
 * Description:
 * 1、SUN提供的JDK内置的异常肯定是不够用的。在实际的开发中，有很多的业务，
 * 这些业务出现异常之后，JDK中都是没有的。和业务挂钩的。那么异常类我们
 * 程序员可以自己定义吗？
 *      可以。
 *
 * 2、Java中怎么自定义异常呢？
 *      两部：
 *          第一步：编写一个类继承Exception或者RuntimeException.
 *          第二步：提供两个构造方法，一个无参数的，一个带有String参数的。
 *
 *  死记硬背。
 */


public class MyException extends Exception{ // 编译时异常
    public MyException(){

    }

    public MyException(String s){
        super(s);
    }
}

/*
public class MyException extends RuntimeException{ // 运行时异常

}

 */