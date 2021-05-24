package xu.wen.jie.blithe.javase.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/11 19:45
 * Description:
 * 实现线程的第三种方式：
 *      实现Callable接口
 *      这种方式的优点：可以获取到线程的执行结果。
 *      这种方式的缺点：效率比较低，在获取t线程执行结果的时候，当前线程受阻塞，效率较低。
 */


class ThreadTest15 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 第一步：创建一个"未来任务类"对象。
        // 参数非常重要，需要给一个Callable接口的实现类对象。
        FutureTask task  = new FutureTask(new Callable(){
            public Object call() throws Exception { // call()方法就相当于run()方法。只不过这个有返回值
                // 线程执行一个任务，执行之后可能会有一个执行结果
                // 模拟执行
                System.out.println("call method begin");
                Thread.sleep(1000*10);
                System.out.println("call method end!");
                int a = 100;
                int b = 200;
                return a + b; //自动装箱（300结果变成Integer）
            }
        });

        // 创建线程对象
        Thread t = new Thread(task);

        // 启动线程
        t.start();

        // 在这里是main()方法，这是在主线程中。
        // 在主线程中，怎么获取t线程的返回结果？
        // get()方法的执行会导致"当前线程的阻塞"
        Object obj = task.get();
        System.out.println("线程执行结果" + obj);

        // main方法这里的程序要想执行必须等待get()方法的结束
        // 而get()方法可能需要很久。因为get()方法是为了拿另一个线程的执行结果
        // 另一个线程是需要执行时间的。
        System.out.println("Hello World!");
    }
}
