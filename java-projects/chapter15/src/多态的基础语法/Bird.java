package 多态的基础语法;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/23 19:05
 * Description:
 */

//鸟儿类，子类
public class Bird extends Animal{
    //重写父类的move() 方法
    public void move(){
        System.out.println("Bird在飞翔！");
    }

    public void sing(){
        System.out.println("鸟儿在歌唱！");
    }
}
