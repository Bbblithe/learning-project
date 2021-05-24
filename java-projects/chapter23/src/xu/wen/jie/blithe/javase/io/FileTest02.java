package xu.wen.jie.blithe.javase.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 21:10
 * Description:
 * File类的常用方法
 * 这里是删除文件的
 */


class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("/Users/xuwenjie/Desktop/c语言");
        // 获取文件名的
        System.out.println(f1.getName());

        // 判断是否是一个目录
        System.out.println(f1.isDirectory());// true

        // 判断是否是一个文件
        System.out.println(f1.isFile());// false
        
        // 获取最后一次修改时间
        long haoMiao = f1.lastModified();// 这个毫秒数是从1970年到现在的总毫秒数。
        // 将总毫秒数转换成日期
        
        Date date = new Date(haoMiao);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date));

        // 获取文件大小
        // 但是我这里是一个根目录，那就不知道为啥了
        System.out.println(f1.length());
        
    }
}
