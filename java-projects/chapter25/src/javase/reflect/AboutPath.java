package javase.reflect;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/14 09:51
 * Description:
 * 研究一下文件路径的问题。
 * 怎么获取一个文件的绝对路径。以下讲解的方式是通用的。但前提是：文件需要在类路径下。才能用这种方式
 */


class AboutPath {
    public static void main(String[] args) throws Exception{
        // 这种方式的路径缺点是：移植性差，在IDEA中默认的当前路径是project的根。
        // 这个代码假设离开了IDEA，换到了其他位置，可能当前路径就不是project的根了，这时这个路径就无效了。
        //FileReader reader = new FileReader("chapter25/classinfo.properties");

        // 接下来说一种比较通用的一种路径。即使代码换位置了，这样编写仍然是通用的。
        // 注意：使用以下通用方式的前提是：你这个文件必须在类路径下。
        // 什么是类路径下？凡是在src下的都是类路径下。【记住它】
        // src是类的根路径
        /*
        解释：
            Thread.currentThread()当前线程对象
            getContextClassLoader()是线程对象的方法，可以获取到当前线程类加载器对象。
            getResource()【获取资源】这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源。
         */
        String path1 = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();// 这种方式获取文件绝对路径是通用的

        // 采用以上的代码可以拿到一个文件的绝对路径。
        // /Users/xuwenjie/IdeaProjects/javase/out/production/chapter25/classinfo2.properties
        System.out.println(path1);

        // 获取db.properties文件的绝对路径（从类的根路径下作为起点开始）
        String path2 = Thread.currentThread().getContextClassLoader()
                .getResource("javase/bean/db.properties").getPath();
        System.out.println(path2);

    }
}
