package com;

//将需要的类导入。
import com.bjpowernode.javase.chapter17.*;
/**
 * Author:  blithe.xwj
 * Date:    2020/12/3 21:28
 * Description:
 */


public class Test02 {
    public static void main(String[] args){
        /*
            Test02在com包下
            HelloWorld在com.bipowernode.javase.chapter17下。
            不在同一个package下，包名可以省略吗？
                不能省略。
         */
        //错误：找不到符号
        /*
        HelloWorld hw2=new HelloWorld();
        System.out.println(hw2);

         */

        HelloWorld w1=new HelloWorld();
        System.out.println(w1);

        HelloWorld w2=new HelloWorld();
        System.out.println(w2);

    }
}
