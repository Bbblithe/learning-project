package test019;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/18 15:21
 * Description:
 */

//鸟儿类
class Bird extends Animal{
    //从父类中继承过来的方法
    public void move(){
        System.out.println("鸟儿在飞翔");
    }

    /**
     * 子类对象特有的行为/动作
     */
    public void fly(){
        System.out.println("Birds fly");
    }

}
