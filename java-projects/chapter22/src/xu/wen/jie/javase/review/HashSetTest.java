package xu.wen.jie.javase.review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/3 10:13
 * Description:
 * 1、创建集合对象
 * 2、向集合中添加元素
 * 3、取出集合中的元素
 * 4、遍历集合
 * 5、测试HashSet集合的特点：无序不可重复
 * 注意：HashSet的key，存储在HashMap集合的key部分，并且存储在key部分的元素需要重写hashCode + equals方法
 */


class HashSetTest {
    public static void main(String[] args) {
        // 创建集合对象
        Set<Integer> set = new HashSet<>();

        // 向集合中添加元素
        set.add(100);
        set.add(200);
        set.add(2001);
        set.add(123);
        set.add(1209);
        set.add(100);// 这里最后遍历出来的100只有一个，因为Set集合的特点。无序不可重复

        // 取出集合中的元素
        // 这个好像没法单独取出一个元素(set集合中的元素不能通过下标来取出来，Set集合没有下标)

        // 遍历集合（只有两种，因为Set接口的实现类具有：无序，且不可重复的特点）
        // foreach方式
        for(Integer no : set){
            System.out.println(no);
        }

        //迭代器的方法
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("------------------------------------------");

        // Set类型的集合好像还可以排序-通过java.util.Collections这个工具类
        // 草记错了，应该是list集合
        // 通过ArrayList的构造方法将一个Set集合转换成一个List集合
        List<Integer> list = new ArrayList(set);

        // 排序前
        for(Integer no : list){
            System.out.println(no);
        }

        System.out.println("________________________________________");

        // 排序后
        Collections.sort(list);
        for(Integer no : list){
            System.out.println(no);
        }

        // 创建Set集合，存储Student数据
        HashSet<Student> students = new HashSet<>();
        students.add(new Student(2015022136,"blithe"));
        students.add(new Student(2015022135,"andy"));
        students.add(new Student(2015022132,"zhangxiaocun"));
        students.add(new Student(2015022136,"blithe"));

        System.out.println(students.size());//3

        for(Student student : students){
            System.out.println(student);
        }
    }
}

class Student{
    int no;
    String name;

    public Student() {

    }

    public Student(int no,String name){
        this.name = name;
        this.no = no;
    }

    public String toString(){
        return "学生名字"+name+"，学号"+no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }
}
