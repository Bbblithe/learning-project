package 接口在开发中的作用;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/2 22:20
 * Description:
 */


public class Test {
    public static void main(String[] args){

        //  创建厨师对象
        FoodMenu cooker1= new ChinaCooker1();

        //  创建顾客对象
        Customer customer=new Customer(cooker1);

        //  顾客点菜
        customer.order();

        //  创建西餐厨师对象
        FoodMenu cooker2=new AmericCooker();

        Customer customer1=new Customer(cooker2);

        customer1.order();
    }
}
