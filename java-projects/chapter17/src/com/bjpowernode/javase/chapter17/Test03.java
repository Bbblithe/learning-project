package com.bjpowernode.javase.chapter17;

//import java.util.Scanner;
import java.util.*;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/3 21:41
 * Description:
 */


public class Test03 {
    public static void main(String[] args){
        //为什么要这样写？
        //Test03类和Scanner类不在同一个包下。
        //java.util就是Scanner的包名。
        Scanner s=new Scanner(System.in);
        String str = s.next();
        System.out.println("您输入的字符串是----->:"+str);

        java.lang.String name= "zhangsan";
        System.out.println("名字是："+name);

        String username="lisi";
        System.out.println("名字是："+username);
    }
}
