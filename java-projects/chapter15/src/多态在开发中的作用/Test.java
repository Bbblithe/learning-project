package 多态在开发中的作用;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/25 07:36
 * Description:
 * 测试多态在开发中的应用
 */


public class Test {
    public static void main(String[] args){
        //创建主人对象
        Master zhangsan =new Master();
        //创建宠物对象
        Dog zangAo=new Dog();
        //主人喂养
        zhangsan.feed(zangAo);
        //创建宠物对象
        Cat xiaoHua=new Cat();
        //主人喂养
        zhangsan.feed(xiaoHua);

        //创建宠物对象
        YingWu guoMengXing=new YingWu();
        //主人喂养
        zhangsan.feed(guoMengXing);
        guoMengXing.eat();
    }
}
