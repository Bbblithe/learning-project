/**
 * Author:  blithe.xwj
 * Date:    2020/11/25 18:13
 * Description:
 *  1、方法覆盖需要和多态机制联合使用才有意义。
 *      Animal a =new cat();
 *      a.move();
 *      要的是什么效果？
 *          编译的时候move()方法是Animal的。
 *          运行的时候自动调用到子类重写的子类方法上。
 *
 *      假设没有多态机制，只有方法覆盖机制，你觉得有意义嘛？
 *          没有多态机制的话，方法覆盖可有可无。
 *          没有多态机制，方法覆盖也可以没有，如果父类的方法无法满足
 *          子类业务需求的时候，子类完全可以定义一个全新的方法。
 *
 *     方法覆盖和多态不能覆盖。
 *
 *  2、静态方法存在方法覆盖嘛？
 *      多态自热就和对象有关了。
 *      而静态方法的执行不需要对象。
 *      所以，一般情况下，我们会说静态方法"不存在"方法覆盖。
 *      不讨论静态方法的方法覆盖。
 */

public class OverrideTest05 {
    public static void main(String[] args){
        //静态方法可以使用"引用."方法调用吗？
        //虽然使用"引用."来调用，但是和对象无关。
        Animal a=new Cat();
        //静态方法和对象无关。
        //虽然使用"引用."来调用。但是实际运行的时候还是：Animal.doSome()
        a.doSome();//这一步会让程序员产生困惑，不建议用引用.调用静态方法。容易使人认为该方法为实例方法。
        Cat.doSome();
    }
}

class Animal{
    //父类的静态方法
    public static void doSome(){
        System.out.println("Animal的doSome方法执行");
    }
}

class Cat extends Animal{
    //尝试在子类当中对父类的静态方法进行重写。
    public static void doSome(){
        System.out.println("Cat的doSome方法执行");
    }
}
