/**
 * Author:  blithe.xwj
 * Date:    2020/11/27 10:41
 * Description:
 *
 *  final修饰的实例变量？
 *      《重点：万变不离其宗》：final修饰的变量只能赋值一次。(这句话到哪里都好使。)
 *
 *  你是否还记得：实例变量如果没有手动赋值的话，系统化会默认赋值。
 *
 *  java程序设计：不背锅！ 甩锅甩的很好！！！
 *
 *  实例变量在什么时候赋值（初始化）?
 *      构造方法执行的过程中赋值。(new 的时候赋值)
 *
 *  结论：
 *      final修饰的实例变量，系统不负责赋默认值，要求程序员必须手动赋值。
 *      这个手动赋值，在变量后面赋值就可以，在构造方法中赋值也可以。
 */


public class FinalTest03 {
    public static void main(String[] args){
        //创建对象必须调用无参数构造方法？
        //不一定。
        User u=new User(111.23);
    }
}

class User{
    //实例变量
    //以下程序的报错：Variable 'age1' might not have been initialized 变量未初始化
    //final int age1;//实例变量只能赋值一次 如果并没有自己赋值，那么java会自动赋值，那么这个变量就永远都是0，也就不存在意义。
    final int age=10;//这样的赋值才合法。系统才能默认允许。

    //实例变量
    final double height=1.79;//这样的赋值也合法。

    //以下这一堆代码全部联合起来，weight变量也就是赋上了一次值
    //实例变量
    final double weight;
    //无参构造
    /*

    public User(){
        this.weight=80;//只要我赶在系统赋默认值之前就行。
        //this.weight=81;//Variable 'weight' might already have been assigned to
    }

     */
    public User(double weight){
        //这也是赋值了，没有采用系统默认赋值
        this.weight=weight;
    }
}