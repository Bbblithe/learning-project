package xwj.javase.annotation;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/15 21:00
 * Description:
 * 1、注解，或者叫做注释，英文单词是：Annotation
 * 2、注解Annotation是一种引用数据类型。编译之后也是生成xxx.class文件。
 * 3、怎么自定义注解呢？语法格式？
 *      [修饰符列表] @interface 注解类型名{
 *
 *      }
 */

// 默认情况下，注解可以出现在任意位置

@MyAnnotation
class AnnotationTest01 {

    @MyAnnotation
    private int no;

    @MyAnnotation
    public AnnotationTest01(){

    }

    @MyAnnotation
    public static void m1(){
        @MyAnnotation
        int i = 100;
    }

    @MyAnnotation
    public void m2(@MyAnnotation
                   String name,
                   @MyAnnotation
                   int k){

    }
}

@MyAnnotation
interface myInterface{

}

enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}