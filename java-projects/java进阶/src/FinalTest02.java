/**
 * Author:  blithe.xwj
 * Date:    2020/11/26 18:15
 * Description:
 *  final修饰的变量，如果这个变量是一个"引用"会怎么样？？
 *      final修饰的变量只能赋一次值。(万变不离其宗)
 *      "引用"是不是一个变量呢？------是
 *
 *      final修饰的引用：
 *          该引用只能指向一个对象，并且他只能永远指向该对象，无法再指向其他对象。
 *          并且在该方法执行过程中，该引用指向对象之后，该对象不会被垃圾回收器回收。
 *          直到当前方法结束，才会释放空间。
 *
 *          虽然final的引用指向对象A后，不能再重新指向对象B。
 *          但是对象A中的数据可以被修改。(里面的数据跟内存地址并没有直接关系。)
 *
 */


public class FinalTest02 {
    public static void main(String[] args){
        Person P1=new Person(20);
        System.out.println(P1.age);

        //_____________________________________________________________
        //代码不管怎么变化，p也是一个变量。（只不过这里它有一个特殊的名字：引用）
        final Person p=new Person(30);
        p.age=40;
        System.out.println(p.age);
        //引用指向的对象不能变，但是其中的数据可以改变。//例如这里的引用中的age变量，内部数据是可以被修改的。
        //其中的对象只是
        //p=new Person(30);     //Cannot assign a value to final variable 'p'

        int i;//这是局部变量，并没有初始值
    }
}

class Person{
    int age;

    public Person(){

    }

    public Person(int age){
        this.age=age;
    }
}
