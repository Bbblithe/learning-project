package xwj.javase.Annotation6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/16 15:59
 * Description:
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    /*
    username属性
     */
    String username();

    /*
    password属性
     */
    String password();
}
