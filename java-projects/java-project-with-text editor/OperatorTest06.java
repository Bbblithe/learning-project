/*
	三元运算符/三目运算符/条件预算符
		*语法规则：
			布尔表达式 ？ 表达式1： 表达式2
		*三元运算符的执行原理
			当布尔表达式的结果是真true的时候，就选择表达式1作为整个表达式执行结果，假如为假false，就选择表达式2作为整个表达式执行结果。	
*/
public class OperatorTest06
{
	public static void main (String[] args)
	{
		//布尔类型的变量
		boolean sex =false;

		//下列代码报错
		//右边这个式子只是一个可以输出false true 的语句//sex ? '男' :'女';//因为他不是一个完整的java 语句
		char c = sex ? '男':'女';
		System.out.println(c);

		sex = true;
		c= sex ? '男':'女';
		System.out.println(c);

		// char c1 =sex ? "男": '女';//语法错误，编译报错，结果可能是String，也可能是char，但是前边不能用char来接受数据。
		//类型不兼容
		System.out.println(10);
		System.out.println("10");
		System.out.println('1');//上面三个式子是想说明这个打印式子可以打印任何类型的

		//可以编译成功
		System.out.println(sex ? '男':"女");

		String s = sex ?"男":"女";
		System.out.println(s);
	}
}