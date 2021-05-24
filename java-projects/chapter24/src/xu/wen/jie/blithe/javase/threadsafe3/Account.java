package xu.wen.jie.blithe.javase.threadsafe3;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/9 20:26
 * Description:
 */


class Account {
    // 账号
    private String actNo;

    // 余额
    private double balance;

    public Account(){

    }

    public Account(String actNo , double balance){
        this.actNo = actNo;
        this.balance = balance;
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 取款的方法
    /*
    在实例方法上可以使用synchronized吗？可以的。
        synchronized出现在实例方法上，一定锁的是this。
        没得挑。只能是this。不能是其他的对象了。
        所以这种方式不灵活。

        另外还有一个缺点：synchronized出现在实例方法上，
        表示整个方法体都需要同步，可能会无故扩大同步的
        范围，导致程序的执行效率降低。所以这种方式不常用。

        synchronized使用在实例方法上有什么优点？
            代码写的少，更简洁一些。

        如果共享的对象就是this，并且需要同步的代码块是整个方法体，
        建议使用这种方式。

     */
    public synchronized void withdraw(double money){
            double before = this.getBalance();
            double after = before - money;

            // 在这里模拟一下网络延迟，100%会出问题
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.setBalance(after);
    }
}

