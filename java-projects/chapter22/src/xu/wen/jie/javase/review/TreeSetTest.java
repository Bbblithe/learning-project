package xu.wen.jie.javase.review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/3 10:30
 * Description:
 * 1、创建集合元素（new对象）
 * 2、向集合中添加元素
 * 3、取出集合中的元素
 * 4、遍历集合
 * 5、测试TreeSet集合中的元素是可排序的。
 * 6、测试TreeSet集合中存储的类型是自定义的。
 * 7、测试实现Comparable接口的方式
 * 8、测试实现Comparator接口的方式（最好测试一下匿名内部类的方式。）
 */


class TreeSetTest {
    public static void main(String[] args) {
        // 创建集合对象
        TreeSet<String> treeSet = new TreeSet(new Comparator<String>(){// 这里使用的是匿名内部类。
            public int compare(String o1 , String o2){
                return o1.compareTo(o2);
            }
        });

        // 向集合中添加元素
        treeSet.add("hello");
        treeSet.add("world");
        treeSet.add("nimade");
        treeSet.add("zilv");
        treeSet.add("niyoubushi meijianguonvsheng");

        // 取出集合中的元素
        // 取得出来个屁，这个底层是TreeMap，放的String，是放到底层TreeMap的key部分。

        // 遍历集合(两种遍历方式，因为不像List有序（指的是有下标，存进去是什么顺序，取出来就是什么顺序），所以就没法按照下标来取出元素)
        for(String s : treeSet){
            System.out.println(s);
        }

        Iterator<String> it = treeSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("---------------------------");

        // 使用排序方法，可以给其排序（先需要通过ArrayList()的构造方法，将这个Set类型的treeSet传进去，返回一个List类型的集合。）
        // 然后使用java.util.Collections这个工具类，的sort方法进行排序
        List<String> treeList = new ArrayList<>(treeSet);
        // 排序之前
        for(String tree : treeList){
            System.out.println(tree);
        }

        System.out.println("________________________________");
        // 排序之后，也是一样的，因为TreeMap本身就是放入之后就会默认排序的数组。
        Collections.sort(treeList);
        for(String tree : treeList){
            System.out.println(tree);
        }

        // TreeSet集合中存储自定义类型
        TreeSet<A> as = new TreeSet<>();
        as.add(new A(10));
        as.add(new A(100));
        as.add(new A(1234));
        as.add(new A(19));
        as.add(new A(19));
        System.out.println(as.size());

        // 遍历
        for(A a : as){
            System.out.println(a);
        }

        TreeSet<B> bs = new TreeSet<>(new BComparator());
        bs.add(new B(100));
        bs.add(new B(200));
        bs.add(new B(123));
        bs.add(new B(120));
        bs.add(new B(50));

        for(B b : bs){
            System.out.println(b);
        }

        TreeSet<B> bTree = new TreeSet<>(new Comparator<B>(){
            public int compare(B o1 , B o2){
                return o1.i - o2.i;
            }
        });

        bTree.add(new B(1203));
        bTree.add(new B(100));
        bTree.add(new B(200));
        bTree.add(new B(123));
        bTree.add(new B(120));
        bTree.add(new B(50));

        for(B b : bTree){
            System.out.println(b);
        }
    }
}

// 使用这个方法可以达到倒序的方式存取
class treeSetComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}

// 第一种方式（实现Comparable接口的）
class A implements Comparable<A>{
    int i;
    public A(int i){
        this.i = i;
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                '}';
    }

    public int compareTo(A o){
        return this.i - o.i;
    }
}

class B{
    int i;
    public B(int i){
        this.i = i;
    }

    @Override
    public String toString() {
        return "B{" +
                "i=" + i +
                '}';
    }
}

class BComparator implements Comparator<B>{
    @Override
    public int compare(B o1, B o2) {
        return o1.i - o2.i;
    }
}