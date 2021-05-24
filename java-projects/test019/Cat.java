package test019;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/18 15:18
 * Description:
 */


public class Cat extends Animal{
    //重写从父类中继承过来的方法
    public void move(){
        System.out.println("猫在走猫步");
    }

    //不是从父类中继承过来的
    //这个方法是子类对象特有的行为【不是说所有的动物都能抓老鼠】
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}
