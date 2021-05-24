package xwj.javase.annotation;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/16 13:44
 * Description:
 */


// 表示这个类已过时。
@Deprecated
public class AnnotationTest03 {

    @Deprecated
    private static String s;

    @Deprecated
    public static void main(String[] args) {
        AnnotationTest03 t = new AnnotationTest03();
    }

    @Deprecated
    public void doSome(){
        System.out.println("do something!");
    }

    // Deprecated这个注解标注的元素已过时。
    // 这个注解主要是向其他程序员传达一个信息，告知已过时，有更好的解决方案存在。
    @Deprecated
    public static void doOther(){
        System.out.println("do Other!");
    }
}

class T{
    public static void main(String[] args) {
        AnnotationTest03 t = new AnnotationTest03();
        t.doSome();
        AnnotationTest03.doOther();

        try {
            Class c = Class.forName("java.util.Date");
            Object obj = c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}