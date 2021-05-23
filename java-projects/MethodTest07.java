/*
	对于当前的程序的输出结果
		*main方法最先调用，main方法也是最后一个结束。
		*左后调用的m3方法，该方法最先结束。

	main方法结束之后，整个程序结束了【这句话只适合于当前所讲的内容】
	
	不用刻意去记忆：
	只要记住方法中是自上而下的顺序依次执行即可。
	当前行的程序在没有结束的时候，下一行代码是无法执行的	
*/
public class MethodTest07{
	public static void main(String[] args){
		System.out.println("main begin");
		m1();
		System.out.println("main over");
	}

	public static void m1(){
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 over");
	}

	public static void m2(){
		System.out.println("m2 begin");
		m3();
		System.out.println("m2 over");
	}

	public static void m3(){
		System.out.println("m3 begin");
		System.out.println("m3 over");
	}
}