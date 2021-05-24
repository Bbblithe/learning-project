package 接口基础语法;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/30 09:38
 * Description:
 *
 *  接口和接口之间可以支持多继承，那么一个类可以同时实现多个接口嘛？
 *
 *      对于计算机来说，一个机箱上有多给接口，一个接口是接键盘的，
 *      一个接口是接鼠标的，一个接口是接电源的，一个接口是接显示器的.....
 *
 *  重点（五颗星*****）：一个类可以同时实现多个接口。
 *
 *  这种机制弥补了java中的哪个缺陷？
 *      java中类和类只支持单继承。实际上单继承是为了简单而出现的，现实世界中
 *      存在多继承，java中的接口弥补了单继承带来的缺陷。
 *
 *  接口A和接口B虽然没有继承关系，但是写代码的时候，可以互转。
 *  编译器没意见。但是运行的时候可能出现：ClassCastException
 *
 *  之前有一个结论：
 *      无论是向上转型还是向下转型，两种类型之间必须要有继承关系，
 *      没有继承关系编译器会报错。（这句话不适用在接口上面）
 *      最终实际上和之前还是一样，需要加：instanceof运算符进行判断。
 *      向下转型养成好习惯。转型之前先if+instanceof进行判断。
 */


public class Test03 {
    public static void main(String[] args){
        // 多态该怎么用呢？
        // 都是父类型引用指向子类型对象
        A1 a=new D1();
        //a.m2(); //编译报错。A接口中没有m2()方法。
        B1 b=new D1();
        C1 c=new D1();

        //这个编译没有问题，运行也没有问题。
        //调用其他接口中的方法，你需要转型。（接口转型）
        B1 b2=(B1) a;
        b2.m2();

        if(a instanceof D1) {
            D1 d = (D1) a;
            d.m2();
        }

        M m =new E();
        //经过测试：接口和接口之间在进行强制类型转换的时候，没有继承关系，也可以强转。
        //但是一定要注意，运行时可能会出现ClassCastException异常。
        //编译没问题，运行有问题。
        //K k=(K)m;
        if(m instanceof K){
            K k=(K)m;
        }
    }
}
interface K{

}

interface M{

}

class E implements M{

}

//-----------------------------------------------------------------------------------
interface X{

}
interface Y{

}
interface Z extends X,Y{ //接口和接口支持多继承

}

//------------------------------------------------------------------------------------
interface A1{
    void m1();
}

interface B1{
    void m2();
}

interface C1{
    void m3();
}

//实现多个接口，其实就类似于多继承。
class D1 implements A1,B1,C1{
    //重写实现A接口的m1()方法
    public void m1(){

    }
    //重写实现B接口的m2()方法
    public void m2(){
        System.out.println("m2.....");
    }
    //重写实现C接口的m3()方法
    public void m3(){

    }
}