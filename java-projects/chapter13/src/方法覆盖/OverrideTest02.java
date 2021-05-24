package 方法覆盖;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/23 07:33
 * Description:
 *
 * 继承有什么用？基本作用：代码复用  重要作用：方法覆盖和多态机制
 *
 *
 *  什么时候我们会考虑使用"方法覆盖呢"
 *      子类继承父类之后，当继承过来的方法无法满足当前子类的业务需求时，
 *      子类有这个权利对这个方法进行重写编写，有必要进行"方法覆盖"。
 *
 *  方法覆盖又叫做：方法重写，英语单词叫做：Override、Overwrite，都可以。
 *  比较常见的：方法覆盖、方法重写、overload
 *
 *  重要结论：
 *      当子类对父类继承过来的方法进行"方法覆盖"之后，
 *      子类对象调用该方法的时候，一定执行覆盖之后的方法。
 *
 *
 *  回顾一下方法重载！！！
 *      什么时候考虑使用方法重载overload？
 *          当在一个类当中，如果功能相似的话，建议将名字定义一样，这样
 *          代码美观，并且编程方便。
 *
 *      什么条件满足之后能够构成方法重载overload？
 *          条件一：在同一个类当中
 *          条件二：方法名相同
 *          条件三：参数列表不同（个数、顺序、类型）
 *
 *  当我们代码怎么编写的时候，在代码级别上构成了方法覆盖呢？
 *      条件一：两个类必须要有继承关系。
 *      条件二：重写之后的方法和之前的方法具有：
 *              相同的返回值类型、
 *              相同的方法名、
 *              相同的形式参数列表、
 *      条件三：访问权限不能更低，可以更高。（这个先记住。）
 *      条件四：重写之后的方法不能比之前的方法抛出更多的异常，可以更少。（先记住）
 *
 *  这里还有几个注意事项：（这几个注意事项，当学习了多态语法之后自然就明白了！）
 *      注意1：方法覆盖知识针对于方法，和属性无关。
 *      注意2：私有方法无法覆盖。
 *      注意3：构造方法不能被继承，所以构造方法也不能被覆盖。
 *      注意4：方法覆盖只是针对"实例方法"，"静态方法覆盖"没有意义
 *
 */


public class OverrideTest02 {
    public static void main(String[] args) {
        Bird1 b=new Bird1();
        b.move();

        Cat1 c=new Cat1();
        c.move();

        Animal1 a=new Animal1();
        a.move();
    }
}

class Animal1{
    public void move(){
        System.out.println("动物在移动！");
    }
    public void sing(int i){
        System.out.println("方法覆盖.Animal sing....");

    }
}

class Bird1 extends Animal1{
    // 对move方法进行方法覆盖，方法重写，override
    // 最好将父类中的方法原封不动的赋值过来。（不建议手动编写）
    // 方法覆盖，就是将继承过来的那个方法给覆盖掉了。继承过来的方法没了。

    public void move(){
        System.out.println("鸟儿在飞翔！");
    }

    //'move()' in '方法覆盖.Bird1' clashes with 'move()' in '方法覆盖.Animal1'; attempting to assign weaker access privileges ('protected'); was 'public'
    /*
        peotected表示受保护的，没有public开放。
        所以会报错，说你在往更低的权限重写
    protected void move(){
        System.out.println("鸟儿在飞翔！");
    }

     */

    //分析这个sing()和Animal中的sing(int i)有方法覆盖吗？
    //没有，原因是，这两个方法根本就是两个不同的方法。
    //可以说这两个方法构成了方法重载吗？ 可以。
    public void sing(){
        System.out.println("方法覆盖.Bird sing...");
    }
}

class Cat1 extends Animal1{

    //方法重写
    public void move(){
        System.out.println("猫在走猫步!");
    }
}
