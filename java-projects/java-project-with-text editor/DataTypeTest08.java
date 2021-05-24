/*
  	关于基本数据类型之间的互相转换：	转换规则	
  		*八种基本数据类型当中除布尔类型之外剩下的七种类型之间都可以互相转换
  		*小容量向大容量转换，称为自动类型转换，容量由小到大排序：
  		 	byte<short<int<long<float<double<char
  		 	注：
  		 		任何浮点类型不管占用多少个字节，都比整形容量大。	
  		 		char和short可表示的种类数量相同，但是char可以取更大的整数
  		*大容量转换成小容量叫做强制类型转换，需要加强制类型转换符程序才能编译通过，但是在运行阶段可能会损失精度，所有谨慎使用。
  		*当整数字面值没有超出byte,short,char的取值范围，可直接赋值给byte,char,short类型的变量
  		*byte,short,char混合运算的时候，各自先转换成int类型在做运算。
  		*多种数据类型混合运算，先转换成容量最大的那种类型再做运算。	

  		注意
  			*byte b =3 ;可以编译通过，3没有超过byte类型取值范围

  			int i =10；
  				byte b =i /3;		编译错误，编译器只检查语法，不会"运算"i/3 	
*/
public class DatatypeTest08
{
	public static void main (String[] args)
	{
		byte a =20;
		short b=1000;
		int c=1000;
		long d=c;
	}
}