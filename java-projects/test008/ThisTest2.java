package test008;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 19:32
 * Description:
 */


class ThisTest2 {
    //实例变量
    String name;

    //实例方法
    public void doSome(){
        System.out.println("do some!");
    }

    //主方法是带有static
    public static void main(String[] args) {
        //这里没有this

        //编译错误
        /*System.out.println(name);
        doSome();

        System.out.println(this.name);
        this.dosome();

         */

        //通过
        ThisTest2 xixi=new ThisTest2();
        System.out.println(xixi.name);
        xixi.doSome();
    }
}
