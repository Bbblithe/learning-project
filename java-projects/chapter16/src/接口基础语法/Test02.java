package 接口基础语法;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/29 15:29
 * Description:
 *    接口的基础语法：
 *       1、类和类之间叫做继承，类和接口之间叫做实现。
 *       别多想：你仍然可以将"实现"看作"继承"。
 *       继承使用extends关键字完成。
 *       实现使用implements关键字完成。
 *
 *       2、五颗星（*****）：当一个非抽象的类实现接口的话，必须将接口中所有的
 *       抽象方法全部实现（覆盖、重写）。
 */
public class Test02{
   public static void main(String[] args){
      //能使用多态吗？可以。
      //Animal a=new Cat();

      //父类型的引用指向子类型的对象
      MyMath1 mm=new MyMathImpl();
      //调用接口里面的方法（面向接口编程。）
      int result1 = mm.sum(10,12);
      System.out.println(result1);

      int result2 = mm.sub(20,10);
      System.out.println(result2);
   }
}


//特殊的抽象类，完全抽象的，叫做接口。
interface MyMath1{
   double PI=3.14159265354;
   int sum(int a,int b);//
   int sub(int a,int b);
}

//编写一个类（这个类是一个非抽象的类）
//这个类的名字是随意的。
/*
abstract class MyMathImpl implements MyMath{
}

 */
class MyMathImpl implements MyMath1{
   //编译报错：'sum(int, int)' attempting to assign weaker access privileges ('package-private'); was 'public'
   /*
   int sum(int a,int b){
      return a+b;
   }

    */
   //重写/覆盖/实现 接口中的方法（通常叫做实现。）
   public int sum(int a,int b){
      return a+b;
   }
   public int sub(int a,int b){
      return a-b;
   }
}