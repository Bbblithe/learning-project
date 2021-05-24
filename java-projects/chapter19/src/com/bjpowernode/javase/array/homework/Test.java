package com.bjpowernode.javase.array.homework;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/8 09:24
 * Description:
 */


class Test {
    public static void main(String[] args) {
        Object o1=new Bird();
        Object o2=new Animal();
        Object o3=new Cat();
        Object o4=new Object();
        Object o5="xiXi";
        MyStack sta=new MyStack();
        sta.push(o1);
        sta.push(o2);
        sta.push(o3);
        sta.push(o4);
        sta.push(o5);
        sta.push(new Cat());
        sta.push(new Object());
        sta.push(new Animal());
        sta.push(new Bird());
        sta.push("nimade");

        sta.pop();
        sta.pop();
        sta.pop();
        sta.pop();
        sta.pop();
        sta.pop();
        sta.pop();
        sta.pop();
        sta.pop();
        sta.pop();
        sta.pop();

    }
}
