package xwj.javase.annotation5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/16 15:29
 * Description:
 */

// 只允许该注解可以标注类、方法
@Target({ElementType.TYPE,ElementType.METHOD})
// 希望这个注解可以被反射
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String name() default "成都金牛区";
}
