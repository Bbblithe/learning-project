package com.bjpowernode.javase.chapter17;//这里也是第一行。
/**
 * Author:  blithe.xwj
 * Date:    2020/12/3 19:54
 * Description:
 *  关于java语言中的package和import机制
 *      1、为什么要使用package？
 *          package是java中包机制。包机制的作用是为了方便程序的管理。
 *          不同功能的类分别存放在不同的包下。（按照功能划分的，不同的
 *          软件包具有不同的功能。）
 *
 *     2、package怎么用？
 *       package是一个关键字，后面加包名。例如：
 *       package com。bjpowernode.javase.chapter17;
 *       注意：package语句只允许出现在java源代码的第一行。
 *
 *    3、包名有没有命名规范？有
 *      一般都采用公司域名倒序的方式（因为公司域名具有全球唯一性。）
 *      包名命名规范：
 *          公司域名倒序 + 项目名 + 模块名 + 功能名
 *
 *    4、对于带有package的包目录怎么编译？怎么运行？
 *
 *      采用之前的编译和运行不行了。
 *      类名不再是HelloWorld了。
 *      类名是：com.bipowernode.javase.chapter17.HelloWorld
 *
 *      编译:直接用编译工具完成我用IDEA管不了这么多。
 *
 *      运行：运行更是不用管。
 *
 *    5、关于import的使用。
 *
 *      import什么时候用？
 *          A类中使用B类。
 *          A和B类都在同一个包下。不需要使用import。
 *          A和B类不在同一个包下。需要使用import。
 *          java.lang.*;这个包下的类不需要import导入。
 *
 *      import怎么用？
 *          import语句只能出现在package语句之下，class声明语句之上。
 *          import语句还可以采用星号的方式。
 *
 */
//这里也是第一行。

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
