package xu.wen.jie.javase.review;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/3 10:07
 * Description:
 * 1、创建集合对象
 * 2、向集合中添加元素
 * 3、取出集合中的元素
 * 4、遍历集合
 */


class LinkedListTest {
    public static void main(String[] args) {
        // 创建集合对象
        List<String> linkedList = new LinkedList<>();

        // 向集合中添加元素
        linkedList.add("nihao");
        linkedList.add("wodiaonimade");
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("kitty");

        // 取出集合中的元素
        System.out.println(linkedList.get(3));

        // 遍历集合
        for(String s : linkedList){
            System.out.println(s);
        }

        for(int i = 0 ; i < linkedList.size() ; i++){
            System.out.println(linkedList.get(i));
        }

        Iterator<String> it = linkedList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
