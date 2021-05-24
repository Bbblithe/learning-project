/**
 * Author:  blithe.xwj
 * Date:    2021/1/12 14:36
 * Description:
 * 1、使用生产者和消费者模式实现，交替输出：
 *      假设只有两个线程，输出以下结果：
 *          t1->1
 *          t2->2
 *          t1->3
 *          t2->4
 *          t1->5
 *          t1->6
 *          ...
 *
 *          要求：必须交替，并且t1线程负责输出奇数。t2线程负责输出偶数。
 *          两个线程共享一个数字，每个线程执行时都要对这个数字进行：++
 *
 *
 */


class ProducerCustomer {
    public static void main(String[] args) {
        // 创建一个共享的Num对象
        Num no = new Num();
        Thread t1 = new Thread(new oddNum(no),"t1");
        Thread t2 = new Thread(new evenNum(no),"t2");
        t1.start();
        t2.start();
    }
}

class Num {
    int i ;

    // 默认这个数字是从0开始
    public Num(){
        this.i = 0;
    }

    public Num(int i) {
        this.i = i;
    }
}

class oddNum implements Runnable{

    // 这里是为了共享同一个对象，但是共享了同一个对象也就需要注意线程安全

    Num num;

    public oddNum(Num num){
        this.num = num;
    }

    public void run(){
        while(true){
            synchronized(num) {
                if (num.i % 2 == 0) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 能执行到这里说明他不是偶数，因此奇数线程就应该输出
                System.out.println(Thread.currentThread().getName() + "--->" + num.i);
                num.i ++;
                num.notify();
            }
        }
    }
}

class evenNum implements Runnable{

    //

    Num num;

    public evenNum(Num num){
        this.num = num;
    }
    public void run(){
        while(true){
            synchronized(num){
                if(num.i % 2 == 1){
                    // 这里说明这个数字是奇数，因此偶数线程就不应该再运行了
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 能执行到这里表示这个是一个偶数，偶数线程就应该继续输出偶数
                System.out.println(Thread.currentThread().getName() + "--->" + num.i);
                num.i++;
                num.notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
            }
        }
    }
}
