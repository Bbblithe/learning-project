import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 21:32
 * Description:
 * 拷贝目录：
 *      将某个盘中的文件拷贝到另一个盘下...
 *
 *      需要使用到：
 *          FileInputStream
 *          FileOutputStream
 *          File
 *
 *      可能需要使用到递归。
 */

public class copyDirectory{
    public static void main(String[] args){
        File srcDir = new File("/Users/xuwenjie/Downloads/教学课件");
        File desDir = new File("/Users/xuwenjie/Desktop");
        copy(srcDir,desDir);

    }

    /**
     * 拷贝文件
     * @param srcDir 源文件
     * @param desDir 目标文件
     */
    private static void copy(File srcDir, File desDir) {
        if(!srcDir.isDirectory()){
            // 判断这个文件是目录还是文件，如果是文件就直接退出这个循环
            // 当这玩意是一个文件的时候，我们就该写这文件

            // 核心：一边读，一边写。
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                // 而这个读取文件的难点就在于它们分别读什么，写在哪里！

                // 读的话，由于我们这个递归最终读取的一定是一个展开的文件，因此我们直接把这个文件传入进去就行了
                in = new FileInputStream(srcDir);

                // 但是写的话，写得写在那个我们创建好的目录里，这样才完成了拷贝位置也精准
                // 同样我们应该运用创建目录的思路
                // "/Users/xuwenjie/Downloads/教学课件"：源文件
                // "/Users/xuwenjie/Desktop"：目标文件
                // 我们写的时候就应该把新的文件变成目标文件加上源文件准确地址，这样FileOutputStream流看到这个不存在也就会自动创建一个你给的地址的文件（因此不需要考虑这个文件的目录位置，只需要全部写入就行了）
                String path = (desDir.getAbsolutePath().endsWith("/")? desDir.getAbsolutePath() : desDir.getAbsolutePath() + "/")+srcDir.getAbsolutePath().substring(16);

                out = new FileOutputStream(path);

                byte[] bytes = new byte[1024]; //1kb的读取速度
                int readCount = 0;
                while((readCount = in.read(bytes)) != -1){
                    out.write(bytes,0,readCount);
                }


                // 弄完要抖一下（刷新）
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
                    try{
                        out.close();
                    } catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }


            return ;
        }

        // 获取源文件的文件数组
        File[] files = srcDir.listFiles();
        // 遍历获取源文件的所有自文件（这里可能是目录，也可能是文件）
        for(File file : files){
            // 测试发现这里可能是文件，也可能是目录
            //System.out.println(file.getName());

            // 一个父文件的子文件如果是一个目录，那么就需要创建这个目录到目标文件去，并且展开这个文件继续判断(展开这个文件在下面的递归中实现)
            // 因此这里需要判断这个file究竟是文件还是目录
            if(file.isDirectory()) {
                // 创建目录(这个问题难在如何使用mkdirs()方法，这个方法需要一个文件路径)--路径该怎么弄！？
                // "/Users/xuwenjie/Downloads/教学课件":源文件
                // "/Users/xuwenjie/Desktop"：目标文件
                // 创建新路径
                // 注意的是这里的源文件还需要是这里的子文件(file)的绝对地址，否则当一个文件有一个目录就会出现问题
                String newPath = (desDir.getAbsolutePath().endsWith("/") ? desDir.getAbsolutePath() : desDir.getAbsolutePath() + "/") + file.getAbsolutePath().substring(16);
                //System.out.println(newPath); // 这里测试发现达到目的了。

                // 创建目录
                File newFile = new File(newPath);
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }
            }

            // 使用递归，就可以将里面的文件打开，前提是得这文件是文件不是目录
            copy(file,desDir);
        }
    }

}

