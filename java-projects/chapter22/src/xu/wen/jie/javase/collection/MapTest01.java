package xu.wen.jie.javase.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/1 10:09
 * Description:
 * java.util.Map接口中常用的方法：
 *      1、Map和Collection没有继承关系。
 *      2、Map集合以key和value的方式存储数据：键值对
 *          key和value都是引用数据类型。
 *          key和value都是存储对象的内存地址
 *          key起到主导的地位，value是key的一个附属品。
 *      3、Map接口中常用方法：
 *          V put(K key, V value) 想Map集合中添加键值对
 *          V get(Object key) 通过key获取value
 *          void clear() 清空Map集合
 *          boolean containsKey(Object key) 判断Map中是否包含某个key
 *          boolean containsValue(Object value) 判断Map中是否包含某个value
 *          boolean isEmpty() 判断Map集合中的元素个数是否为0
 *          V remove(Object key) 通过key删除键值对
 *          int size() 获取Map集合中键值对的个数
 *          Collection<V> values() 获取Map集合中所有的value，返回一个Collection
 *
 *          Set<K> keySet() 获取Map集合所有的key（所有的键是set集合）
 *
 *          Set<Map.Entry<K,V>> entrySet()
 *              将Map集合转换成Set集合
 *              假设现在有一个Map集合，如下所示：
 *                  map1集合对象
 *                  key             value
 *                  ----------------------------
 *                  1               zhangsan
 *                  2               lisi
 *                  3               wangwu
 *                  4               zhaosi
 *
 *                  Set set = map1.entrySet();
 *                  set集合对象
 *                  1=zhangsan 【注意：Map集合通过entrySet()方法转换成的这个Set集合，Set集合中元素的类型是Map.Entry<K,V>】
 *                  2=lisi      【Map。Entry和String一样，都是一种类型的名字，只不过：Map.Entry是静态内部类，是Map中的静态内部类】
 *                  3=wangwu
 *                  4=zhaoliu --- >这个东西是个什么？：Map.Entry
 */


class MapTest01 {
    public static void main(String[] args) {
        // 创建Map集合对象
        Map<Integer,String> map = new HashMap<>();

        // 向Map集合里添加键值对
        map.put(1,"zhangsan"); // 1在这里进行了自动装箱。
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");

        // 通过key获取value
        String s1Value = map.get(2);
        System.out.println(s1Value);

        // 获取键值对的数量
        System.out.println("键值对的数量：" + map.size());

        // 通过key删除key-value
        map.remove(2);// 注意这里的删除之后，第二个元素直接是空null，而不是将第三个元素填入第二个元素中，跟数组结构不一样
        String s2Value = map.get(2);
        System.out.println(s2Value); //null
        System.out.println(map.size());

        // 判断是否包含某个key
        // contains方法底层调用的都是equals进行比对的，所以自定义的类型需要重写equals方法。
        System.out.println(map.containsKey(2)?"包含":"不包含"); //false

        // 判断是否包含某个value
        System.out.println(map.containsValue("lisi")?"包含":"不包含"); //false

        // 获取所有的value
        Collection<String> values = map.values();
        for(String data : values){
            System.out.println(data);
        }

        // 清空map集合
        map.clear();
        System.out.println("键值对的数量："+map.size());

        // 判断是否为空
        System.out.println(map.isEmpty()?"空":"不空"); // true
    }
}
