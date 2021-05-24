package xu.wen.jie.blithe.javase.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 19:22
 * Description:
 * BufferedWriter:带有缓冲的字符输出流
 */


class BufferedWriterTest {
    public static void main(String[] args) throws Exception{
        // 创建一个BufferedWriter字符流对象
        //BufferedWriter out = new BufferedWriter(new FileWriter("copy"));

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy2",true)));
        // 开始写
        out.write("hello World");
        out.write("\n");
        out.write("hello kitty");

        // 刷新
        out.flush();

        // 关闭最外层
        out.close();
    }
}
