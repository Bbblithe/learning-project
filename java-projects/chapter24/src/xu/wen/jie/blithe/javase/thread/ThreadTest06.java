package xu.wen.jie.blithe.javase.thread;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/9 13:25
 * Description:
 * 关于线程的sleep()方法:
 *      static void sleep(long millis)
 *      1、静态方法：Thread.sleep(1000);
 *      2、参数是毫秒
 *      3、作用：让当前线程进入休眠，进入"阻塞状态"，放弃占有的CPU时间片，让给其他线程使用。
 *          这行代码出现在A线程中，A线程就会进入休眠。
 *          这行代码出现在B线程中，B线程就会进入休眠。
 *
 *      4、Thread.sleep()方法可以做到这种效果：
 *          间隔特定的时间，去执行特定的代码，每隔多久执行一次
 */


class ThreadTest06 {
    public static void main(String[] args) {
        // 让当前线程进入睡眠，睡眠5秒
        // 当前线程是主线程！
        /*try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        // 5秒之后执行这里的代码
        //System.out.println("hello world！");

        for(int i = 0 ; i < 10 ; i++){
            System.out.println(Thread.currentThread().getName() + "分支线程--->" + i);

            // 睡眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
