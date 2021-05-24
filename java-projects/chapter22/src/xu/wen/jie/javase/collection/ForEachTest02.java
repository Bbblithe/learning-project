package xu.wen.jie.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/1 09:15
 * Description:
 * 集合使用foreach
 */


class ForEachTest02 {
    public static void main(String[] args) {
        // 创建List集合
        List<String> list = new ArrayList<>();

        // 添加元素
        list.add("niMde");
        list.add("haHah");
        list.add("hello");
        list.add("world");

        // 遍历使用迭代器方式
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        // 使用下标的方式（只针对有下标的集合）
        // 普通for循环
        for(int i = 0 ; i < list.size() ; i ++){
            System.out.println(list.get(i));
        }

        System.out.println("=======================================================");

        // 使用foreach
        for(String data : list){ // 因为泛型使用的是String类型，所以是：String s
            System.out.println(data);
        }

        List<Integer> integerList = new ArrayList<>();
        integerList.add(100);
        integerList.add(200);
        integerList.add(300);

        for(Integer data : integerList){ // data代表集合中的元素
            System.out.println(data);
        }
    }
}
