package xu.wen.jie.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/31 22:01
 * Description:
 * 1、JDK5.0之后推出的新特性：泛型
 * 2、泛型这种语法机制，只在程序编译阶段起作用，只是给编译器参考的。（运行阶段泛型没用）
 * 3、使用了泛型好处是什么？
 *      第一：集合中存储的元素统一了。
 *      第二：从集合中取出的元素类型是泛型指定的类型，不需要大量的"向下转型"！
 *
 * 4、泛型的缺点是什么？
 *      导致集合中存储的元素缺乏多样性。
 *      大多数业务中，集合元素的类型还是统一的。所以这种泛型特性被大家所认可。
 *
 * 5、
 */


class GenericTest01 {
    public static void main(String[] args) {
        /*
        // 不使用泛型机制，分析程序存在缺点
        List myList = new ArrayList();

        // 准备对象
        Cat c = new Cat();
        Bird b = new Bird();

        // 将对象添加到集合当中
        myList.add(c);
        myList.add(b);

        // 遍历集合，取出Cat让他抓老鼠，取出Bird让他飞
        // 1、这是使用List接口有下标的方式特有的迭代方式
        for(int i = 0 ; i < myList.size() ; i++){
            if(myList.get(i) instanceof Cat){
                ((Cat) myList.get(i)).catchMouse();
                ((Cat) muList.get(i)).move();
            }else if(myList.get(i) instanceof Bird){
                ((Bird) myList.get(i)).fly();
                ((Bird) myList.get(i)).move();
            }
        }

        // 2、这是正常的迭代方式使用迭代器迭代
        Iterator it =myList.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(obj instanceof Bird){
                ((Bird)obj).fly();
                ((Bird)obj).move();
            }else if(obj instanceof Cat){
                ((Cat)obj).catchMouse();
                ((Cat)obj).move();
            }
        }

         */

        // 使用JDK5之后的泛型机制
        // 使用泛型list<Animal>之后，表示List集合中只允许存储Animal类型的数据。
        // 用泛型来指定集合中存储的数据类型。
        List<Animal> myList = new ArrayList<Animal>();

        // 指定list集合中只能存储Animal，那么存储String就编译报错了。
        // 这样使用了"泛型"之后，集合中元素的数据类型就更加统一了。
        //myList.add("aggc");

        Cat c= new Cat();
        Bird b = new Bird();

        myList.add(c);
        myList.add(b);

        // 获取迭代器
        // 这个表示迭代器迭代的是Animal类型。
        Iterator<Animal> it = myList.iterator();
        while(it.hasNext()){
            Animal a = it.next();
            // 调用子类型特有的方法还是需要向下转型的！
            if(a instanceof Cat){
                // 使用泛型之后，每一次迭代的类型都是Animal类型。
                ((Cat) a).catchMouse();
                // 这里不需要强制类型转换，但是由于我重写了方法，我想调用的是Cat类重写之后的方法，所以第二个我强转了
                a.move(); // 直接调用Animal类的move()方法。
            }else if(a instanceof Bird){
                ((Bird) a).fly();
                ((Bird) a).move();
            }
        }
    }
}

class Animal{
    // 父类自带方法
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    // 特有方法
    public void catchMouse(){
        System.out.println("猫在抓老鼠！");
    }

    // 重写move()方法
    public void move(){
        System.out.println("猫咪在走猫步！");
    }
}

class Bird extends Animal{
    // 特有方法
    public void fly(){
        System.out.println("鸟儿在飞翔！");
    }
    public void move(){
        System.out.println("小鸟在跳跳！");
    }
}
