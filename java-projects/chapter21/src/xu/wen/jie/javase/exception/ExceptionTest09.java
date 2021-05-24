package xu.wen.jie.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/25 16:48
 * Description:
 * 异常对线的两个方法：
 *      String msg = e.getMassage;
 *      e.printStackTrace();// 一般都是使用这个。
 *
 * 我们以后查看异常的追踪信息，我们应该怎么看，可以快速的调试程序呢？
 *      异常信息追踪信息，从上往下，一行一行看。
 *      但是需要注意的是：SUN写的代码就不用看了（看包名就知道是自己的还是SUN的）。
 *      主要的问题是出现在自己编写的代码上。
 */


class ExceptionTest09 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            // 获取异常的简单描述信息
            String msg = e.getMessage();
            System.out.println(msg);//1/Users/xuwenjie/Desktop/2015022136徐文杰.docx (No such file or directory)
            // 打印异常堆栈追踪信息！！！
            // 在实际开发中，建议使用这个。养成好习惯！
            // 这行代码要写上，不然出问题你也不知道！
            //e.printStackTrace();
            /*
            java.io.FileNotFoundException: 1/Users/xuwenjie/Desktop/2015022136徐文杰.docx (No such file or directory)
                at java.base/java.io.FileInputStream.open0(Native Method)
                at java.base/java.io.FileInputStream.open(FileInputStream.java:211)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:153)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:108)
                at xu.wen.jie.javase.exception.ExceptionTest09.m3(ExceptionTest09.java:36)
                at xu.wen.jie.javase.exception.ExceptionTest09.m2(ExceptionTest09.java:32)
                at xu.wen.jie.javase.exception.ExceptionTest09.m1(ExceptionTest09.java:28)
                at xu.wen.jie.javase.exception.ExceptionTest09.main(ExceptionTest09.java:19)
                因为36行下的m3方法出问题导致32行下的m2方法出问题
                32行的m2方法出问题导致28行的m1方法出问题
                28行的m1方法出问题导致19行的main方法出问题
                应该先查看36行下的方法代码。36行下m3方法的代码错误是根源。
             */
        }

        // 这里程序不耽误执行，很健壮。（服务器不会应为遇到异常而宕机。）
        System.out.println("HelloWorld");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("1/Users/xuwenjie/Desktop/2015022136徐文杰.docx");
    }

}
