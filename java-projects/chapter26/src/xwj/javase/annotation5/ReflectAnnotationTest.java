package xwj.javase.annotation5;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/16 15:46
 * Description:
 */


class ReflectAnnotationTest {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("xwj.javase.annotation5.MyAnnotationTest");
        // 判断类上面是否有@MyAnnotation
        //System.out.println(c.isAnnotationPresent(MyAnnotation.class));// true
        if(c.isAnnotationPresent(MyAnnotation.class)){
            // 获取该注解对象
            MyAnnotation myannotation = (MyAnnotation) c.getAnnotation(MyAnnotation.class);
            System.out.println("类上面的注解对象" + myannotation);
            // 获取注解对象的属性怎么办？和掉接口没区别。
            System.out.println(myannotation.name());

        }

        // 判断String类上面是否存在这个注解
        // 这里我采用的是String类型获取Class对象
        System.out.println(String.class.isAnnotationPresent(MyAnnotation.class));// false
    }
}
