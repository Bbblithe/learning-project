/**
 * Author:  blithe.xwj
 * Date:    2020/11/22 16:27
 * Description:
 *
 *  final
 *
 *      1、final是java语言中一个关键字。
 *
 *      2、final表示
 *          最终的，不可变的。
 *      3、final可以修饰变量以及方法，还有类等。
 *
 *      4、final修饰的变量？
 *         final修饰的局部变量，一旦赋值不能重新赋值。(仅能赋一次值)
 *        【重点】final修饰的变量，只能赋一次值。
 *
 *      5、final修饰的方法？
 *         final修饰的方法无法被覆盖，被重写
 *
 *      6、final修饰的类？
 *         final修饰的类无法继承
 *
 *      7、final控制不了能不能调用的问题，final管的是啥？
 *         final修饰的表示最后的，不能变得，不能改的。
 *
 */


public class FinalTest01 {
    public static void main(String[] args){
        //局部变量
        int i=100;
        //重新赋值
        i=200;

        //局部变量
        final int k=100;
        //重新赋值
        //错误：Cannot assign a value to final variable 'k'
        //k=300;
        final int m;
        //第一次赋值
        m=200;
        //第二次赋值
        //编译报错：Variable 'm' might already have been assigned to
        //m=2;
    }
}

class A{
    public void doSome(){
        System.out.println("C's doSome!");
    }
}
class B extends A{
    /*
    public void doSome(){
        System.out.println("D's doSome!");
    }
     */

    public void doOther(){

    }

    public static void main(String[] args){
        //多态
        //A a=new B();
        //a.doOther();//报错了，因为编译器认为a是A类，会在A类中寻找A类中的doOther()方法，由于A类里面并没有，所以报错。

        //为了解决上面的问题我们采用向下转型。强转
        A a=new B();
        if(a instanceof B){ //c指向的对象如果确实
            B xixi= (B)a;
            xixi.doOther();
        }

        //不用多态就可以
        B b=new B();
        b.doOther();

    }
}
/*class C extends String{       //编译报错Cannot inherit from final 'java.lang.String'

}
 */

/*
class C{
    public final void doSome(){
        System.out.println("C's doSome!");
    }
}

class D extends C{
    public void doSome(){
        System.out.println("D's doSome!");
    }
}

 */
