/*
	java语言是面向对象
	要想创建对象必须先定义类

	定义类的语法：
		[修饰符列表] class 类名{
			属性;
			方法;
		}

	属性通常采用变量来表示，既然是变量那么变量肯定有数据类型。【数据类型包括：基本数据类型+引用数据类型】
	属性对应的是状态信息

	观察现实世界当中的超市中的商品，发现这所有的商品都有一些共同的特征，
	例如，每一个商品都有编号，每一个商品都有单价，所以定义以下的类，来
	代表所有的商品。

*/
public class Product{
	//编号【通常是一个数字，而且该数字通常是整数类型】
	//productNo是基本数据类型
	int productNo;

	//单价【通常是一个数字，但是数字可能带有小数，所以采用浮点型数据double表示】
	//price是基本数据类型
	double price;

	//
}