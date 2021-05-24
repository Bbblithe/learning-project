package test005;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/14 20:31
 * Description:
 */


class User {

    //无参数构造方法
    public User(){
        System.out.println("User's Default Constructor Invoke!");
    }


    //有参数的构造方法
    public User(int i){
        System.out.println("带有int类型参数的构造器");
    }

    //有参数的构造方法
    public User(String name){
        System.out.println("带有String类型参数的构造器");
    }

    //有参数的构造方法
    public User(int i,String name){
        System.out.println("带有int，String类型的构造器");
    }

}
