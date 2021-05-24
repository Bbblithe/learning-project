package xu.wen.jie.blithe.javase.thread;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/9 09:58
 * Description:
 * 1、怎么获取当前线程对象
 *      static Thread currentThread()
 *      Thread t = Thread.currentThread()
 *      返回值t就是当前线程
 *
 * 2、获取线程对象的名字
 *      String name = 线程对象.getName();
 *
 * 3、修改线程对象的名字
 *      线程对象.setName("线程名字");
 *
 * 4、当线程没有设置名字的时候，默认的名字有什么规律？(了解一下)
 *      Thread-0
 *      Thread-1
 *      Thread-2
 *      ....
 */


class ThreadTest05 {
    public static void main(String[] args) {

        // currentThread就是当前线程对象
        // 这个代码出现在main方法当中，所以当前线程就是主线程。
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());// main

        // 创建线程对象
        MyThread2 t = new MyThread2();
        // 设置线程的名字
        t.setName("t1");

        // 获取线程的名字
        String tName = t.getName();
        System.out.println(tName);// Thread-0

        MyThread2 t2 = new MyThread2();
        t2.setName("t2");
        System.out.println(t2.getName());//Thread-1
        t2.start();

        // 启动线程
        t.start();
    }
}

class MyThread2 extends Thread{
    public void run(){
        // 这里的currentThread就是当前线程对象。当前线程是谁呢？
        // 当t1线程执行run方法，那么这个当前线程就是t1
        // 当t2线程执行run方法，那么这个当前线程就是t2
        for(int i = 0 ; i < 100; i++){
            System.out.println(Thread.currentThread().getName()+"分支线程-->"+i);
        }
    }
}