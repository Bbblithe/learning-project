package xu.wen.jie.blithe.javase.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 16:36
 * Description:
 * 老师因为怕catch异常搞的代码太异常了，因此原视频是直接抛出，这里我为了练习一下IO流的框架，自己将架子重新搭了一遍
 * 原老师的代码在BufferedReaderTest01当中。
 */


class BufferReaderTest01 {
    public static void main(String[] args) {
        FileReader reader = null;
        BufferedReader buffer = null;
        try {
            reader = new FileReader("/Users/xuwenjie/IdeaProjects/javase/chapter23/src/xu/wen/jie/blithe/javase/io.txt");
            buffer = new BufferedReader(reader);
            String s = null;
            while((s = buffer.readLine()) != null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(buffer != null) {
                try {
                    buffer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
