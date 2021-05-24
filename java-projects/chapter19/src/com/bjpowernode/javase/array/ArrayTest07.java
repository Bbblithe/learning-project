package com.bjpowernode.javase.array;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/6 14:42
 * Description:
 *  一维数组的深入，数组中存储的类型为：引用数据类型
 *  对于数组来说，实际上只能存储java对象的"内存地址"。数组中存储的每个元素是"引用"。
 */


class ArrayTest07 {
    public static void main(String[] args) {

        // a是一个数组
        // a[0]是数组中的一个元素（表示的就是第一个元素）
        // a[1]也是数组重的一个原属(表示的就是第二个元素)
        int[] a={100,200,300};
        System.out.println(a[0]);

        Animal a1=new Animal();
        Animal a2=new Animal();
        //创建一个Animal的数组
        Animal[] animals = {a1,a2};

        // 对Animal数组进行遍历
        for (int i=0;i<animals.length;i++){
            /*
            Animal a=animals[i];
            a.move();
            */
            //上面代码合并
            animals[i].move();//这个move()方法不是数组的。是数组当中Animal对象的move()方法。
        }

        //动态初始化一个长度为2的Animal类型数组。
        Animal[] ans=new Animal[2];
        //创建一个Animal对象放到数组的第一个盒子中。
        ans[0]=new Animal();

        // Animal 数组中只能存放Animal类型，不能存放Product类型。
        //ans[1]=new Product();编译报错：Incompatible types. Found: 'com.bjpowernode.javase.array.Product', required: 'com.bjpowernode.javase.array.Animal'

        //Animal数组中，可以存放Cat类型的数据，因为Cat是一个Animal。
        // Cat是一个Animal的子类。
        ans[1]=new Cat();

        //创建一个animal类型的数组，数组当中存储Cat和Bird
        Animal[] anis={new Cat(),new Bird()}; //该数组汇总存储了两个对象的内存地址。
        for(int i=0;i<anis.length;i++){
            // 这个取出来的可能是Ca，t也可能是Bird，不过肯定但是Animal
            // 如果调用的方法是父类中存在的方法不需要向下转型。直接使用父类型引用调用即可。
            anis[i].move();
            
            //调用子对象特有的方法的话，需要向下转型！！！
            if(anis[i] instanceof Cat){
                ((Cat) anis[i]).catchMouse();
            }
            else if(anis[i] instanceof Bird){
                ((Bird) anis[i]).sing();
            }
        }
    }
}

class Animal{
    public void move(){
        System.out.println("Animal move");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步！");
    }

    //特有的方法
    public void catchMouse(){
        System.out.println("猫抓老鼠！！！");
    }
}

//商品类
class Product{

}

//Bird子类
class Bird extends Animal{
    public void move(){
        System.out.println("Bird fly");
    }

    //特有方法
    public void sing(){
        System.out.println("鸟儿在唱歌！！！");
    }
}
