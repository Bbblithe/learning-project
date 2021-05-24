package xu.wen.jie.blithe.javase.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/11 19:20
 * Description:
 * 使用定时器指定定时任务。
 */


class TimerTest {
    public static void main(String[] args) throws ParseException {
        // 创建定时器对象
        Timer timer = new Timer();
        //Timer timer = new Timer(true); // 守护线程的方法

        // 指定定时任务
        //timer.schedule(定时任务,第一次执行时间,间隔多久执行一次);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date fistTime = sdf.parse("2021-01-11 19:42:00");
        // 每10秒执行一次。

        // 匿名内部类
        timer.schedule(new TimerTask(){
            public void run(){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                System.out.println(sdf.format(new Date()) + ":成功完成一次数据备份");
            }
        }, fistTime, 1000 * 10);
    }
}

// 编写一个定时任务类
// 假设这是一个记录日志的定时任务
/*class LogTimerTask extends TimerTask {

    public void run(){
        // 编写你需要执行的任务就行了。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());
        System.out.println(strTime + ":成功完成一次数据备份！");
    }
}*/

