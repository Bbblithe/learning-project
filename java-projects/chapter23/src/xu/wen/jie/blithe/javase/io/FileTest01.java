package xu.wen.jie.blithe.javase.io;

import java.io.File;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 20:24
 * Description:
 * File
 *      1、File类和四大家族没有关系，所以File类不能完成文件的读和写。
 *      2、File对象表示什么？
 *          文件和目录路径名的抽象表示形式。
 *          C:\Drivers 这是一个File对象
 *          C:\Drivers\Lan\Realtek\Readme.txt 也是File对象。
 *          一个File对象有可能对应的是目录，也可能是文件。
 *          File只是一个路径名的抽象表示形式。
 *      3、需要掌握File类中常用的方法
 */


class FileTest01 {
    public static void main(String[] args) throws Exception{
        // 创建一个File对象
        File f1 = new File("/Users/xuwenjie/Downloads/JavaSE/com/file");

        // 判断是否存在！
        System.out.println(f1.exists());

        // 若果这个file不存在，则以文件的形式创建出来
        /*if(!f1.exists()){
            // 以文件形式新建
            f1.createNewFile();
        }*/

        // 如果这个file不存在，则以目录的方式创建出来
        /*if(!f1.exists()){
            // 以目录的形式新建。
            f1.mkdir();
        }*/

        // 可以创建多重目录吗？
        /*File f2 = new File("/Users/xuwenjie/Downloads/JavaSE/com/a/b/c/d/f");
        if(!f2.exists()){
            // 多重目录的形式新建。
            f2.mkdirs();
        }*/

        File f3 = new File("/Users/xuwenjie/Desktop/c语言");
        // 获取该文件的父路径
        String parentPath = f3.getParent();
        System.out.println(parentPath);
        File parentFile = f3.getParentFile();
        System.out.println("获取绝对路径："+parentFile.getAbsoluteFile());

        File f4 = new File("copy");
        System.out.println(f4.getAbsolutePath());// /Users/xuwenjie/IdeaProjects/javase/copy
    }
}
