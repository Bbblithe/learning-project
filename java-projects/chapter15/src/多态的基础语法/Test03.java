package 多态的基础语法;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/23 20:33
 * Description:
 */


class  Test03 {
    public static void main(String[] args) {
        //main方法是程序员A负责编写。
    }
}

class AnimalTest{
    //test方法是程序员B负责编写。
    //这个test()方法的参数是一个Animal
    public void test(Animal a){
        //你写的这个方法别人会去调用。
        //别人调用的时候可能给你test()方法传过来一个Bird
        //当然也可能传过来一个Cat
        //对于我来说，我不知道你调用的时候你给我传过来个啥。
    }
}
