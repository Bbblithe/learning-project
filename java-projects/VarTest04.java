/*
   关于变量的分类：
      根据变量声明的位置来分类：
         *局部变量
          -在方法体当中声明的变量叫做局部变量
         *成员变量
          —在方法体外【类体之内】声明的变量叫做成员变量
   在不同的作用域中，变量名是可以相同的。
   在同一个作用域当中，变量名是不能重名的。       

*/
public class VarTest04
{
	//第一层大括号的里面就叫类体
	//类体中不能直接编写java语句【除非声明变量】
	int k = 200;//成员变量
	public static void main(String[] args)
	{
		//i 变量就是局部变量
		int i = 10;
		System.out.println(i);//java 遵循“就近原则”
	}
	int i = 100;// 这个i就是成员变量

	public static void doSome()
	{
        int i = 90;
 	}
}