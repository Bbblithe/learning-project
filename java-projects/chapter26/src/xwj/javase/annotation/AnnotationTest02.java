package xwj.javase.annotation;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/15 21:25
 * Description:
 * 关于JDK lang包下的Override注解
 * 源代码：
 * public @interface Override{
 *
 * }
 *
 * 标识性注解，给编译器做参考的。
 * 编译器看到方法上有这个注解的时候，编译器会自动检查该方法是否重写了父类的方法。
 * 如果没有重写，报错。
 *
 * 这个注解只是在编译阶段起作用，和运行阶段无关。
 */

//@Override这个注解只能注解方法
//@Override这个注解是给编译器参考的，和运行阶段没有关系。
// 凡是java中的方法带有这个注解的，编译器都会进行编译检查，如果这个方法不是重写父类的方法，编译器报错。

//@Override
class AnnotationTest02 {

    //@Override
    private int no;

    @Override
    public String toString() {
        return "toString";
    }

}
