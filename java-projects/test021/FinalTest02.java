package test021;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/19 18:21
 * Description:
 */


class FinalTest02 {

    //成员变量之实例变量
    //实例变量有默认值+final 修饰的变量一旦赋值无法再次赋值。
    //综合考虑java语言最终规定实例变量使用final修饰之后，必须手动赋值，不能采用系统默认值。
    //final int age;

    //第一种解决方案：
    final int age=10;

    //第二种解决方案：
    final int num;
    public FinalTest02(){
        this.num =100;
    }

    //以上的两种解决方案其实就是一种，都是在构造方法中给实例变量赋值。


    public static void main(String[]args){
        final int a;
        a=100;
        //不可二次赋值
        //a=200;
    }
}
