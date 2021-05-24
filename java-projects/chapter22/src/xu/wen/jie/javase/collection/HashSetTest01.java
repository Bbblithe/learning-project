package xu.wen.jie.javase.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/1 09:41
 * Description:
 * HashSet集合：
 *      无序不可重复。
 */


class HashSetTest01 {
    public static void main(String[] args) {
        // 演示一下HashSet集合特点
        Set<String> set = new HashSet<>();

        // 添加元素
        set.add("niMade");
        set.add("hello1");
        set.add("hello2");
        set.add("hello3");
        set.add("hello4");
        set.add("hello3");
        set.add("hello3");

        // 遍历
        /*
        niMade
        hello1
        hello4
        hello2
        hello3
        1、存储时顺序和取出顺序不同。
        2、不可重复
        3、放大HashSet集合中的元素实际上是放到了HashMap集合的key部分了。
         */
        for(String i : set){
            System.out.println(i);
        }
    }
}
