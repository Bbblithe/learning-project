package xu.wen.jie.blithe.javase.threadsafe;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/9 20:26
 * Description:
 * 银行账户
 *      不使用线程同步机制，多线程对同一个账户进行取款，出现线程安全问题。
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
    public void withdraw(double money){
        // t1和t2并发这个方法（t1和t2是两个栈。两个栈操作堆中同一个对象。）
        // 取款之前的余额
        double before = this.getBalance();
        // 取款之后的余额
        double after = before - money;

        // 在这里模拟一下网络延迟，100%会出问题
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 更新余额
        // 思考：t1执行到这里的，但还没来得及执行这行代码，t2线程进来withdraw方法。此时一定出问题。
        this.setBalance(after);
    }
}

