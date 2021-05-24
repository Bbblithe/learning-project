package xu.wen.jie.javase.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/2 10:54
 * Description:
 * HashMap集合key部分允许null吗？
 *      允许
 *      但是要注意：HashMap集合的key null值只能有一个。
 *      有可能面试的时候会遇到这样的问题
 */


class HashMapTest03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        // HashMap集合允许key为null
        map.put(null,null);
        System.out.println(map.size());// 1

        // key重复的话，value会覆盖
        map.put(null,100);
        System.out.println(map.size());

        // 通过key获取value
        System.out.println(map.get(null));// 100

    }
}
