package test017;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/17 20:17
 * Description:
 */


class ExtendsTest02 {
    public static void main(String[] args) {
        C c=new C();
        c.doSome(); //这里调用的doSOme方法是从B类中继承过来的doSome方法
        B b=new B();
        b.doSome();
    }
}
class A{
    public void doSome(){
        System.out.println("do Some!");
    }
}
class B extends A{
    /*public void doSome() {
        System.out.println("~~~~~~do some~~~~");
    }

     */
}
class C extends B{

}
