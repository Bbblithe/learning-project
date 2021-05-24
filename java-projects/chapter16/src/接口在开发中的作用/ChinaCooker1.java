package 接口在开发中的作用;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/2 18:29
 * Description:
 *
 */

//中餐厨师
//实现菜单上的菜
//厨师是接口的实现者。
public class ChinaCooker1 implements FoodMenu{
    //西红柿炒鸡蛋
    public void shiZhiChaoJiDan(){
        System.out.println("中餐师傅做的西红柿炒鸡蛋！东北口味");
    }

    //鱼香肉丝
    public void yuXiangRouSi(){
        System.out.println("中餐师傅做的鱼香肉丝！东北口味");
    }
}
