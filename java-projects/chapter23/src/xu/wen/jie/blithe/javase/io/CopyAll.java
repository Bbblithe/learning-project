package xu.wen.jie.blithe.javase.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/6 16:32
 * Description:
 * 拷贝目录
 */


class CopyAll {
    public static void main(String[] args) {
        // 拷贝源
        File srcFile = new File("/Users/xuwenjie/Downloads");
        // 拷贝目标
        File destFile = new File("/Users/xuwenjie/Downloads/测试拷贝");
        // 调用方法拷贝
        copyDir(srcFile,destFile);

    }

    /**
     * 拷贝目录
     * @param srcFile 拷贝源
     * @param destFile 拷贝目标
     */
    private static void copyDir(File srcFile, File destFile) {
        if(srcFile.isFile()){
            // srcFile如果是一个文件的话，递归结束。
            // 是文件的时候需要拷贝。
            // 一边读一边写。
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                // 读这个文件
                in = new FileInputStream(srcFile);

                // 写到这个文件中
                String path = (destFile.getAbsolutePath().endsWith("/") ? destFile.getAbsolutePath() : destFile.getAbsolutePath()+"/") + srcFile.getAbsolutePath().substring(16);
                out = new FileOutputStream(path);

                // 一边读一边写
                byte[] bytes = new byte[1024 * 1024]; // 一次复制1Mb
                int readCount = 0;
                while((readCount = in.read(bytes)) != -1 ){
                    out.write(bytes,0,readCount);
                }

                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally{
                if(in != null){
                    try {
                        in.close();
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }

                if(out != null){
                    try {
                        out.close();
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
            return ;
        }
        // 获取源下面的子目录
        File[] files = srcFile.listFiles();
        for(File file : files) {
            // 获取所有文件的（包括目录和文件）绝对路径
            //System.out.println(file.getAbsolutePath());
            if(file.isDirectory()){
                // 新建对应的目录
                //System.out.println(file.getAbsolutePath());
                // 源目录：     /Users/xuwenjie/Downloads
                // 目标目录     /Users/xuwenjie/Desktop/拷贝文件
                String srcDir = file.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("/") ? destFile.getAbsolutePath() : destFile.getAbsolutePath()+"/")+srcDir.substring(16);
                File newFile = new File(destDir);
                if(!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            // 递归调用
            copyDir(file, destFile);
        }
    }
}
