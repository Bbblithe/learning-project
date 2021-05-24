/**
 * Author:  blithe.xwj
 * Date:    2020/11/26 14:27
 * Description:
 */


public class OverrideTest07 {
    public static void main(String[] args){
        //一般重写的时候都是复制粘贴，不要动不要改。
    }
}

class Animal1{
    /*
    public double sum(int a,int b){
        return a+b;
    }

     */

    /*
    public long sum(int a,int b){
        return a+b;
    }

     */
}
class Cat1 extends Animal1{
    //重写
    //错误：'sum(int, int)' in 'Cat1' clashes with 'sum(int, int)' in 'Animal1'; attempting to use incompatible return type
    /*
    public int sum(int a,int b){
        return a+b;
    }

     */
    /*
    public double sum(int a,int b){
        return a+b;
    }

     */
}

//父类
class MyClass1{
    public Animal getAnimal(){
        return null;
    }
}

//子类
class MyClass2 extends MyClass1{
    //重写方法
    //重写的时候返回值类型由Animal变成了Cat，变小了。(编译通过，java允许)
    /*
    public Cat getAnimal(){
        return null;
    }

     */

    //重写的时候返回类型由Animal 变成了Object，变大了(编译失败，java中不允许)
    /*
    public Object getAnimal(){
        return null;
    }

     */

}