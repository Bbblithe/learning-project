package xu.wen.jie.blithe.javase.threadsafe2;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/9 21:00
 * Description:
 */


class Test {
    public static void main(String[] args) {
        // 创建账户对象
        Account act = new Account ("act-001",10000);

        // 创建两个线程
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);

        // 设置name
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
