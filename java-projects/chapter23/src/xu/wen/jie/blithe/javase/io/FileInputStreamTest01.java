package xu.wen.jie.blithe.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/3 19:36
 * Description:
 * java.io.FileInputStream
 *      1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读。
 *      2、字节的方式，完成输入的操作，完成读的操作（硬盘--->内存）
 */


class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 创建文件字节输入流对象
            // 以下都是采用绝对路径的方式
            // 文件路径：/Users/xuwenjie/Downloads/JavaSE/IO流文件/temp.text（IDEA会自动把\变成\\,因为java中\表示转义——但是我是Mac系统😁）写成/这个也是可以
            fis = new FileInputStream("/Users/xuwenjie/Downloads/JavaSE/IO流文件/temp.txt");

            // 开始读
            int retValue = fis.read();// 这个方法的返回值是：读取到的"字节"本身。
            System.out.println(retValue); //97

            retValue = fis.read();
            System.out.println(retValue); //98

            retValue = fis.read();
            System.out.println(retValue); //99

            retValue = fis.read();
            System.out.println(retValue); //100

            retValue = fis.read();
            System.out.println(retValue); //101

            retValue = fis.read();
            System.out.println(retValue); //102

            retValue = fis.read();
            System.out.println(retValue); // -1
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            // 在finally语句块当中确保流一定关闭。
            if(fis != null){ // 避免空指针异常
                // 关闭流的前提是：流不是空。流是null的时候没必要关闭。
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
