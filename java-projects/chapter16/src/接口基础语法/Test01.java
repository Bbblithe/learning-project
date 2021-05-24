package 接口基础语法;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/28 11:06
 * Description:
 *  接口：
 *      1、接口也是一种"引用数据类型"。编译之后也是一个class字节码文件。
 *      2、接口是完全抽象的。（抽象类是半抽象。）或者也可以说接口是特殊的抽象类。
 *      3、接口怎么定义，语法是什么？
 *          [修饰符列表] interface 接口名{
 *
 *          }
 *
 *          [修饰符列表] class 类名{
 *
 *          }
 *
 *          [修饰符列表] abstract class 类名{
 *
 *          }
 *
 *      4、接口支持多继承，一个接口可以继承多个接口。
 *      5、接口中只包含两部分内容，一部分是：常量。一部分是：抽象方法。接口中没有
 *      其他内容了。只有以上两部分。
 *      6、接口中所有的元素都是public 修饰的。（都是公开的。）
 *      7、接口中的抽象方法定义时：public abstract修饰符可以省略。
 *      8、接口中的方法都是抽象方法，所以接口中的方法不能有方法体。
 *      9、接口中的常量的public static final 可以省略
 */


public class Test01 {
    public static void main(String[] args){
        //访问接口常量
        System.out.println(MyMath.PI);

        //常量能够重新赋值吗？
        //编译报错：Cannot assign a value to final variable 'PI'
        //MyMath.PI=3.15;
    }
}

//定义接口
interface A{

}

//接口支持继承
interface B{

}

//一个接口可以继承多个接口（支持多继承）
interface C extends A,B{

}
//我的数学接口
interface MyMath{
    //常量
    //public static final double PI=3.14159265354;

    //常量也可以省略public static final
    double PI=3.14159265354;
    //接口中随便写一个变量就是常量。
    //常量：值不能发生改变的的变量。

    //抽象方法
    //public abstract int sum(int a,int b);

    //接口当中既然都是抽象方法，那么编写代码的时候，public abstract可以省略吗？
    int sum(int a,int b);//

    //接口中的方法可以有方法体吗？
    //编译报错：Interface abstract methods cannot have body
    /*
    void doSOme(){

    }

     */

    //相减的抽象方法
    int sub(int a,int b);
}