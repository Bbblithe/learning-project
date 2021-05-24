package xwj.javase.Annotation7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/16 16:20
 * Description:
 */

// 表示这个注解只能出现在类上面
@Target(ElementType.TYPE)
// 该注解可以被反射机制读取到
@Retention(RetentionPolicy.RUNTIME)
@interface Id {
}

// 这个注解@Id用来标注类，被标注的类中必须有一个int类型的id属性，没有就报异常
