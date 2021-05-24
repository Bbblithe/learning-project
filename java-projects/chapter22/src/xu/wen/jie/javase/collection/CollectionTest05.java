package xu.wen.jie.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/28 19:11
 * Description:
 * 测试contains方法
 * 结论：存放在一个集合中的类型，一定要重写equals方法。
 * 记住不管什么类，一定要重写equals方法。因为你不知道在什么地方用得到，但是总有机会能用到。
 */


class CollectionTest05 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c = new ArrayList();

        // 创建用户对象
        User u1 = new User("jack");
        User u2 = new User("jack");
        // 加入集合
        c.add(u1);

        // 判断集合中是否包含u2
        // 没有重写equals之前，这个结果是false
        //System.out.println(c.contains(u2)); //false
        // 重写equals方法之后，比较的时候会比较name。
        System.out.println(c.contains(u2)); // true

        /*Integer x = new Integer(10000);
        c.add(x);

        Integer y = new Integer(10000);
        System.out.println(c.contains(y)); //true*/

        // Integer类中的equals方法进行了重写。
        //x.equals(y)--->true;

        // 创建集合对象
        Collection cc = new ArrayList();
        // 创建字符串对象
        String s1 = new String("hello");
        // 加入字符串对象
        cc.add(s1);

        // 创建了一个新的字符串对象
        String s2 = new String("hello");
        // 删除s2对象
        cc.remove(s2);
        // 集合中元素的个数？
        System.out.println(cc.size());
        Iterator it = cc.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class User{
    private String name;
    public User(){

    }
    public User(String name){
        this.name = name;
    }

    // 没有重写equals方法
    // 将来调用equals方法的时候，一定要调用这个重写的equals方法。
    // 这个equals方法的比较原理是：只要姓名一样就表示同一个用户。
    public boolean equals(Object o){
        if(o == null ||!(o instanceof User)){
            return false;
        }
        if(o == this){
            return true;
        }
        User u = (User)o;
        // 如果名字一样表示同一个人，（不再比较对象的内存地址了，比较内容。）
        return u.name.equals(this.name);
    }
}