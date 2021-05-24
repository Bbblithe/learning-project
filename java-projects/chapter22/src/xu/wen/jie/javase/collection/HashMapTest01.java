package xu.wen.jie.javase.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/1 16:12
 * Description:
 * HashMap集合：
 *      1、HashMap集合底层是哈希表/散列表的数据结构。
 *      2、哈希表是一个怎样的数据结构呢？
 *          哈希表是一个数组和单向链表的结合体。
 *          数组：在查询方面效率很高，随机增删方面效率很低。
 *          单向链表：在随机增删方面效率较高，在查询方面效率很低。
 *          哈希表将以上的两种数据结构融合在一起，充分发挥它们各自的优点。
 *      3、HashMap集合底层的源代码：
 *          public class HashMap{
 *              // HashMap底层实际上就是一个数组。（一维数组）
 *              transient Node<K,V>[] table;
 *              //静态的内部类HashMap.Node
 *              static class Node<K,V> implements Map.Entry<K,V>{
 *                  final int hash; // 哈希值（哈希值是key的hashCode()方法的执行结果。hash值通过哈希算法/函数，可以转换存储成数组的下标。）
 *                  final K key; // 存储到Map集合中的那个key
 *                  V value;// 存储到Map结合中的那个value
 *                  Node<K,V> next; // 下一个节点的内存地址。
 *              }
 *          }
 *          哈希表/散列表：一维数组，这个数组中每一个元素是一个单项链表。(数组和链表的结合体。)
 *      4、最主要掌握的是：
 *          map.put(k,v)
 *          v = map.get(k)
 *          以上这两个方法实现的原理，是必须掌握的。
 *      5、HashMap集合的key部分特点：
 *          无序、不可重复。
 *          为什么无序？因为不一定挂到哪个单向链表上。
 *          不可重复是怎么保证的？equals方法来保证HashMap集合的key不可重复。
 *          如果key重复了，value会覆盖。
 *
 *          放在HashMap集合key部分的元素其实就是放到HashSet集合中了。
 *          所以HashSet集合中的元素也需要同时重写hashCode()+equals()方法。
 *
 *      6、哈希表HashMap使用不当时无法发挥性能！
 *          假设将所有的hashCode()方法固定为某个值，那么会导致底层哈希表变成了
 *          纯单向链表。这种情况我们称为：散列分布不均匀。
 *          什么是散列分布均匀？
 *              假设有100个元素，10个单向链表，那么每个单向链表上有10个节点，这是最好的，
 *              是散列分布均匀的。
 *
 *          将所有的hashCode()方法返回值都是设定为不一样的值，可以吗？有什么问题？
 *              不行，因为这样的话导致底层哈希表就成为一维数组了，没有链表的概念了。
 *              也是散列不均匀。
 *          散列分布均匀需要你重写hashCode()方法是有一定的技巧。
 *
 *      7、重点：放在HashMap集合key部分的元素，以及放在HashSet集合中的元素，需要同时重写hashCode和equals方法。
 *      8、HashMap集合的默认初始化容量是16，默认加载因子是0.75
 *          这个默认加载因子是当HashMap集合底层数组的容量达到75%的时候，数组开始扩容。
 *
 *          重点，记住：HashMap集合初始化容量必须是2的倍数，这也是官方推荐的，//The default initial capacity - MUST be a power of two.
 *          这是因为达到散列分布均匀，为了提高HashMap集合的存取效率，所必须的。
 */


class HashMapTest01 {
    public static void main(String[] args) {
        // 测试HashMap集合key部分的元素特点
        // Integer是key，它的hashCode和equals都重写了。
        Map<Integer,String> map = new HashMap<>();
        map.put(1111,"zhangsan");
        map.put(6666,"lisi");
        map.put(7777,"wangwu");
        map.put(2222,"zhaoliu");
        map.put(2222,"king"); // key重复的时候value会自动覆盖

        System.out.println(map.size()); // 4

        // 遍历Map集合
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for(Map.Entry<Integer,String> entry : set){
            // 验证结果：HashMap集合key部分：无序不可重复
            System.out.println(entry.getKey()+ "=" + entry.getValue());
        }
    }
}
