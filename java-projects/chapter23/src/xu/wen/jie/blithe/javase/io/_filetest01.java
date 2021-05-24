package xu.wen.jie.blithe.javase.io;

import java.io.File;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/6 10:54
 * Description:
 */


class _filetest01 {
    public static void main(String[] args) {

        File f1 = new File("/Users/xuwenjie/Downloads/JavaSE/IO流文件/haha");
        System.out.println(f1.exists());
        if(!f1.exists()){
            f1.mkdir();
        }

        File f2 = new File("/Users/xuwenjie/Downloads/JavaSE/IO流文件/afa/afd/asd/fa/sdf");
        if(!f2.exists()){
            f2.mkdirs();
        }

        System.out.println(f2.getParent());// get the file's parentPath;
        System.out.println(f2.getAbsolutePath());// get zhe file's absolutelyPath

    }
}
