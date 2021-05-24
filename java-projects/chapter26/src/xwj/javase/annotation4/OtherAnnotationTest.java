package xwj.javase.annotation4;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/16 14:57
 * Description:
 */

class OtherAnnotationTest {

    // 数组是大括号
    @OtherAnnotation(age = 17,email = {"zhangsan@123.com","zhangsan@sohu.com","2697891297@qq.com"},seasonArray = Season.SPRING)
    public void doSome(){

    }

    // 如果数组中只有一个元素：大括号可以省略。
    @OtherAnnotation(age = 17,email = "2697891297@qq.com",seasonArray = {Season.SPRING,Season.AUTUMN})
    public void doOther(){

    }
}
