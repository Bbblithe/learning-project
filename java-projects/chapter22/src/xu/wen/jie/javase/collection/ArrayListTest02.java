package xu.wen.jie.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/30 20:17
 * Description:
 * 集合ArrayList的构造方法
 */


class ArrayListTest02 {
    public static void main(String[] args) {
        // 默认初始化容量10
        List myList1 = new ArrayList();

        // 指定初始化容量100
        List myList2 = new ArrayList(100);

        // 创建一个HashSet集合
        Collection c = new HashSet();
        // 添加元素到c集合中（底层是以恶哈希表）
        c.add(100);
        c.add(200);
        c.add(900);
        c.add(50);

        // 通过这个构造方法就可以将HashSet集合转换成List集合。
        List myList3 = new ArrayList(c);
        for(int i = 0 ; i < myList3.size();i ++ ){
            System.out.println(myList3.get(i));
        }
    }
}
