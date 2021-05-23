/*
	关于java中的赋值类运算符：
		赋值类运算符包括两种：

			*基本的赋值运算符
				=
			*扩展的赋值运算符
				+=
				—=
				*=
				/=
				%=
	*赋值类的运算符优先级，先执行等号右边的表达式，将执行结果赋值给左边的变量。
	*注意以下代码：
		byte i =10;
		i+= 5;等同于i =（byte）(i+5)	;
		int k =10;
		K+=5;等同于：k=(int)(k+5);

		long x = 10L;
		int y =20;
		y+=x;	等同于：y=(int)(y+x);

	3、重要结论：
		拓展类的赋值运算符不改变运算结果的类型，假设最初这个变量的类型是byte类型，无论怎么进行追加追加或追减，最终该变量的数据类型还是byte类型。	
*/
public class OperatorTest04
{
	public static void main (String[] args)
	{
		//基本的赋值运算符
		int i = 10;
		System.out.println(i);
		//拓展的赋值运算符【+= 运算符可以翻译为“追加/累加”】
		i+=5;//等同于：i = i + 5;
		System.out.println(i);//15
		i-=5;//等同于: i = i -5;
		System.out.println(i);
		i*=2;
		System.out.println(i);
		i/=4;
		System.out.println(i);
		i&=2;// i= i%2;
		System.out.println(i);

		byte b = 10;//10 没有超出byte取值范围，可以直接赋值
		//b = b+5;// 因为这里的5为int 类型 但是int类型在编译阶段会报错，编译只会检查语法错误，不会运行程序，编译器发现b+5类型是int 类型
		//b变量的数据类型是byte
		//大容量向小容量转换需要加强制转换类型转换符，所以该程序编译报错。

		b = (byte)(b +5);
		System.out.println(b);

		byte x = 10;
		x+=5;//等于x = x +5;最后的运算结果，等同于x =（byte)(x+5).
		System.out.println(x);

		byte z = 0;
		z+=128;// 等同于z=(byte)(z+128);
		System.out.println(z);//-128[损失精度]

		z+= 10000;//等同于z=(byte)(z+10000);
		System.out.println(z);//-112
	}
}