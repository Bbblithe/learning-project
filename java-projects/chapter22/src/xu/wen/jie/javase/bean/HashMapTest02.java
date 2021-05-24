package xu.wen.jie.javase.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/2 09:35
 * Description:
 * 1、向Map集合中存，以及从Map集合中取，都是先调用key的hashCode方法，然后再调用equals方法！
 * equals方法有可能调用，也有可能不调用。
 *      拿put(k,v)举例，什么时候equals不会调用？
 *          k.hashCode()方法返回哈希值，
 *          哈希值通过哈希算法转换成数组下标。
 *          数组下标位置上如果是null，equals不需要执行。
 *      拿get(k)举例，什么时候equals不会调用？
 *          k.hashCode()方法返回哈希值，
 *          哈希值通过哈希算法转换成数组下标。
 *          数组下标位置上如果是null，equals不需要执行。
 * 2、注意：如果一个类的equals方法重写了，那么hashCode方法必须重写。
 * 并且equals方法返回是true，hashCode()方法返回的值必须一样。
 *      equals方法返回true表示两个对象相同，在同一个单向链表上比较。
 *      那么对于同一个单向链表上的节点来说，它们的哈希值都是相同的。
 *      所以hashCode方法的返回值也应该相同。
 *
 * 3、hashCode()方法和equals()方法不用研究了，直接使用IDEA工具生成，但是这两个方法需要同时生成。
 *
 * 4、终极结论：
 *      放在HashMap集合key部分的，以及放在HashSet集合中的元素，需要同时重写hashCode方法和equals方法。
 *
 * 5、对于哈希表数据结构来说：
 *      如果o1和o2的hash值相同，一定是放到同一个单向链表上。
 *      当然如果o1和o2的hash值不同，但由于哈希算法执行结束之后转换的数组下标可能相同，此时会发生"哈希碰撞"。
 */


class HashMapTest02 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan");
        Student s2 = new Student("zhangsan");

        // 重写equals方法之前是false
        //System.out.println(s1.equals(s2)); //false

        // 重写equals方法之后是true
        System.out.println(s1.equals(s2));// true（s1和s2表示相等）

        System.out.println("s1的hashCode=" + s1.hashCode()); //603742814（重写hashCode之后-1432604525）
        System.out.println("s2的hashCode=" + s2.hashCode()); //951007336（重写hashCode之后-1432604525）

        // s1.equals(s2)结果已经是true了，表示s1和s2是一样的，相同的，那么往HashSet集合中放的话，
        // 按说只能放进去1个。（HashSet集合特点：无序不可重复）
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());// 这个结果按说是1,但是结果是2，显然不符合HashSet集合存储特点，怎么办？

    }
}
