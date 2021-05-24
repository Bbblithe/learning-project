/*

*/
public class ForTest02{
	public static void main(String[] args){

		for(int i = 1; i<10;i ++){
			System.out.println("i--->"+i);
		}
			
		//以下的for循环当中的"i"变量的作用域湿仅限于当前for循环内部使用
		for(int i = 1; i<=10;i ++){
			System.out.println("i--->"+i);	
		}

		//这个是main方法作用域的"i"变量
		int i = 0;
		for(;i<10;i++){
			System.out.println("i=->"+i);
		}
		System.out.println("i=" + i);//i = 10因为前面的for循环中的i 完成最后一步i++ 时， i = 10 判断 i = 10 不满足判断条件退出循环也就导致i最后的值时10
		//这里可以访问main方法作用域当中的i变量

		int j;
		for(j = 1; j < 10; j++){
			System.out.println("j----->=" + j);
		}
		System.out.println("j=" + j);
	}
}