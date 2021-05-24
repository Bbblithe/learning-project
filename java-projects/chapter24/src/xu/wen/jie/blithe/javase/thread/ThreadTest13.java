package xu.wen.jie.blithe.javase.thread;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/9 19:28
 * Description:
 * 线程合并
 */


class ThreadTest13 {
    public static void main(String[] args) {
        System.out.println("main begin");
        Thread t = new Thread(new MyRunnable7());
        t.setName("t");
        t.start();


        //合并线程
        try {
            t.join();// t合并到当前线程中，当前线程受阻塞。t线程执行知道结束。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main over");
    }
}

class MyRunnable7 implements Runnable{
    public void run(){
        for(int i = 0 ; i < 1000 ; i ++){
            System.out.println(Thread.currentThread().getName() + "分支线程------>" + i);
        }
    }
}