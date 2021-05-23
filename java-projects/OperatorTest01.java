/*
	关于java编程中运算符之：算术运算符
		+	求和
		—	相减
		*	乘积
		/	商
		%	求余数【取模】
		++	自加1
		--	自减1
	注意：一个表达式当中有多个运算符，运算符有优先级，不确定的加小括号，优先级得到提升。
	没有必要去专门记忆运算符的优先级。


*/
public class OperatorTest01
{
	public static void main(String[] args)
	{
		int i =10;
		int j =3;
		System.out.println(i+j);//13
		System.out.println(i-j);//7
		System.out.println(i*j);//30
		System.out.println(i/j);//3
		System.out.println(i%j);//1

		//关于++预算符【自加1】
		int k = 10;
		//++运算符可以出现在变量后面【单目运算符】
		k ++;

		System.out.println(k);
		int y =10;
		//++预算符可以出现在变量前面【单目预算符】
		++y;
		System.out.println(y);//11

		//总结：++运算符可以出现在变量前，也可以出现在变量后，无论是变量前还是变量后
		//只要++运算结束，该变量中的值一定会自加1

		//++出现在变量后
		int a = 100;
		int b = a++;
		System.out.println(a);//a =101
		System.out.println(b);//a++先做赋值运算，在进行自己变量的加1运算，所以b=100

		//++出现在变量之前
		//规则：先进行自加1运算，然后再进行赋值操作。
		int m = 20;
		int n = ++m;
		System.out.println(m);
		System.out.println(n);

		int xx = 500;
		System.out.println(xx);//(这个xx)，能带进println中是sSUN公司已经在jre做好的代码直接调用

		int s = 100;
		System.out.println(++s);
		System.out.println(s);
	}
}