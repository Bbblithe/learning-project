package xu.wen.jie.blithe.javase.threadsafe;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/9 20:57
 * Description:
 */


class AccountThread extends Thread {
    // 两个线程必须共享同一个账户对象。
    private Account act;

    // 通过构造方法传递过来账户对象
    public AccountThread(Account act){
        this.act = act;
    }

    public void run(){
        // run方法的执行表示取款操作。
        // 假设取款5000
        double money = 5000;
        // 取款
        act.withdraw(money);

        System.out.println(Thread.currentThread().getName()+"对"+act.getActNo() + "取款"+money+"成功，余额" + act.getBalance());
    }
}
