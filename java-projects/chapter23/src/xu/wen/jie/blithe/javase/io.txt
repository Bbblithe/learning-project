package xu.wen.jie.blithe.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 15:52
 * Description:
 * 使用FileReader和FileWriter进行拷贝的话，只能拷贝"普通文本"文件。
 *
 */


class Copy02 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            // 读
            in = new FileReader("/Users/xuwenjie/IdeaProjects/javase/chapter23/src/xu/wen/jie/blithe/javase/io/Copy02.java");
            // 写
            out = new FileWriter("chapter23/src/xu/wen/jie/blithe/javase/io.txt");

            // 一边读一边写
            char[] chars = new char[1024*512];// 1Mb(因为一个字符算作两个字节，1024个字节就是1kb，1024kb就是1Mb)
            int readCount = 0;
            while((readCount = in.read(chars)) != -1){
                out.write(new String(chars,0,readCount));
            }

            // 刷新
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
