/*
	while循环句：

		1、while循环句的语法结构：

		 while(布尔表达式){
			循环体;
		 }
		2、while的执行原理

			先判断布尔表达的结果：
			*true
				—执行循环体
					*判断布尔表达式的结果
						*true
							-执行循环体
								判断布尔表达的结果
									*fales
									结束循环
*/
public class WhileTest01{
	public static void main(String[] args){

		/*
		while(true){
			System.out.println("死循环");
		}
		System.out.println("Hello World");编译器会发现该程序永远无法访问，所以无法执行会报错
		*/

		int i=10;
		int j=3;
		/*
		while(i>j){
			System.out.println("呵呵");
		}
		
		
		while(10>3){
			System.out.println("呵呵");
		}
		会报错，因为编译时就知道10>3
		但是i>j编译器不会去判断，可以运行
		*/
		System.out.println("Hello World");
	}
}									