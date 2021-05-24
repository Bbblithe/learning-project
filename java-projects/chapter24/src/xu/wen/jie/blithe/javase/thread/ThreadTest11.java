package xu.wen.jie.blithe.javase.thread;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/9 19:00
 * Description:
 * 了解：关于线程的优先级
 */


class ThreadTest11 {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(1);
        /*System.out.println("最高优先级" + Thread.MAX_PRIORITY);
        System.out.println("最低优先级" + Thread.MIN_PRIORITY);
        System.out.println("默认优先级" + Thread.NORM_PRIORITY);*/

        // 获取当前线程对象，获取当前线程的优先级
        Thread currentThread = Thread.currentThread();
        // main线程的默认优先级是5
        //System.out.println(currentThread.getName() + "线程的默认优先级是：" + currentThread.getPriority());

        Thread t = new Thread(new MyRunnable5());
        t.setPriority(10);
        t.setName("t");
        t.start();

        // 优先级较高的，只是抢到CPU时间片相对多一些。
        // 大概率方向更偏向优先级比较高的。
        for(int i = 0 ; i < 10000 ; i++){
            System.out.println(Thread.currentThread().getName() + "主线程--->" + i);
        }
    }
}

class MyRunnable5 implements Runnable{
    public void run(){
        // 获取线程优先级
        //System.out.println(Thread.currentThread().getName() + "线程的默认优先级" + Thread.currentThread().getPriority());
        for(int i = 0 ; i < 10000 ; i++) {
            System.out.println(Thread.currentThread().getName() + "分支线程--->" + i);
        }
    }
}