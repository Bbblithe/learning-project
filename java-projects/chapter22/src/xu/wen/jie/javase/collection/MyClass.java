package xu.wen.jie.javase.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/1 10:42
 * Description:
 */


class MyClass {

    // 声明一个静态内部类
    private static class InnerClass{
        // 实例方法m2
        public void m2(){
            System.out.println("静态内部类的m2实例方法执行");
        }

        // 静态方法
        public static void m1(){
            System.out.println("静态内部类的m1方法执行");
        }
    }

    public static void main(String[] args) {
        // 类名叫做：MyClass.InnerClass
        MyClass.InnerClass.m1();

        // 创建静态内部类对象
        MyClass.InnerClass mic =  new MyClass.InnerClass();
        mic.m2();

        // 给一个Set集合
        // 该Set集合中存储的对象是：MyClass.InnerClass类型
        Set<MyClass.InnerClass> set = new HashSet<>();

        // 这个Set集合中存储的是字符串对象。
        Set<String> set2 = new HashSet<>();

        Set<MyMap.MyEntry<Integer,String>> set3 = new HashSet<>();
    }
}

class MyMap{
    public static class MyEntry<K,V>{

    }
}