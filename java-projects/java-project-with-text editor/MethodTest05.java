
//方法调用的时候要求实参于形参要求个数对应相同。
//类型不同的时候要求能够进行相应的自动类型转换。例如 int自动转换成long类型
public class MethodTest05{
	public static void main(String[] args){

		//MethodTest05.sum(true,false);
		//会报错，因为跟给定的形参类型不同

		MethodTest05.sum(10,20);//可以编译成功，会自动转换数据类型
	}
	public static void sum(long a,long b){
		System.out.println(a+"+"+b+"="+(a+b));
	}
}