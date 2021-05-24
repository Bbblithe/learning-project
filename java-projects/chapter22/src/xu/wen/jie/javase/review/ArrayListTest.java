package xu.wen.jie.javase.review;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/3 09:59
 * Description:
 * 1、每个集合对象的创建(new)
 * 2、向集合中添加元素
 * 3、从集合中取出某个元素
 * 4、遍历集合
 */


class ArrayListTest {
    public static void main(String[] args) {
        // 1、创建ArrayList对象
        ArrayList<String> arrayList = new ArrayList<>();

        // 2、添加元素
        arrayList.add("nimad");
        arrayList.add("wodiaonimad");
        arrayList.add("ddddd");
        arrayList.add("hello");

        // 3、从集合中取出某个元素
        System.out.println(arrayList.get(2));

        // 以下均是遍历集合，其中只有List集合能有三种方式，相比Map集合多出来的那种是由于List集合的特性，有序有下标。
        // foreach方式
        for(String s : arrayList){
            System.out.println(s);
        }

        // 这种是List集合相比Map集合多出来的一种特殊的遍历方式
        // (下标方式)
        for(int i = 0 ; i < arrayList.size() ; i ++){
            System.out.println(arrayList.get(i));
        }

        // 迭代器方式（这个是通用的，所有的Collection都可以用）
        Iterator<String> it = arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //上面的while循环修改为for循环也可以
        for(Iterator<String> it2 = arrayList.iterator();it2.hasNext(); ){
            System.out.println(it2.next());
        }
    }
}
