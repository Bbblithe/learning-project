/*
    关于java中的变量：
       变量的作用域
       *作用域描述的就是变量的有效范围，在什么范围之内可以被访问，只要出了这个范围该变量就无法访问了。
       *出了大括号就不认识了
*/
public class VarTest03
{

	static int k = 90;
	public static void main(String[] args)
	{
        int i =100;
        System.out.println(i);
	}
	public static void doSome()
	{
	   System.out.println(k);
	}
}