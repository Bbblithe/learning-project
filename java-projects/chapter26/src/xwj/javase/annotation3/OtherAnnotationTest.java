package xwj.javase.annotation3;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/16 14:41
 * Description:
 */
// 报错了，因为属性名是name，不能省略。
//@OtherAnnotation("test")
class OtherAnnotationTest {

    @OtherAnnotation(name = "test")
    public void doSome(){

    }
}
