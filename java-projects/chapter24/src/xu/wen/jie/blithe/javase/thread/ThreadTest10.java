package xu.wen.jie.blithe.javase.thread;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/9 16:36
 * Description:
 * 怎么合理的终止一个线程的执行。这种方式是很常用的。
 */


class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        // 模拟5秒
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 终止线程
        // 你想什么时候终止t的执行，那么你把t修改为false，就结束了。
        r.run = false;
    }
}

class MyRunnable4 implements Runnable{

    // 打一个布尔标记
    boolean run = true;

    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            if(run){
                System.out.println(Thread.currentThread().getName() + "分支线程-->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                // return就结束了，你在之前还有什么没保存的。
                // 在这里可以保存。
                // save...

                //终止当前线程
                return;
            }
        }
    }
}
