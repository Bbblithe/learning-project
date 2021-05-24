package 多态的基础语法;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/23 20:24
 * Description:
 *      这个代码的疑问？
 *          肉眼可以观察到底层到底是new Bird()还是new Cat()！！！
 *          我们为什么还要进行instanceof的判断呢？？
 *
 *          原因是你以后可能看不到！
 */

public class Test02 {
    public static void main(String[] args){
        Animal x=new Bird();
        Animal y=new Cat();

        //多了这两个判断，就能够更加安全。
        if(x instanceof Bird){
            Bird b=(Bird)x;
            b.sing();
        }
        else if(x instanceof Cat){
            Cat c=(Cat)x;
            c.catchMouse();
        }
        if(y instanceof Bird){
            Bird b=(Bird)y;
            b.sing();
        }
        else if(y instanceof Cat){
            Cat c=(Cat)y;
            c.catchMouse();
        }
    }
}
