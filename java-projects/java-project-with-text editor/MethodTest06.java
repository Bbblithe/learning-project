/*
	方法调用“
		1、方法的修饰符列表当中有statci关键字，完整的调用方法是：类名.方法名（实参列表）;
		2、但是，有的时候“类名.“可以省略，什么情况可以省略呢？
			m1(){
				m2();
			}
			m1方法和m2方法在同一个类体当中的时候，“类名.” 可以省略不写
		3、建议在一个java源文件当中只定义一个calss，比较清晰。这里只是为了讲课才写了两个calss类	
*/
public class MethodTest06{
	public static void main(String[] args){

		//调用方法
		MethodTest06.m();

		//对于方法的修饰符列表当中有static关键字的：“类名”可以省略不写吗
		m();
		// 调用A 类的doOther方法
		// 调用其他类的方法必须加类名.，不然无法调用
		// 类名. 省略后默认从当前类中找"doOther"方法，在当前类中该方法中不存在则报错
		A.doOther();
	}
	public static void m(){
		System.out.println("m method execute!");
		m2();//	省略了前面的类名，因为都在类名MethodTest06中

		//不想调用当前MethodTest06类名中的类名
		A.m2();
	}
	public static void m2(){
		System.out.println("m2 execute");
	}
}
class A{
	public static void doOther(){
		System.out.println("A's doOther method invoke!");
	}
	public static void m2(){
		System.out.println("A's method execute");
	}
}

