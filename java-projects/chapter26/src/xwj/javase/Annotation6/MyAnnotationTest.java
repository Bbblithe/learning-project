package xwj.javase.Annotation6;

import java.lang.reflect.Method;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/16 16:01
 * Description:
 */


class MyAnnotationTest {

    @MyAnnotation(username = "admin",password = "123")
    public void doSome(){

    }

    public static void main(String[] args){
        // 获取MyAnnotationTest的doSome方法上面的注解信息
        Class c = MyAnnotationTest.class;
        try {
            Method m = c.getDeclaredMethod("doSome");
            // 判断该方法上是否存在这个注解
            if(m.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = (MyAnnotation) m.getAnnotation(MyAnnotation.class);
                System.out.println("账号：" + myAnnotation.password() + "，密码" + myAnnotation.password());
            }else{
                System.out.println("该方法并无注解");
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
