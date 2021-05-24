package test002;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/14 12:43
 * Description:
 */


class Test {
    public static void main(String[] args) {
        //创建一个丈夫对象
        Husband xiaoMing = new Husband();
        xiaoMing.name="小明";
        //创建一个妻子对象
        Wife xiaoGang = new Wife();
        xiaoGang.name="小刚";
        //结婚
        xiaoMing.wife = xiaoGang;
        xiaoGang.husband = xiaoMing;

        System.out.println(xiaoMing.wife.name);
        System.out.println(xiaoGang.husband.name);
    }
}
