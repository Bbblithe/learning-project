package xu.wen.jie.blithe.javase.io;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 19:54
 * Description:
 * java.io.PrintStream：标注的字节输出流。默认输出到控制台。
 */


class PrintStreamTest {
    public static void main(String[] args) throws Exception{

        // 联合起来写
        System.out.println("hello World");

        // 分开写
        PrintStream ps = System.out;
        ps.println("hello zhangsan");
        ps.println("hello lisi");
        ps.println("hello wangwu");

        // 标准输出流不需要手动close()关闭.
        // 可以改变标准输出流的输出方向吗？可以
        /*
        // 这些是之前System类使用过的方法和属性。
        System.gc();
        System.currentTimeMillis();
        PrintStream ps2 = System.out;
        System.exit(0);
        System.arrayCopy();
         */
        // 标准输出流不再执行控制来，指向"log"文件
        PrintStream printStream = new PrintStream(new FileOutputStream("log"));
        // 修改输出方向，将输出方向修改到"log"文件。
        System.setOut(printStream);
        // 再输出
        System.out.println("hello world");
        System.out.println("hello kitty");
        System.out.println("hello zhangsan");
    }
}
