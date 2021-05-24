package com.bjpowernode.javase.array.homework;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/7 19:52
 * Description:
 */

//Object[] 这是一个万能的口袋，这个口袋中可以装任何引用数据类型的数据。
class ArrayTest13 {
    public static void main(String[] args) {
        String s1=new String("xixiixixixi");
        //上面的s1 其实就是下面的s 都是同样的意义，但是String这个引用数据类型在java中要特殊一点，可以不需要new对象就单用"xxxx"就可以实现一个对象。
        String s="xixiafhafa";

        //注意："abc" 这是一个字符串对象，字符串在java中有优待，不需要new也是一个对象。
        //"abc"字符串也是java对象，属于String类型。
       Object[] arr={new Husband(),new Wife(),"abc"};
    }
}

class Husband{

}

class Wife{

}