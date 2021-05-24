/*
	方法的返回值不是void的时候。
		1、一定要returm 值; 且返回值等于实际值

		2、一个方法有返回值的时候，当我们调用这个方法，方法返回了一个值，
		对于调用者来说，这个返回值可选择接受，也可以选择不接受。
		但是大部分情况下我们都是选择接受的

*/
public class MethodTest0{
	public static void main(String[] atgs){
		divide(10,3);//调用方法

		//接受方法执行结束之后的返回值
		//采用变量接受
		//变量的数据类型需要和返回值的数据类型相同，或者可以自动类型转换。
		int i=divide(10,3);
		System.out.println(i);
		long x=divide(10,3);
		System.out.println(divide(10,3));
	}

	/*
		需求：请定义并实现一个方法，该方法可以计算两个int数据类型的方法，
		需求将最终的计算结果返回给调用者
	*/

	public static int divide(int a,int b){
		return a/b;
	}
}