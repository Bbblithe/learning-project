package com.bjpowernode.javase.string;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/13 15:25
 * Description:
 *  垃圾回收器是不会回收常量的，也就是说常量池中的字符串对象也不会被回收
 */


class StringTest02 {
    public static void main(String[] args) {
        String s1 = "hello";
        // "hello"是存储在方法区的字符串常量池当中
        //所以这个"hello"不会新建。（因为这个对象已经存在了）
        String s2 = "hello";

        // 分析结果是true 还是false ？
        // 因为都是hello ，都是存储在方法区的常量池中， 但是s2这个变量存的是常量池中的内存地址，并不会创建新的"hello"对象
        System.out.println(s1==s2);//"=="双等号比较的是变量中保存的内存地址

        String x =new String("xyz");
        String y =new String("xyz");

        // 分析结果是true 还是false ？
        // 虽然说都是"xyz"，"xyz"在常量池中的内存地址都相同，但是采用的是new一个对象的方式赋给"x"和"y"变量
        // 两个String类型对象中保存的才是常量次中的字符串对象的内存地址！
        // 因此x保存的是一个String对象类型的地址，y保存的是另一个String对象类型的地址。所以最后使用"=="结果不同
        System.out.println(x==y);//false

        // 通过上面这个案例的学习，我们知道了，字符串对象之间的比较不能使用"=="
        // "==" 不保险。应该调用String类的equals方法。
        //String类已经重写了equals方法，以下的方法调用的是String重写之后的equals方法。
        System.out.println(x.equals(y));// true

        //String k =new String("testString");
        String k =null;
        // "testString"这个字符串为什么可以加".equals"呢？
        // 因为"testString" 是一个String字符串对象。只要是对象都能调用方法。
        System.out.println("testString".equals(k)); // 建议使用这种方式，因为这种可以避免空指针异样。
        System.out.println(k.equals("testString")); // 这里是空的引用调用.equals 方式，会出现空指针异常的风险。不建议这样写
    }
}
