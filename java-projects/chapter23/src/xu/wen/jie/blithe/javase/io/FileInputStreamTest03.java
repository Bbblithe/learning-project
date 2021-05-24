package xu.wen.jie.blithe.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/3 22:31
 * Description:
 * int read(byte[] b)
 *      一次读取b.length个字节。
 *      减少硬盘和内存的交互，提高程序的执行效率。
 *      往byte数组当中读。
 */


class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 相对路径的话呢？相对路径一定是从当前所在的位置开始找！
            // IDEA默认当前路径是在哪里？工程Project的根就是IDEA的默认当前
            fis = new FileInputStream("tempfile");

            // 开始读，采用byte数组，一次读取多个字节。最多读取"数组.length"个字节。
            byte[] bytes = new byte[4];
            // 这个方法的返回值是：读取到的字节数。（不是字节本身）
            int readCount = fis.read(bytes);
            System.out.println(readCount);// 第一次读到了四个字节
            // 将字节数组全部转换成字符串
            //System.out.println(new String(bytes));// abcd
            // 不应该全部都转换，应该是读取了多少个字节，转换多少个。
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);// 第二次只能读取到两个字节
            System.out.println(readCount);// 2
            // 将字节数组全部转换成字符串
            //System.out.println(new String(bytes));// efcd
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);// 一个字节都没有读到，返回值-1
            System.out.println(readCount);// -1

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(fis != null){
                try{
                    fis.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
