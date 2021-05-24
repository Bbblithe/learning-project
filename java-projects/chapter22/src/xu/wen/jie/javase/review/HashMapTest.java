package xu.wen.jie.javase.review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/3 10:53
 * Description:
 * 1、创建集合对象（new）
 * 2、向集合中添加元素
 * 3、取出集合中的元素
 * 4、遍历集合
 */


class HashMapTest {
    public static void main(String[] args) {
        // 创建HashMap集合对象
        HashMap<Integer,String> hashMap = new HashMap<>();

        // 向集合中添加元素
        hashMap.put(1,"blithe");
        hashMap.put(9,"andy");
        hashMap.put(100,"hello");
        hashMap.put(5,"kitty");
        hashMap.put(5,"world");

        // 获取集合元素的个数
        System.out.println(hashMap.size());

        // 最后遍历出来的结果会发现4这个key已经存在，因此新的4的value"world"会将原先的"kitty"替换掉

        // 取出集合中的元素
        System.out.println(hashMap.get(3));
        System.out.println(hashMap.get(5));

        // 遍历元素(有两种类型的方法)

        //第一类，通过获取Map集合中所有的key

        //第一类的第一种
        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> it = keySet.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i + "=" + hashMap.get(i));
        }

        System.out.println("___________________________________");

        for(Integer key : keySet){
            System.out.println(key + "=" + hashMap.get(key));
        }

        System.out.println("————————————————————————————————————————");
        // 第二类，将整个Map集合转换成一个Set集合
        // 而转换成Set集合后，其中的元素是Entry<K,V>。
        Set<Map.Entry<Integer,String>> map_entrySet = hashMap.entrySet();

        // 第二类的第一种方法（这种方法效率比较高，因为获取key和value是直接从Node对象获取他的属性）
        // 这种方式比较适合大数据量
        for(Map.Entry<Integer,String> node : map_entrySet){
            System.out.println(node.getKey() + "=" + node.getValue());
        }

        System.out.println("——————————————————————————————————————————————");

        // 第二类方式的第二种方法
        Iterator<Map.Entry<Integer,String>> iterator = map_entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String> node = iterator.next();
            System.out.println(node.getKey() + "=" + node.getValue());
        }
    }
}
