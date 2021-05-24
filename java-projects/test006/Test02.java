package test006;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 12:02
 * Description:
 *
 *      最终结论：
 *          方法调用的时候，涉及到参数传递的问题，传递的时候，java只遵循
 *          一种语法机制，将变量中保存的"值"传递过去，只不过有的时候这个值
 *          是一个字面值，有的时候这个值是另一个java对象的内存地址0x12345
 *
 */


class Test02 {
    public static void main(String[] args) {
        User u=new User(20);

        //User u= 0x1234;
        //传递u给add方法的时候，实际上传递的是u变量中保存的值，只不过这个值是一个java对象的内存地址。
        add(u); //等同于 add(0x1234);
        System.out.println("main---->"+u.age);
    }
    public static void add(User xixi){
        xixi.age++;
        System.out.println("add---->"+xixi.age);
    }
}
class User{
    //实例变量
    int age;

    //构造方法
    public User(int i){
        age =i;
    }
}