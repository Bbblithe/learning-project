package test016;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/17 19:06
 * Description:
 * 方法什么时候定义为静态方法？
 *      方法描述的是动作，当所有的对象执行这个动作的时候，最终产生的影响是一样的，那么这个
 *      动作已经不再属于某一个对象动作了，可以将这个动作提升为类级别的动作，模版级别的动作。
 *
 * 静态方法中无法访问实例变量和实例方法。
 *
 * 大多是方法都定义为实例方法，一般一个行为或者一个行为动作在发生的时候，都需要对象的参与。
 * 但是也有例外，例如：大多"数工具类"中的方法都是静态方法，因为工具类就是方便编程，为了
 * 方便方法的调用，自然不需要new对象是最好的。
 */


public class StaticTest {

    //实例变量
    int i=100;

    //实例方法
    public void doSome(){
    }

    //静态方法【静态上下文】
    public static void main(String[] args) {

        //System.out.println(i);
        //doSome();

        StaticTest st=new StaticTest();
        System.out.println(st.i);
        st.doSome();

        //使用数学工具类
        System.out.println(MathUtil.sumInt(303,2020));
        System.out.println(MathUtil.divide(49,7));
    }
}
/*
 总结：
    class类{
        静态代码块;
        实例代码块;

        静态变量
        实例变量

        构造方法

        静态方法
        实例方法
    }
 */

