/**
 * Author:  blithe.xwj
 * Date:    2020/11/26 07:59
 * Description:
 */
//经过测试，你记住就行。
//私有方法不能覆盖。
class OverrideTest06 {
    //私有方法      写在OverrideTest06之中是因为这个私有方法只能在本类中才可能调用。
    private void doSome(){
        System.out.println("OverrideTest06's private method doSome execute!");
    }

    //入口
    public static void main(String[] args) {
        //多态
        OverrideTest06 ot=new T();
        ot.doSome(); //OverrideTest06's private method doSome execute!
    }
}
/*
//在外部类中无法访问私有的。
class Mymain{
    public static void main(String[] args){
        OverrideTest06 ot=new T();
        ot.doSome();//该方法调用会报错，由于私有仅能在本类中访问，所有报错。
    }
}

 */

class T extends OverrideTest06{
    //尝试重写父类中的doSome()方法
    //访问权限不能更低，只能更高。
    public void doSome(){
        System.out.println("T's public soSome method execute!");
    }
}