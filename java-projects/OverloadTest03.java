/*
	方法重载：

		1、方法重载又被称为：overload
		2、什么时候考虑使用方法重载？
			*功能相似的时候，尽可能让方法相同
			【但是：功能不同/不想似得时候，尽可能让方法名不同。】

		3、什么条件满足之后构成了方法重载？
			*在同一个类当中
			*方法名相同
			*参数列表不同：
				-数量不同
				-顺序不同
				-类型不同

		4、方法重载和什么有关系，和什么没有关系？
			*方法重载和方法名+参数列表有关系
			*方法重载和返回值类型无关 //你可
			*方法重载和修饰符列表无关
*/
public class OverloadTest03{
	public static void main(String[] args){
		m1();
		m1(10);

		m2(1,2.0);
		m2(2.0,1);

		m3(10);
		m3(3.0);

		/*	
		m4(2,1);
		m4(1,2);
		*/

	}
	//以下两个方法构成重载
	public static void m1(){}
	public static void m1(int a){}

	//以下两个方法构成重载
	public static void m2(int a,double b){} /////看这里----返回值类型不影响
	public static int m2(double a,int b){
		return 1;
	}

	//以下两个方法构成重载
	public static void m3(int x){}
	public static void m3(double x){}

	//编译错误：以下不是方法重载，是发生了重复。
	/*
	public static void m4(int a,int b){}
	public static void m4(int b,int a){}
	*/

	/*
	public static void x(){

	}
	public static int x(){
		return 1;
	}
	*/

	/*
	void y(){}
	public static void y(){}
	*/
}		