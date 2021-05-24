package 访问控制权限;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/4 21:41
 * Description:
 */


public class User {
    //给一些属性

    //私有的
    private int id;

    //受保护的
    protected int age;

    //公开的
    public int weight;

    //默认的
    String name;

    //方法
    public void m1(){

    }
    private void m2(){

    }
    protected void m3(){

    }
    void m4(){

    }

    //静态方法也可以。
    //下面省略搬运
}

//编译报错：Modifier 'private' not allowed here
/*
private class MyClass1{

}

 */

//编译报错：Modifier 'protected' not allowed here
/*
protected class MyClass1{

}

 */
