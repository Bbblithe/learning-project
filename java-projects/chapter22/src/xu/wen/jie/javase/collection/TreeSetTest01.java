package xu.wen.jie.javase.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/1 09:47
 * Description:
 * TreeSet集合存储元素的特点：
 *      1、无序不可重复的，但是存储的元素可以自动按照大小顺序排序！
 *      称为：可排序集合
 *
 *      2、无序：这里的无序指的是存进去的顺序和取出来的顺序不同，并且没有下标。
 */


class TreeSetTest01 {
    public static void main(String[] args) {
        // 创建集合对象
        Set<String> strs = new TreeSet<>();

        // 添加元素
        strs.add("abc");
        strs.add("B");
        strs.add("C");
        strs.add("D");
        strs.add("F");
        strs.add("Z");
        strs.add("A");
        strs.add("M");
        strs.add("a");

        // 遍历
        /*
        A
        B
        C
        D
        F
        M
        Z
        a
        abc
        从小到大自动排序
         */
        for(String i : strs){
            System.out.println(i);
        }
    }
}
