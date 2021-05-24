package xu.wen.jie.javase.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/3 09:30
 * Description:
 * java.util.Collection 集合接口
 * java.util.Collections 集合工具类，方便集合的操作。
 */


class CollectionsTest {
    public static void main(String[] args) {
        // ArrayList集合不是线程安全的。
        List<String> list = new ArrayList<>();

        // 变成线程安全的
        Collections.synchronizedList(list);

        // 排序
        list.add("abc");
        list.add("abe");
        list.add("adf");
        list.add("abx");

        Collections.sort(list);
        for(String s : list){
            System.out.println(s);
        }

        List<WuGui2> wuGuis = new ArrayList<>();
        wuGuis.add(new WuGui2(1000));
        wuGuis.add(new WuGui2(8000));
        wuGuis.add(new WuGui2(500));

        Collections.sort(wuGuis);

        for(WuGui2 gui : wuGuis){
            System.out.println(gui);
        }

        // 对Set集合怎么排序呢？
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("kingsoft");
        set.add("king2");
        set.add("king1");
        // 将Set集合转换成List集合
        List<String> myList = new ArrayList<>(set);
        Collections.sort(myList);
        for(String s : myList){
            System.out.println(s);
        }

        // 这种方式也能排序
        //Collections.sort(list集合,比较器对象);
    }
}

class WuGui2 implements Comparable<WuGui2>{
    int age;

    public WuGui2(int age){
        this.age = age;
    }

    public String toString(){
        if(age <= 1000){
            return "小乌龟今年"+age+"岁";
        }
        return "大乌龟今年"+age+"岁";
    }

    public int compareTo(WuGui2 wuGui2){
        return this.age - wuGui2.age;
    }
}