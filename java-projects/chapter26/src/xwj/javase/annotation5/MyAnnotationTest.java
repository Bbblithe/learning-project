package xwj.javase.annotation5;


/**
 * Author:  blithe.xwj
 * Date:    2021/1/16 15:34
 * Description:
 */

@MyAnnotation(name = "成都新都区")
class MyAnnotationTest {
    //@MyAnnotation
    int i;

    //@MyAnnotation
    public MyAnnotationTest(){

    }

    @MyAnnotation
    public void doSome(){

        //@MyAnnotation
        int i;
    }
}
