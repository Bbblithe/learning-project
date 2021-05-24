package test021;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/19 14:42
 * Description:
 * 关于java语言当中的final关键字：
 *      1、final是一个关键字，表示最终的，不可变。
 *      2、final修饰的类无法被继承
 *      3、final修饰的方法无法被覆盖
 *      4、final修饰的变量一旦赋值之后，不可重新赋值
 *      5、final修饰的实例变量，必须手动赋值，不能采用系统默认赋值。
 *      6、final修饰的引用，一旦指向某个对象之后，不能在指向其他对象，那么被指向的对象无法被垃圾回收器回收。
 *      7、final修饰的引用虽然指向某个对象之后不能指向其他对象，但是所指向的对象内部的内存是可以被修改的。
 *      8、final修饰的实例变量，一般和static联合使用，被称为常量。
 *
 *
 * 以后尽量所有的程序都链接源码。
 * 养成看源代码的好习惯。
 *
 * 对于以后大家所学习的类库，一般都是包括三个部分的：
 *          - 源码【可以看源码来理解程序】
 *          - 字节码【程序开发的过程中使用的就是这部分】
 *          - 帮助文档【对源码的解释说明被提取出来，更方便程序的开发】【对开发提供帮助】
 * 注意JDK版本统否则不统一不同的说明
 */


class FinalTest01 {
    public static void main(String[] args){
        String newString="abcdefadefaay".replace("a","x");
        System.out.println(newString);
        int i=10;
        i=20;
        System.out.println(i);
        final int k=100;
        //编译错误
        //k=10; // 无法为最终变量分配值

        final int m;
        m=200;

        //m=203;一旦赋值后无法二次赋值。最终就是该第一次的赋值
    }
}
/*
class MyString extends String{
//由于SUN公司将该方法进行了final处理。
则无法继承该方法，防止你重写方法。


}

 */
