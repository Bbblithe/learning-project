package test016;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/17 18:59
 * Description:
 */


class MainTest {

    //public表示公开的，在任何位置都可以访问的
    //static表示静态的，使用"类名."的方式即可访问，不需要创建对象，就可以调用main方法
    //void表示main方法执行结束之后不返回任何值
    //main是main方法的方法名
    //(String[] arga)是main方法的形式参数列表
    public static void main(String[] args) {
        main(10);
        main("Hello World!");
    }

    public static void main(int i){
        System.out.println(i);
    }

    public static void main(String args){
        System.out.println(args);
    }
}
