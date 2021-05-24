package xu.wen.jie.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/28 17:11
 * Description:
 * 深入Collection集合的contains方法：
 *      boolean contains(Object o)
 *          判断集合是否含某个对象。
 *          如果包含返回true，如果不包含返回false。
 *
 *      contains方法是用来判读集合中是否包含某个元素的方法，
 *      那么它在底层是怎么判断集合是否包含某个元素的呢？
 *          调用了equals方法进行比对。
 *          equals方法返回true，就表示包含这个元素。
 */


class CollectionTest04 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c = new ArrayList();

        // 向集合中存储元素
        String s1 = new String("abc");// s1 = 0x1231
        c.add(s1);

        String s2 = new String("def");// s2 = 0x1312
        c.add(s2);

        // 集合中元素的个数
        System.out.println("c中元素的个数："+c.size()); // 2
        String x = new String("abc");// x = 0x5555
        // c集合中是否包含x？结果猜测以下是true还是false
        System.out.println(x.equals(s1));
        System.out.println(c.contains(x));// true
        // 从这里可以得出它底层调用了equals方法。因此c集合中包含x元素
    }
}
