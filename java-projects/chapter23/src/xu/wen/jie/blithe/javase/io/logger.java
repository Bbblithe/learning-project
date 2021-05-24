package xu.wen.jie.blithe.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 20:06
 * Description:
 * 日志工具
 */


class logger {
    /*
    记录日志的方法
     */
    public static void log(String msg){
        try {
            // 指向一个日志文件
            PrintStream out = new PrintStream(new FileOutputStream("logfile",true));
            // 改变输出方向
            System.setOut(out);
            // 日期当前时间
            Date nowtime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowtime);

            System.out.println(strTime+":"+msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
