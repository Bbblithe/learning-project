package xu.wen.jie.blithe.javase.io;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 16:07
 * Description:
 * BufferReader：
 *      带有缓冲区的字符输入流。
 *      使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组。自带缓冲。
 */


class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception{
        FileReader reader = new FileReader("/Users/xuwenjie/IdeaProjects/javase/chapter23/src/xu/wen/jie/blithe/javase/io.txt");
        // 当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流。
        // 外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流。
        // 像当前这个程序来说：FileReader就是一个节点流。BufferedReader就是包装流/处理流。
        BufferedReader br = new BufferedReader(reader);

        // 读一行
        /*String fistLine = br.readLine();
        System.out.println(fistLine);

        String secondLine = br.readLine();
        System.out.println(secondLine);

        String thirdLine = br.readLine();
        System.out.println(thirdLine);

        String fourthLine = br.readLine();
        System.out.println(fourthLine);*/

        // br.readLine()方法读取一个文本行，但是不带有换行符。
        // 像之前的Reader或者说FileInputStream都会自动读取到里面的换行符，因此它们的输出是不需要print(ln)这个ln不用换行。
        String s = null;
        while((s = br.readLine())!= null){
            System.out.println(s);
        }

        // 关闭流
        // 对于包装流来说，只需要关闭最外层流就行，里面的节点流会自动关系（看源代码就行）
        br.close();
    }
}
