package xu.wen.jie.blithe.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 09:24
 * Description:
 * 使用FileInputStream + FileOutputStream完成文件的拷贝。
 * 拷贝的过程应该是一边读，一边写。
 * 使用以上的字节流拷贝文件的时候，文件类型随意，万能的。什么样的文件都能拷贝。
 */


   class Copy01   {
   public static void main(String[] args) {
      FileInputStream fis = null;
      FileOutputStream fos = null;
      try {
         // 创建一个输入流对象
         fis = new FileInputStream("/Users/xuwenjie/Downloads/百度云盘/Java数据结构和算法.（第二版）.pdf");
         // 创建一个输出流对象
         fos = new FileOutputStream("/Users/xuwenjie/Desktop/6.pdf");

         // 最核心的：一边读，一边写
         byte[] bytes = new byte[1024*1024]; //1Mb（一次最多拷贝1Mb。）
         int readCount = 0;
         while((readCount = fis.read(bytes)) != -1){
            fos.write(bytes,0,bytes.length);
         }

         // 刷新，输出流最后要刷新
         fos.flush();
      } catch (FileNotFoundException e){
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } finally{
         // 分开try，不要一起try。
         // 一起try的时候，其中一个异常，可能会影响到另一个流的关闭
         if(fis != null){
            try {
               fis.close();
            } catch (IOException e){
               e.printStackTrace();
            }
         }
         if(fos != null){
            try {
               fos.close();
            } catch (IOException e){
               e.printStackTrace();
            }
         }
      }
   }
}
