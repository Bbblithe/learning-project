package 接口在开发中的作用;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/2 18:30
 * Description:
 */

//西餐厨师
//实现菜单上的菜
//厨师是接口的实现者。
public class AmericCooker implements FoodMenu{
    //西红柿炒鸡蛋
    public void shiZhiChaoJiDan(){
        System.out.println("西餐师傅做的西红柿炒鸡蛋！");
    }

    //鱼香肉丝
    public void yuXiangRouSi(){
        System.out.println("西餐师傅做的鱼香肉丝！");
    }
}
