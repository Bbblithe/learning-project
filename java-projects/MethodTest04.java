/*
	方法的调用不一定在main方法当中，可以在其他方法当中。
	只要是程序可以执行到的位置，都可以调用其他方法
*/
public class MethodTest04{
	public static void sum(int a,int b){
		System.out.println(a+"+"+b+"="+(a+b));

		//调用doSome方法
		MethodTest04.doSome();
	}

	public static void main(String[] args){
		//调用sum方法
		MethodTest04.sum(1,2);

		System.out.println("Hello World!");
	}
	public static void doSome(){
		System.out.println("do some!");
	}

}