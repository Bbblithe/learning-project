package test019;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/18 15:22
 * Description:
 * 关于java语言当中的多态语法机制：【只是多态基础语法，多态的作用在后续例子中讲解。】
 *      1、Animal、Cat、Bird三个类之间的关系
 *          Cat继承Animal
 *          Bird继承Animal
 *          Cat与Bird之间没有任何继承关系
 *
 *      2、面对对象三大特征：封装，继承，多态
 *
 *      3、关于多态中涉及到的几个概念
 *
 *          *向上转型(upcasting)
 *              子类型--->父类型
 *              又被称为：自动类型转换。
 *
 *          *向下转型(downcasting)
 *              父类型--->子类型
 *              又被称为：强制类型转换。【需要加强制类型转换符】
 *
 *          *需要记忆
 *              无论是向上转型还是向下转型，两种类型之间必须有继承关系。
 *              没有继承关系，编译无法通过。
 *
 *
 */

class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {

        //以前编写方法
        Animal a1=new Animal();
        a1.move();

        Cat c1=new Cat();
        c1.move();
        c1.catchMouse();

        Bird b1=new Bird();
        b1.move();

        //使用多态语法机制

        /**
         * 1、Animal和Cat之间存在继承关系，Animal是父类，Cat是子类
         *
         * 2、Cat is a Animal【合理的】
         *
         * 3、new Cat() 创建的对象的类型是Cat，a2这个引用的数据类型是Animal，可见他们进行了类型转换
         * 子类型转换成父类型，称为向上转型/upcasting，或者称为自动类型转换。
         *
         * 4、java中允许这种语法：父类型引用指向子类型对象。
         */
        Animal a2=new Cat();

        //Bird b2=new Cat(); 编译报错，因为两种类型之间不存在任何继承关系，无法向上或者向上进行转型

        /**
         * 1、java程序永远分为编译阶段和运行阶段。
         * 2、先分析编译阶段，再分析运行阶段，编译无法通过，根本无法运行的。
         * 3、编译阶段编译器检查a2这个引用的数据类型为Animal，由于在Animal.class
         * 的字节码文件中有move()方法，所以编译通过了。这个过程我们称为静态绑定，编译阶段绑定。
         * 只有静态绑定成功之后，才有后续的运行。
         *
         * 4、在程序运行阶段JVM堆内存当中真是创建的对象是Cat对象，那么以下程序在运行阶段
         * 一定会调用Cat对象的move()方法，此时发生了程序的动态绑定，运行阶段绑定。
         *
         * 5、无论是Cat类有无重写move()方法，运行阶段一定调用的是Cat对象的move方法，因为底层
         * 真实对象就是Cat对象。
         *
         * 6、父类型引用指向子类型对象这种机制导致程序存在编译阶段的绑定和运行阶段绑定两种不同的形态/状态，
         * 这种机制可以称为一种多态语法机制。
         */
        a2.move();//猫在走猫步！ 这里调用的是Cat中继承后重写的方法，就算没有重写，也会调用Cat中继承过来的方法
        /**
         * 分析以下程序为什么不能调用？
         *      因为编译阶段编译器检查到a2的类型是Animal类型，
         *      从Animal.class 字节码文件当中查找catchMouse()
         *      方法，最终没有找到该方法，导致静态绑定失败，没有绑定
         *      成功，也就是说编译失败了，别谈运行了。
         */
        //a2.catchMouse();

        /**
         * 需求：
         *  假设想让以上的对象catchMouse();方法，怎么办？
         *      a2是无法直接调用，以为a2的类型Animal，Animal中么有catchMouse()方法。
         *      我们可以将a2强制类型转换成Cat类型。
         *      a2的类型是Animal(父类)，转换成Cat类型(子类)，被称为向下转型/downcasting/强制类型转换。
         *
         *  注：向下类型也需要两种类型之间必须有继承关系，不然编译报错。强制类型转换需要强制类型转换符。
         *
         *  什么时候需要向下转型呢？
         *      访问的属性是子类型特有的，在父类型当中不存在，必须进行向下转型。
         *
         */
        Cat c2=(Cat) a2;
        c2.catchMouse();
        /*
        long x =100L;
        int i=(int)x;
         */

        //父类型引用指向子类型对象【多态】
        Animal a3=new Bird();
        /**
         *  1、以下程序编译是没有问题的，因为编译器检查到a3引用的数据类型是Animal
         *  Animal和Cat之间存在继承关系，并且Animal是父类型，Cat类型是子类型，
         *  父类型转换成子类型叫做向下转型，语法合格。
         *
         *  2、程序虽然编译通过了，但是程序在运行阶段会出现异常，因为JVM堆内存
         *  当中真实存在的对象是Bird类型，Bird对象无法转换成Cat对象，因为两种
         *  类型之间不存在任何继承关系，此时出现了著名的异常：
         *       java.lang.ClassCastException
         *       类型转换异常，这种异常总是在"向下转型"的时候会发生。
         */
        //Cat c3=(Cat)a3;//编译能够通过，是因为编译器将a3看作一个Animal关系，但是实际上a3的本质引用的是Bird 地址，由于Bird与Cat没有继承关系所以运行会报错

        /**
         * 1、以上异常只有在强制类型转换的时候才会发生，也就是说"向下转型"存在隐患（编译过了，但是运行错了！）
         * 2、向上转型只要编译通过，运行一定不会出问题，Animal a= new Cat()
         * 3、向下转型编译通过，运行可能错误：Animal a3=new Bird(); Cat c3=(Cat)a3;
         * 4、怎么避免向下转型出现的ClassCaseException呢？
         *      *使用instanceof运算符可以避免出现以上的异常。
         * 5、instanceof运算符怎么用？
         *      5.1、语法格式：
         *          (引用 instanceof(数据类型名)
         *
         *      5.2、以上运算符的执行结果类型是布尔类型，结果可能是true/false
         *
         *      5.3、t关于运算结果true/false：
         *          假设:(a instanceof Animal)
         *          true表示：
         *              a这个引用指向的对象是一个Animal类型。
         *          false表示：
         *              a这个引用指向的对象不是一个Animal类型。
         * 6、java规范中要求：在进行强制类型转换之前，建议采用instanceof运算符进行判断，避免ClassCastException异常的发生。这是一个编程的好习惯。
         */
        if(a3 instanceof Cat){  //a3是一个Cat类型的对象
            System.out.println("该引用指向类型是Cat类型");
            Cat c3 = (Cat)a3;
            //调用子类对象中特有的方法
            c3.catchMouse();
        }
        else if(a3 instanceof Bird){//a3是一个Bird类型的对象
            System.out.println("该引用的指向类型是Bird类型");
            Bird b2=(Bird)a3;
            //调用子类对象中特有的方法
            b2.fly();
        }

    }
}


/**
 *
 * class 人{
 *     public void 跑步{
 *         System.out.println("锻炼身体");
 *     }
 * }
 *
 * class 运动员 extends 人{
 *     public void 跑步{
 *          System.out.println("比赛呢！");
 *     }
 * }
 *
 * main{
 *     人 李四=new 人();    //不存在类型转换
 *     李四.跑步();
 *
 *     人 张三=new 运动员();
 *     张三.跑步();
 *
 *
 * }
 */