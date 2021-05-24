package test019;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/18 21:55
 * Description:
 */


class Test2 {
    public static void main(String[] args) {
        //父类型引用指向子类型对象
        //向上转型
        Animal a1=new Cat();
        Animal a2=new Bird();

        //向下转型【只有当访问此类对象特有的方法】
        if(a1 instanceof Cat) {
            Cat c1 = (Cat) a1;
            c1.catchMouse();
        }
        else if(a1 instanceof Bird){
            Bird c1=(Bird) a1;
            c1.fly();
        }
        if(a2 instanceof Cat){
            Cat c2=(Cat) a2;
            c2.catchMouse();
        }
        else if(a2 instanceof Bird){
            Bird c2=(Bird) a2;
            c2.fly();
        }


    }
}
