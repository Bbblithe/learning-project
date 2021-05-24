package xu.wen.jie.blithe.javase.thread;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/11 18:59
 * Description:
 * 守护线程
 */


class ThreadTest14 {
    public static void main(String[] args) {
        Thread t = new BakDataThread();
        t.setName("备份数据");

        // 启动线程之前，将线程设置为守护线程
        t.setDaemon(true);

        t.start();

        // 主线程：主线程是用户线程
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(Thread.currentThread().getName()+ "主线程--->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class BakDataThread extends Thread{
    public void run(){
        int i = 0 ;

        // 即使是死循环，但由于该线程是守护者，当用户线程结束，守护线程自动终止。
        while (true){
            System.out.println(Thread.currentThread().getName()+"分支线程---->"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}