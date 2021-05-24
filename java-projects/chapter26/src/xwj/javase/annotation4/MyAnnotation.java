package xwj.javase.annotation4;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/16 14:48
 * Description:
 */


public @interface MyAnnotation {
    /*
    注解当中的属性的类型可以是哪一种类型？
        属性的类型可以是：
            byte short int long float double boolean char String Class 枚举类型
            以及以上每一种的数组形式
     */

    //Integer value();
    int value1();

    String value2();

    int[] value3();

    String[] value4();

    Season value5();

    Season[] value();

    Class parameterType();

    Class[] parameterTypes();
}
