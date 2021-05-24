package xu.wen.jie.javase.collection;

import java.util.TreeSet;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/2 16:22
 * Description:
 * 先按照年龄升序，如果年龄一样的再按照姓名升序。
 */


class TreeSetTest05 {
    public static void main(String[] args) {

        // 创建Vip对象
        Vip v1 = new Vip(21,"zhangsan");
        Vip v2 = new Vip(22,"blithe");
        Vip v3 = new Vip(23,"wuwenjie");
        Vip v4 = new Vip(22,"xuwenjie");
        Vip v5 = new Vip(21,"andy");

        // 创建集合对象
        TreeSet<Vip> vips = new TreeSet<>();

        // 向TreeSet集合中添加元素
        vips.add(v1);
        vips.add(v2);
        vips.add(v3);
        vips.add(v4);
        vips.add(v5);

        // 遍历
        for(Vip vip : vips){
            System.out.println(vip);
        }
    }
}

class Vip implements Comparable<Vip>{
    int age;
    String name;

    public Vip(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "vip用户"+name+"[age="+age+"]" ;
    }

    /*
    compareTo方法的返回值很重要：
        返回0表示相同，value会覆盖
        返回值>0，会继续再右子树上找。【10 - 9 = 1 ，1>0说明左边这个数字比较大，所以会在右子树上找。】
        返回值<0，会继续再左子树上找。【5 - 10 = -5，-5<0说明右边这个数字比较大，所以会在左子树上找。】
     */
    public int compareTo(Vip v){
        // 写排序规则，按照什么进行比较。
        if(this.age == v.age){
            return this.name.compareTo(v.name);
        }else{
            return this.age - v.age;
        }
    }
}