package xu.wen.jie.javase.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/31 20:43
 * Description:
 * Vector:
 *      1、底层也是一个数组。
 *      2、初始化容量：10
 *      3、怎么扩容的？
 *          扩容之后是愿容量的2倍。
 *          10 -- > 20
 *          20 -- > 40
 *          40 -- > 80
 *      4、ArrayList集合扩容特点：
 *          ArrayList集合扩容是原容量的1.5倍。
 *          10 -- >15 -- > (22.5)15*1.5
 *
 *      5、Vector 中所有方法都是线程同步的，都带有synchronized关键字，
 *      是线程安全的。（效率比较低，使用较少）
 *
 *      6、怎么将一个线程不安全的ArrayList集合转换成线程安全的呢？
 *          使用集合工具类：
 *              java.util.Collection;
 *
 *              java.util.Collection 是集合接口。
 *              java.util.Collections 是集合工具类。
 */


class VectorTest01 {
    public static void main(String[] args) {
        // 创建一个Vector集合
        List vector = new Vector();
        //Vector vector = new Vector();

        // 添加元素
        // 默认容量10个
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);

        // 满了之后扩容
        vector.add(11);

        Iterator it = vector.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        // 这个可能以后要使用！！1
        List myList = new ArrayList();// 非线程安全的。

        // 变成线程安全的
        Collections.synchronizedList(myList);// 这里没有办法看效果，因为多线程没学，你先记住！

        // myList集合就是线程安全的了。
        myList.add("111");
        myList.add("222");
        myList.add("333");

    }
}
