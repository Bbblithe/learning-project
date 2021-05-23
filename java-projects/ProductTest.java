
/*
	每一个类中都可以编写主方法，但是一般情况下，
	系统只有一个一个入口，所以主方法一般写一个。
*/
public class ProductTest{ //商品测试类

	//程序入孔
	public static void main(String[] args){

		//创建对象，商品对象
		//iphone11局部变量
		//iphone11引用
		//iphone11变量中保存内存地址指向堆内存当中的商品对象
		Product iphone11=new Product();

		//访问实例变量的语法：引用.变量名
		//读取：引用.变量名
		System.out.println("商品的编号："+iphone11.productNo);
		System.out.println("商品的单价："+iphone11.price);

		//修改：引用.变量名=值;
		iphone11.productNo=111;
		iphone11.price=4440;
		System.out.println("商品的编号："+iphone11.productNo);
		System.out.println("商品的单价："+iphone11.price);

		//编译报错：实例对象必须先创建对象，通过引用.的方式访问，不能直接使用类名.方式访问
		/*
		System.out.println(Product.productNo);
		System.out.println(Product.price);
		*/

	}
}
class Product{
	//实例变量
	int productNo;
	double price;
}