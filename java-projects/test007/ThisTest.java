package test007;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 18:52
 * Description:
 */


class ThisTest {
    //这里的i是实例变量（需要"引用."方式访问）
    int num=10;

    //带有static的方法
    //JVM负责调用main方法，JVM是怎么调用的？
    //ThisTest.main(String[])
    public static void main(String[] args) {

        //整个执行过程中没有this对象

        //以下代码什么意思？
        //访问"当前对象"的num属性
        //System.out.println(num);//编译错误

        //想访问num怎么办？
        ThisTest xixi=new ThisTest();
        System.out.println(xixi.num);
    }
}
