package test020;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/19 07:15
 * Description:
 * 主人类
 */

//这种方式没有使用java语言当中的多态机制，存在的缺点：Master的扩展力很差，因为只要加一个新的宠物，Master类就需要添加新的方式。
/*
class Master {
    //喂养宠物
    public void feed(Cat c){    //把这里的Cat c当作int i;一样的类型。这里的c是引用 然后Cat是一个类型
        c.eat();
    }
}

 */
//Master和Cat、Dog这两个类型的关联度很强，耦合度很高，扩展力差


//降低程序的耦合度【解耦合】，提高程序的扩展力【软件开发的一个很重要的目标】
class Master {
    //喂养宠物

    //Master主人类面向的是一个抽象的Pet，不再面向具体的宠物
    //提倡：现象抽象编程，不要再面向具体编程。
    //面向抽象编程的好处是，耦合度低，扩展力强。
    public void feed(Pets pet){ //Pets pet是一个父类型的引用
        pet.eat();
    }
}
