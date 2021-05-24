package javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/15 09:50
 * Description:
 * 反射Student类当中所有的Field（了解一下）
 */


class ReflectTest05 {
    public static void main(String[] args) throws Exception{
        // 获取整个类
        Class studentClass = Class.forName("javase.bean.Student");

        //javase.bean.Student
        String studentClassName = studentClass.getName();
        System.out.println("完整类名：" + studentClassName);

        String classSimpleName = studentClass.getSimpleName();
        System.out.println("简类名：" + classSimpleName);

        // 获取类中所有的public修饰的Field
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);// 测试数组中只有一个元素
        // 取出这个Field
        Field f = fields[0];
        // 取出这个field的名字
        System.out.println(f.getName());

        // 获取所有的Field
        Field[] fs = studentClass.getDeclaredFields();
        System.out.println(fs.length);//4

        System.out.println("+======================");
        //遍历
        for(Field field : fs){
            // 属性的修饰符列表
            int i = field.getModifiers();// 翻译的修饰符是一个数字，每个数字是修饰符的代号！！！
            System.out.println(i);
            // 可以将这个代号数字转换成字符串吗？
            String modifierString = Modifier.toString(i);
            System.out.println(modifierString);
            // 获取属性的类型
            Class fieldType = field.getType();
            //String fName = fieldType.getName();
            String fName = fieldType.getSimpleName();
            System.out.println(fName);

            // 获取属性的名字
            System.out.println(field.getName());
        }
    }
}
