/*
	逻辑运算符：
		&	逻辑与	
		|	逻辑异 	(两边的算子只要有一个是true，结果就是true)
		!	逻辑非	（取反，！flase就是true，！true就是false，这是一个单目运算符）	
		^	逻辑异或	（两边的算子只要不一样，结果就是true）

		&&	短路与	当第一个表达式的结果为false，则整个逻辑判断输出为false，直接不进行第二个式子运算，可直接判断该逻辑输出为false
		｜｜	短路或 	当第一个表达式为true，则该输出一定为true，短路与直接不运算下一个就能判断该逻辑运算式的true
	*逻辑运算符必须要求两边都是布尔类型，并且逻辑运算符最终的运算结果也是以一个布尔类型。
	*短路与和逻辑与最终的运算结果是相同的，只不过短路与存在短路现象。
	*短路或和逻辑或最终的运算结果是相同的，只不过短路或存在短路现象。
	*什么情况下发生短路现象呢？
	*什么时候选择逻辑与运算符？什么时候选择逻辑或运算符？	
*/
public class OperatorTest03
{
	public static void main (String[] args)
	{
		//运算符优先级不确定加小括号
		System.out.println(5>3&5>2);
		System.out.println(5>3&5>6);
		System.out.println(5>3|5>6);

		System.out.println(true&true);
		System.out.println(true&false);
		System.out.println(false&true);
		System.out.println(false&false);

		System.out.println(true|false);
		System.out.println(false|false);

		System.out.println(!false);
		System.out.println(!true);

		System.out.println(true^false);//true
		System.out.println(true^true);//false
		System.out.println(false^false);//false

		//逻辑与和短路与
		int x =10;
		int y =8;
		System.out.println(x<y&&++x<y);	
		System.out.println(x);

		/*int x =10;
		int y =8;
		System.out.println(x<y&++x<y);	
		System.out.println(x);
		*/

		/*
			从某个角度看，短路与更智能。由于后面的表达式可能不止息，所以执行效率较高，这种方式在实际的开发中使用较多。短路与比逻辑与使用的多。短路与更常用。
			但是，在某些特殊的业务逻辑中，要求运算符两边的算子必须全部执行，此时必须使用逻辑与，不能使用短路与，使用短路与可能导致右边的表达着不执行。
		*/

		/*
			第一个算子表达式执行结果是真的时候，会发生短路或
			第一个式子表达式执行结果是假的时候，会发生短路与
		*/	
	}
}