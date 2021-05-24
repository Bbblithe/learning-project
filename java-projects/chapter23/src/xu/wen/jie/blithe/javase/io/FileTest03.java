package xu.wen.jie.blithe.javase.io;

import java.io.File;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 21:25
 * Description:
 * File中的listFile方法
 */


class FileTest03 {
    public static void main(String[] args) {
        // File[] listFiles()
        // 获取当前目录下所有的自文件。
        File f = new File("/Users/xuwenjie/Downloads/java");
        File[] files = f.listFiles();
        // 使用增强foreach循环遍历
        for(File file : files){
            //System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
        }
    }
}
