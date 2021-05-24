package shilian;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/21 16:30
 * Description:
 */


public class Test {
    public static void main(String[] args) {
        System.out.println("在这里输入实际值");
        java.util.Scanner shijizhi=new java.util.Scanner(System.in);

        //创建A对象
        A a=new A(shijizhi.nextInt());
        //创建B对象
        B b=new B(a);
        //开始猜测
        while (true){
            System.out.println("在这里输入猜测值");
            java.util.Scanner caicezhi=new java.util.Scanner(System.in);
            b.guess(caicezhi.nextInt());
        }


    }
}
class A{
    private int v;

    public A(){

    }
    public A(int v){
        this.v=v;
    }

    public void setV(){
        this.v=v;
    }

    public int getV(){
        return v;
    }
}

class B{

    //通过B猜测A
    //在B对象中有一个A对象的引用
    private A a;

    public B(){

    }
    public B(A a){
        this.a=a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    //猜测的方法
    public void guess(int guessNum){
        //实际数字
        //int shiJiZhi=this.getA().getV();
        int shiJiZhi=a.getV();
        if(guessNum==shiJiZhi){
            System.out.println("恭喜您猜对了");
            //终止程序的执行
            //退出JVM
            System.exit(0);//退出JVM
        }
        else if(guessNum>shiJiZhi){
            System.out.println("太大了");
        }
        else{
            System.out.println("太小了");
        }
    }

}
