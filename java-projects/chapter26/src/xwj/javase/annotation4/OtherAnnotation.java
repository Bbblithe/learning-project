package xwj.javase.annotation4;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/16 14:56
 * Description:
 */


public @interface OtherAnnotation {
    /*
    年龄属性
     */
    int age();

    /*
    邮箱地址属性，支持多个
     */
    String[] email();

    /**
     * 季节数组，Season是枚举类型
     * @return
     */
    Season[] seasonArray();
}
