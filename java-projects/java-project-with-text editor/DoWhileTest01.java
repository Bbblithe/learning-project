/*
	do...while循环：
		1、do....while的语法结构：

		do{
			循环体;
		}while(布尔表达式);

		2、do....while循环的执行原理
		3、do....while循环的执行次数：
			do..while循环的循环代码片段执行次数时：1-N次【至少时1次】
		4、使用do....while循环的注意事项：
			do...while循环语句最终只有一个"分号"别丢了。

*/
public class DoWhileTest01{
	public static void main(String[] args){
		int i =10;
		do{
			System.out.println(i);
		}while(i>100);
		System.out.println("_______________________________________________");
		while(i>100){
			System.out.println("i--->"+i);
		}
	}
}			