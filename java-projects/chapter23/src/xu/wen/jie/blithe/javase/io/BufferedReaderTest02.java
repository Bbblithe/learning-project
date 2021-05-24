package xu.wen.jie.blithe.javase.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 19:12
 * Description:
 * 转换流：InputStreamReader
 */


class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception{
        // 字节流
        /*FileInputStream in = new FileInputStream("/Users/xuwenjie/IdeaProjects/javase/javase.iml");

        // 通过转换流转换(InputStreamReader是将字节流转换成字符流。)
        // in在这里是节点流。reader是包装流
        InputStreamReader reader = new InputStreamReader(in);

        // 这个构造方法只能传一个字符流，不能传一个字节流。
        // reader在这里是节点流，br是包装流
        BufferedReader br = new BufferedReader(reader);*/

        // 合并
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/xuwenjie/IdeaProjects/javase/javase.iml")));

        String s = null;
        while((s = br.readLine()) != null){
            System.out.println(s);
        }

        // 关闭最外层
        br.close();
    }
}
