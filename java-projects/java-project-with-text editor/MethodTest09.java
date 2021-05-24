/*
	深入return语句

		*带有return关键字的java语句只要执行，所在的方法执行结束。
		*在“同一个作用域”当中，returh语句下面不能编写任何代码，因为这些代码永远执行不到。所以编译错误
*/
public class MethodTest09{
	public static void main(String[] args){
		int retValue =m();
		System.out.println(retValue);
		//或者直接输出调用
		System.out.println(m());
	}
	//编译报错：缺少返回语句，以下程序编译器会认为
	//无法百分百保证“return 1;“会执行
	/*
	public static int m(){
		int a=10;
		if(a>3){
			return 1;
		}
		return 0;
	}
	*/

	public static int m(){
		return 1>3 ? 1 : 0;
	}

	/*
	public static int m(){
		int a =10;
		if(a>3){
			return 1;
		}
		eles{
			return 0;//下面不能够编写代码，就算编写了语法正确的语句，编译器仍然会报错。因为下面的语句无法运行
		}
	}
	*/
	//x下面的代码与上面一样可以编译通过。
	/*
	public static int m(){
		int a =10;
		if(a>3){
			return 1;
		}
		return 0;
	*/
}	