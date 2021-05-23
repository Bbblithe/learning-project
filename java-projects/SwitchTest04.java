/*
	实现计算器当中的
		+
		—
		*
		%

	实现思路：
		*选择所有数据从键盘输入
		*使用switch语句进行判断
		*需要从控制台输入三次：
			#第一个数字
			#运算符
			#第二个数字

	最终在控制台上是这样的一个场景：
	欢迎使用简单计算器系统：
	请输入第一个数字：10
	请输入运算符：+、-、*、%
	请输入第二个数字：20
	运算结果：10 + 20 = 30		
*/
public class SwitchTest04{
	public static void main(String[] args){

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("欢迎使用简单计算器系统");
		System.out.print("请输入第一个数字：");
		int num1 = s.nextInt();
		System.out.print("请输入运算符：");
		String operator = s.next();
		System.out.print("请输入第二个数字");
		int num2 = s.nextInt();

		switch(operator){
			case "+" :
				System.out.println((num1 + "+" + num2 + "=") + (num1+num2));
				break;
			case "-" :
				System.out.println((num1 + "-" + num2 + "=") + (num1-num2));
				break;
			case "*" :
				System.out.println((num1 + "*" + num2 + "=") + (num1*num2));
				break;
			case "%" :
				System.out.println((num1 + "%" + num2 + "=") + (num1%num2));	
				break;
			default :
				System.out.println("不好意思你的运算符有问题，计算机无法判断，请麻烦你再次输入合法运算符");				
		}
	}
}