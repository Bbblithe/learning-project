package javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/15 10:31
 * Description:
 * 通过反射机制，反编译一个类的属性Field（了解一下）
 */


class ReflectTest06 {
    public static void main(String[] args) throws Exception{

        // 创建这个是为了拼接字符串
        StringBuilder s = new StringBuilder();

        Class studentClass = Class.forName("javase.bean.Student");

        s.append(Modifier.toString(studentClass.getModifiers()) + " class "+ studentClass.getSimpleName() +" {");

        Field[] fields = studentClass.getDeclaredFields();

        for(Field field : fields){
            s.append("\n");
            s.append("\t");
            if(field.getModifiers() != 0) {
                s.append(Modifier.toString(field.getModifiers()) + " ");
            }
            s.append(field.getType().getSimpleName());
            s.append(" ");
            s.append(field.getName());
            s.append(";");
        }

        s.append("\n}");
        System.out.println(s);
    }
}
