package test008;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 19:04
 * Description:
 * 最终结论：
 *      带有static的方法当中不能"直接"访问实例变量和实例方法。
 *      以为实例变量和实例方法都需要对象的存在。
 *      而static的方法当中是没有this的，也就是说当前对象是不存在的。
 *      自然也是无法访问当前对象的实例变量和实例方法。
 */


class ThisTest {

    //带有static
    //主方法
    public static void main(String[] args){

        //调用doSOme
        ThisTest.doSome();

        //调用doSome
        doSome();

        //调用doOther对象
        //【编译错误】
        //ThisTest.doOther(); //实例方法必须先创建对象，通过引用.的方式访问

        //doOther是实例方法
        //实例方法调用必须有对象的存在
        //以下代码表示的含义：调用当前对象的doOther方法
        //但是由于main方法中没有this，所以以下方法不能调用。
        //doOher();//编译错误

        //this.doOther(); //编译错误

        ThisTest xixi=new ThisTest();
        xixi.doOther();

        xixi.run();
    }

    //带有staitc
    public static void doSome(){
        System.out.println("do Some!");
    }

    //实例方法
    public void doOther(){
        //this表示当前对象
        System.out.println("do Other！");
    }

    //实例方法
    //run是实例方法，调用run方法的一点是有对象存在的。
    //一定是先创建了一个对象才能调用run方法
    public void run(){
        //在大括号的代码执行过程当中一定是存在"当前对象"的
        //也就是说这里一定是有"this"的。
        System.out.println("run execute");

        //doOther是一个实例方法，实例方法调用必须有对象的存在
        //以下代码表示的含义就是:调用当前对象的doOther方法
        doOther(); //this.大部分情况下可以省略
        this.doOther(); //比较完全的写法
    }
}
