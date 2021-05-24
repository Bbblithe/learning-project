package test020;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/19 07:09
 * Description:
 * 多态在实际开发中的作用，以下以主人喂养宠物为例说明多态的作用：
 *  1、分析：主人喂养宠物这个场景要实现需要进行类型的抽象：
 *      -主人【类】
 *      -主人可以喂养宠物，主人有喂养的这个动作
 *      -宠物【类】
 *      -宠物可以吃东西，宠物有吃东西的这个动作
 *
 *  2、面向对象编程的核心：定义好类，然后将类实例化为对象，给个环境驱使一下，让各个对象之间协作起来形成一个系统。
 *
 *  3、多态的作用是什么？
 *      降低程序的耦合度，提高程序的扩展力。
 *      能使用多态尽量使用多态。
 *      父类型引用指向子类型对象。
 *
 *  核心：面向抽象编程，尽量不要面向具体编程。
 *
 */


class Test {
    public static void main(String[] args) {
        //创建主人对象
        Master zhangsan=new Master();

        //创建猫对象
        //Cat tom=new Cat();

        //创建小狗对象
        Dog erha=new Dog();

        //主人喂养猫
        zhangsan.feed(new Cat()); //这里的tom就当作一个i，将一个变量传入了feed方法中进行加工。最后feed会返回这个参数引用.eat的结果
        //等同于先new对象再将引用放入方法中
        //看下面

        //主人喂养小狗
        zhangsan.feed(erha);

        //创建蛇对象
        Snake mangShe=new Snake();
        //主任喂蛇
        zhangsan.feed(mangShe);

    }
}
