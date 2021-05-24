package xu.wen.jie.blithe.javase.thread;

import java.util.Scanner;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/8 20:57
 * Description:
 * 采用匿名内部类可以吗？
 */


class ThreadTest04 {
    public static void main(String[] args) {
        // 创建线程对象，采用匿名内部类方式。
        Thread t = new Thread(new Runnable(){
            public void run(){
                Scanner s = new Scanner(System.in);
                s.nextInt();
                // 这里会发生线程阻塞，放弃自己所抢夺到的CPU时间片，因此结果是主线程直接输出完，支线程还在等用户输入。
                for(int i = 0 ; i < 100; i++){
                    System.out.println("t线程--->>"+i);
                }
            }
        });

        // 启动线程
        t.start();

        for(int i = 0 ; i < 100; i++){
            System.out.println("主线程->>"+i);
        }
    }
}
