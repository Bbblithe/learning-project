package test012;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/17 09:27
 * Description:
 * 什么时候程序在运行的时候出现空指针异常呢？
 *      空引用访问实例相关的数据，因为实例相关的数据就是对象相关的数据
 *      这些数据在访问的时候，就必须有对象的参与，当空引用的时候，对象不存在，
 *      访问这些实例数据一定会出现空指针异常。
 *
 * 实例相关的数据：
 *      实例变量【对象需要存在】
 *      实例方法【对象需要存在】
 */


class Test {
    public static void main(String[] args){
        Test.doSome();
        doSome();



        Test t=new Test();
        t.doSome();

        //引用是空
        t=null;

        //带有staitc的方法既可以采用类名的方式访问，也可以采用引用的方式访问
        //即使采用引用的方式去访问，实际上执行的时候和引用指向的对象无关。
        //在itellJ IDEA中，使用引用的方式带有static的方法，程序会出现黄色填充代表警告⚠️
        //所以带有static 的方法还是建议使用"类名."的方式去访问
        t.doSome();  //这里不会出现空指针异常
        //上面代码由于是静态变量的调用不会产生对象
        //所以会提示你：
        // Static member 'test011.Test.doSome()' accessed via instance reference
    }

    //带有staitc的方法需要使用"类名."方式进行访问
    public static void doSome(){
        System.out.println("do Some!");
    }

}
