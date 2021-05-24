package xwj.javase.annotation2;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/16 14:25
 * Description:
 */


public @interface MyAnnotation {
    /**
     * 我们通常在注解当中可以定义属性，以下这个是MyAnnotation的name属性。
     * 看着像一个方法，但实际上我们称之为属性name。
     * @return
     */
    String name();

    /*
    颜色属性
     */
    String color();

    /*
    年龄属性
     */
    int age() default 25; // 属性指定默认值
}
