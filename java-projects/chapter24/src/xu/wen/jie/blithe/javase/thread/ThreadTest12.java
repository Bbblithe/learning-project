package xu.wen.jie.blithe.javase.thread;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/9 19:20
 * Description:
 * 让位，当前线程暂停，回到就绪状态，让给其他线程。
 * 静态方法：Thread.yield()
 */


class ThreadTest12 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable6());
        t.setName("t");
        t.start();

        for(int i = 1 ; i <= 10000 ; i++){
            System.out.println(Thread.currentThread().getName() + "主线程--->" + i);
        }
    }
}

class MyRunnable6 implements Runnable{
    public void run(){
        for(int i = 1 ; i <= 10000 ; i++){
            // 每100个让位一次
            if(i % 100 == 0){
                Thread.yield();// 当前线程暂停一下，让给主线程。
            }
            System.out.println(Thread.currentThread().getName() + "分支线程--->" + i);
        }
    }
}