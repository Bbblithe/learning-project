/*
	以下代码不使用“方法重载机制“，不使用overload，分析程序的缺点？

		1、sumint，sumdouble，sumlong方法虽然功能不同，但是功能相似的。都是求和。
		在以下程序当中功能相似的方法，分别起了三个不同的名字。但是这对于程序员来说，调用
		方法的时候不方便，程序员需要记忆更多的方法，才能完成调用。【不方便】
		2、代码不美观。

	有没有这样的一种机制：
		功能虽然不同，但是“功能相似”的时候，有没有这样一种机制，可以让程序员使用
		这些方法的时候就像在使用同一个方法一样，这样程序员以后编写代码比较方便，
		也不需要记忆更多的方法名。代码也会很美观。

		有这种机制：方法重载机制/Overload	
*/
public class MethodTest13{
	public static void main(String[] args){
		int result1=sumInt(1,2);
		System.out.println(result1);
		double result2=sumDouble(1.0,2.0);
		System.out.println(result2);
		long result3=sumLong(1L,2L);
		System.out.println(result3);
	}
	//定义一个方法，可以计算两个int计算类型的和
	public static int sumInt(int a,int b){
		return a+b;
	}
	//定义一个方法，可以计算两个double计算类型的和
	public static double sumDouble(double a,double b){
		return a+b;
	}
	//定义一个方法，可以计算两个long计算类型的和
	public static long sumLong(long a,long b){
		return a+b;
	}
	//最终希望达到的效果是：程序员在使用上面的三个相似的方法的时候，就像在用一个一个方法一样。
	//Java支持支持这种机制【有些语言不支持，例如以后要学习的：javascript】
}	