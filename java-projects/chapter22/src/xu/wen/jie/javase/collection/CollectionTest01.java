package xu.wen.jie.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/28 09:29
 * Description:
 * 关于java.util.Collection接口中常用的方法。
 *      1、Collection中能够存放什么元素？
 *          没有使用"泛型"之前，Collection中可以存在Object的所有子类型。
 *          使用了"泛型"之后，Collection中只能存储某个具体的类型。
 *          集合后期我们会学习"泛型"语法。目前先不管。Collection中什么都能够存储，
 *          只要是Object的子类型就行。（集合中不能直接存储基本数据类型，也不能存
 *          java对象，只是存储java对象的内存地址。）
 *      2、Collection中的常用方法。
 *          boolean add(Object e) 向集合中添加元素
 *          int size() 获取集合中元素的个数
 *          void clear() 清空集合
 *          boolean contains(Object o) 判断当前集合中是否包含元素o，包含返回true，不包含返回false
 *          boolean remove(Object c) 删除集合中的某个元素。
 *          boolean isEmpty() 判断该集合中元素的个数是否为0
 *          Object[] toArray() 调用这个方法可以把这个集合转换成数组。
 */


class CollectionTest01 {
    public static void main(String[] args) {
        // 创建一个集合对象
        //Collection c =new Collection();// 接口是抽象的，无法实例化。
        // 多态
        Collection c = new ArrayList();
        // 测试Collection接口中的常用方法
        c.add(100);// 自动装箱(java5的新特性)，实际上是放进去了一个对象的内存地址。Integer x = new Integer(100);
        c.add(3.14);// 自动装箱
        c.add(new Object());
        c.add(new Student());
        c.add(true);// 自动装箱

        // 获取集合元素的个数
        System.out.println("集合中元素的个数是："+c.size()); // 5

        // 清空集合
        c.clear();
        System.out.println("集合中元素的个数是："+c.size());

        // 再向集合中添加元素
        c.add("hello");// "hello"对象的内存地址放到了集合当中。
        c.add("world");
        c.add("浩克");
        c.add("绿巨人");
        c.add(1);

        // 判断集合中是否包含"绿巨人"
        boolean flag = c.contains("绿巨人");
        System.out.println(flag); // true
        boolean flag2 =c.contains("绿巨人2");
        System.out.println(flag2);// false
        System.out.println(c.contains(1)); // true

        System.out.println(c.size());// 5

        // 删除集合中某个元素
        c.remove(1);
        System.out.println(c.size());// 4

        // 判断集合是否为空（集合中是否存在元素）
        System.out.println(c.isEmpty());// false
        c.clear();
        System.out.println(c.isEmpty());// true表示集合中没有元素了。

        c.add("abc");
        c.add("def");
        c.add(100);
        c.add("helloWorld!");
        c.add(new Student());

        //转换成数组(了解，使用不多)
        Object[] objs = c.toArray();
        for(int i = 0 ; i < objs.length; i++){
            // 遍历数组
            System.out.println(objs[i]);
        }
    }
}

class Student{

}