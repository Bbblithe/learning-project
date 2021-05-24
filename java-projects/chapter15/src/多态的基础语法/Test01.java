package 多态的基础语法;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/23 19:07
 * Description:
 *      多态的基础语法：
 *          1、学习多态语法之前，我们需要普及两个概念：
 *              第一个：向上转型
 *                  子---父（自动类型转换）upcasting
 *              第二个：向下转型
 *                  父---子（强制类型转换，需要加强制类型转换符）downcasting
 *
 *              注意：java中允许向上转型，也允许向下转型。
 *
 *                  *无论是向上转型，还是向下转型，两种类型之间必须有继承关系，没有继承关系编译器报错。
 *
 *                  以后在工作过程中，和别人聊天的时候，要专业一些，说
 *                  向上转型和向下转型，不要说自动类型转换，也不要说强制
 *                  类型转换，因为自动类型转换和强制类型转换是使用基本数
 *                  据类型方面的，在引用类型转换这里只有向上和向下转型。
 *         2、多态指的是：
 *              父类型引用指向子类型对象。
 *              包括编译阶段和运行阶段。
 *              编译阶段：绑定父类中的方法。
 *              运行阶段：动态绑定子类型对象的方法。
 *              多种形态。
 *
 *         3、java中只有"类名"或者"引用"才能加"." 这是java语法要求。
 *              万变不离其宗，只要你想"."，"."前面要么是个"类名"，要么是一个"引用"。
 *
 *         4、什么时候必须向下转型？
 *              不要随便做强制类型转换。
 *              当你需要访问的是子类对象中"特有"的方法。此时必须进行向下转型。
 *
 *         5、向上转型完全没有风险：
 *              子类特有的方法才需要向下转型。
 *              原因是因为向上转型时的子类能够继承父类的所有方法（除了构造方法：因为他没法继承。）
 */


public class Test01 {
    public static void main(String[] args){
        Animal a1=new Animal();
        a1.move();

        Cat c1=new Cat();
        c1.move();

        Bird b1=new Bird();
        b1.move();

        //代码可以在这样写吗？？
        /*
            1、Animal和Cat之间有继承关系吗？
            2、Animal是父类，Cat是子类。
            3、Cat is a Animal，这句话能不能说通？ 能
            4、经过测试得知java中支持这样的语法：
                父类型的引用允许指向子类型的对象。
                Animal a2=new Cat();
                a2就是父类型的引用。
                new Cat()是一个子类型的对象。
                允许a2这个父类型引用指向子类型的对象。
         */
        Animal a2=new Cat();
        Animal a3=new Bird();


        //没有继承关系的两个类型之间存在转型吗？
        //Incompatible types. Found: '多态的基础语法.Dog', required: '多态的基础语法.Animal'
        //Animal a4=new Dog();Dog跟Animal之间没有继承关系。

        //调用a2的move方法。
        /*
            什么是多态？
                多种形态，多种状态。
            分析：a2.move()
                java程序分为编译阶段和运行状态。
                先来分析编译阶段：
                    对于编译阶段来说，编译器只知道a2的类型是Animal
                    所以编译器在检查语法的时候，回去Animal.class
                    字节码文件中找move()方法，找到了，绑定上move()
                    方法，编译通过，静态绑定成功。（编译阶段属于静态绑定。）
                再来分析运行阶段：
                    运行阶段的时候，实际上在堆内存中创建的java对象是
                    Cat对象，所以move的时候，真正参与move的对象是一只猫，
                    所以运行阶段会执行动态绑定Cat对象的move()方法。这个过程
                    属于运行阶段绑定。（运行阶段绑定属于动态绑定。）

            多态表示多种形态：
                编译的时候一种形态。
                运行的时候另一种形态。
         */
        a2.move();
        a3.move();
        //========================================================================

        Animal a5=new Cat();
        //分析这个程序能否编译和运行呢？
        //分析程序一定要分析编译阶段的静态绑定和运行阶段的动态绑定。
        //只有编译通过的代码才能运行。没有编译，根本轮不到运行。
        //错误：找不到符号
        //因为编译器只知道a5的类型是Animal，去Animal.class 文件中找catchMouse()方法
        //结果没有找到，所以静态绑定失败，编译报错，无法运行。
        //a5.catchMouse();

        //假设代码写到了这里，我非要调用catchMouse()方法怎么办？
        //这个时候就必须使用"向下转型"了。（强制类型转换）
        //以下代码为什么没有报错
        //Cat和Animal存在继承关系。
        //因为a5类型是Animal类型，但是我们自己通过强制类型转换，将其转换成Cat类型
        //此时编译器发现x就是一个Cat类型，于是编译器就从Cat类中寻找catchMouse()的方法
        Cat x=(Cat)a5;
        x.catchMouse();

        //向下转型有风险吗？
        Animal a6=new Bird();   //表面上a6是个Animal，运行的时候实际上是一个鸟儿。
        /*
            分析以下程序编译报错还是运行报错？？
                编译器检测到a6这个引用是Animal类型，
                而Animal和Cat之间存在继承关系，所以可以向下转型。
                编译没问题。

                运行阶段，堆内存实际创建的对象是：Bird对象。
                就实际运行的过程中，拿着Bird对象转换成Cat对象
                就不行了。因为Bird和Cat之间没有继承关系。

            运行时出现异常，这个异常和空指针异常一样非常重要，也非常经典：
            java.lang.ClassCastException:类型转换异常。

            java.lang.NullPointerException:空指针异常。这个也非常重要。
         */

        //怎么避免ClassCastException异常的发生？？？
        /*
            新的内容，运算符：
                instanceof
            第一：instanceof可以在运行阶段动态判断引用指向的对象的类型。
            第二：instanceof的语法：
                (引用 instanceof 类型)
            第三：instanceof运算符的运行结只能是true/false
            第四：c是一个引用，c变量保存了内存地址指向了堆中的对象。
                假设(c instanceof Cat)为true表示：
                    c引用指向的堆内存中的java对象是一个Cat。
                稼穑(c instanceof Cat)为false表示：
                    c引用指向的堆内存中的java对象不是一个Cat。

            程序员要养成一个好习惯：
                任何时候，任何地点，对类型进行向下转型的时候，一定要使用
                instanceof 运算符进行判断。(java规范中要求的。)
                这样可以很好避免：ClassCastException
         */
        System.out.println(a6 instanceof Cat);  //false

        if(a6 instanceof Cat){
            Cat y=(Cat)a6;
            y.catchMouse();
        }
    }
}
