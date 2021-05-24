package javase.reflect;

import java.util.ResourceBundle;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/14 20:51
 * Description:
 * java.util包下提供了一个资源绑定器，便于获取属性配置文件中的内容。
 * 使用以下这种方式的时候，属性配置文件xxx.properties必须放到类路径下。
 */


class ResourceBundleTest {
    public static void main(String[] args) {

        // 资源绑定器，只能绑定xxx.properties文件。并且这个文件必须在类路径下。文件扩展名也必须是properties
        // 并且在写路径的时候，路径后面的扩展名不能写。
        //ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");

        ResourceBundle bundle = ResourceBundle.getBundle("javase/bean/db");

        String className = bundle.getString("className");
        System.out.println(className);

    }
}
