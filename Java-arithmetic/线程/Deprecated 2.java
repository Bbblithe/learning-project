package 线程;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/12 14:00
 * Description:
 *
 * 关于Deprecated的三个已经过时的方法suspend() 、resume() 、stop()
 */


class Deprecated {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        // 这的调用的是一个构造方法（其中放入这个实现Runnable的类，和这个线程的名字）
        Thread printThread = new Thread(new Runner(),"PrintThread");
        printThread.setDaemon(true);
        printThread.start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 将printThread进行暂停，输出内容结束
        printThread.suspend();// 该方法已经过时，是有原因的，具体原因之后会讲。
        System.out.println("main suspend PrintThread at " + format.format(new Date()));
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 通过resume()方法恢复printThread ，输出内容继续
        printThread.resume();
        System.out.println("main resume PrintThread at " + format.format(new Date()));
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 将printThread进行终止，输出内容停止
        printThread.stop();
        System.out.println("main stop PrintThread at " + format.format(new Date()));
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    static class Runner implements Runnable{

        @Override
        public void run(){
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            while(true){
                System.out.println(Thread.currentThread().getName() + "Run at " + dateFormat.format(new Date()));
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
