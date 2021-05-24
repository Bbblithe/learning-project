package xwj.javase.annotation3;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/16 14:37
 * Description:
 * 如果一个注解的属性的名字是value，并且只有一个属性的话，在使用的时候，该属性名字可以省略。
 */


class MyAnnotationTest {

    // 报错原因：没有指定属性的值。
    /*@MyAnnotation
    public void doSome(){

    }*/

    @MyAnnotation(value = "hehe")
    public void doSome(){

    }

    @MyAnnotation("haha")
    public void doOther(){

    }
}
