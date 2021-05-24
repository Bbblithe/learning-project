/*
	关于java中的"+"运算符：
		# +运算符在java语言当中有两个作用:
			*加法运算，求和
			*字符串的连接运算
		# 当"+"运算符两边的数据都是数字的话，一定是进行加法运算。
		# 当	"+"运算符两边的数据有一个数据是字符串，一定会进行字符串连接运算
		并且连接运算的结果还是一个字符串的类型

			数字+数字————>数字【求和】
			数字+"字符串"————>"字符串"【字符串连接】
		#在一个表达式当中可以出现多个"+"号,在没有添加小括号的前提之下，遵循自左向右的顺序依次运算	
*/
public class OperatorTest05
{
	public static void main(String[]args)
	{
		int a = 10;
		int b = 20;
		//要求在控制台上输出 "10 +20 = 30"
		System.out.println(10+20+"30");//这里的第一个"+"是求和，第二个"+"字符串连接计算

		System.out.println(10+(20+"30"));//这里的两个"+"都是字符连接的作用（有括号先运行括号里的内容）
		System.out.println("10+20="+(a+b));
		System.out.println("a + 20="+(a+b));//输出结果是"a+20=30"
		System.out.println(a+"+20="+(a+b));//输出结果是10 + 20 =30
		System.out.println(a+ "+b="+(a+b));//输出结果是10 + b = 30
		System.out.println(a+"+"+b+"="+(a+b));//这个程序做到了动态变化输出"a+b=(a+b)"

		//引用类型String
		//String是SUN在javaSE当中提供的字符串类型
		//String.calss字节码文件
		//int i = 10 ;
		//int是基本数据类型，i是变量名称，"10"是int类型的字面值

		//String s = "abc";
		//String是引用数据类型，s是变量名称，"abc"是String类型的字面值

		//定义了一个String类型的变量，起名username，赋值"zhangsan"
		String username = "zhangsan";
		System.out.println("登陆成功，欢迎"+username+"回来");
		//String ss = 10;//会编译错误，类型不兼容。

	}
}		