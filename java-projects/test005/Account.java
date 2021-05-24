package test005;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 09:38
 * Description:
 */


public class Account {

    //账号
    private String actno; //实例变量/对象变量，也就是说，必须现有对象才能有对应的实例变量
    //余额
    private double balance;

    //无参数构造器
    public Account(){
        //初始化实例变量的内存空间
        //actno=null;
        //balance=0.0;
    }
    public Account(String s){
        actno=s;
    }

    public Account(double a){
        //actno=null;
        balance=a;
    }
    public Account(String s,double a){
        actno=s;
        balance=a;
    }

    public String getActno() {
        return actno;
        //balance =0.0;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
