package xu.wen.jie.blithe.javase.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 15:43
 * Description:
 */


class FileWriterTest {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            // 创建文件输出流对象
            //out = new FileWriter("file");
            out = new FileWriter("file",true);

            // 开始写。
            char[] chars = {'我','是','中','国','人'};
            out.write(chars);
            out.write(chars,2,3);

            out.write("我是一名java软件工程师");
            // 写出一个换行符。
            out.write("\n");
            out.write("hello World");

            // 刷新
            out.flush();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (out != null){
                try{
                    out.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
