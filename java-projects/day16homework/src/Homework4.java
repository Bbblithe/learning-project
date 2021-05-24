/**
 * Author:  blithe.xwj
 * Date:    2020/11/22 08:30
 * Description:
 *  编写java程序模拟简单的计算器。
 *  定义名为Number的类其中有两个整形数据成员n1和n2应声明为私有。
 *  编写构造方法赋予n1，n2初始值
 *  再为该类定义加addition()、减subtration()、乘multiplication()、除division()等有实例方法
 *  分别对两个成员变量执行加、减、乘、除的运算。
 *
 *  在main方法中创建Number类的对象调用各个方法并显示计算结果
 */


public class Homework4 {
    public static void main(String[] args) {
        java.util.Scanner shuru1=new java.util.Scanner(System.in);
        java.util.Scanner shuru2=new java.util.Scanner(System.in);
        Number xixi=new Number();
        System.out.print("在这里输入你的第一位数字"+"\n");
        xixi.setN1(shuru1.nextInt());
        System.out.println("您输入的第一位数字是"+xixi.getN1());
        System.out.print("在这里输入你的第二位数字"+"\n");
        xixi.setN2(shuru2.nextInt());
        System.out.println("您输入的第二位数字是"+xixi.getN2());

        java.util.Scanner fangfa=new java.util.Scanner(System.in);
        System.out.print("在这里输入你想使用的方法（加减乘除）"+"\n");
        String yunsuan=fangfa.nextLine();
        if(yunsuan.equals("加")){
            System.out.println(xixi.getN1()+"+"+xixi.getN2()+"="+xixi.addition(xixi.getN1(),xixi.getN2()));
        }
        else if(yunsuan.equals("减")){
            System.out.println(xixi.getN1()+"-"+xixi.getN2()+"="+xixi.subtration(xixi.getN1(), xixi.getN2()));
        }
        else if(yunsuan.equals("除")){
            System.out.println(xixi.getN1()+"/"+xixi.getN2()+"="+xixi.division(xixi.getN1(),xixi.getN2()));
        }
        else if(yunsuan.equals(("乘"))){
            System.out.println(xixi.getN1()+"*"+xixi.getN2()+"="+xixi.multiplication(xixi.getN1(),xixi.getN2()));
        }
        else{
            System.out.println("不好意思，本计算机只能够进行简单的运算");
        }


    }
}

class Number{
    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int addition(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }

    public int subtration(int n1,int n2){
        int sum=n1-n2;
        return sum;
    }

    public int multiplication(int n1,int n2){
        int sum=n1*n2;
        return sum;
    }

    public double division(int n1,int n2){
        if(n2==0){
            System.out.println("不好意思，除数不能为0。该式子无法进行运算");
            return 0;
        }
        else {
            double sum = n1 / n2;
            return sum;
        }
    }
}
