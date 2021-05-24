/*
	1、super是一个关键字，全部小写。
	2、super和this对比学习：
		this：
			this能出现在实例方法和构造方法中。
			this的语法是：“this.“ 、”this()“
			this不能使用在静态方法中。
			this.大部分情况下是可以省略的。
			this.什么时候不能省略呢？ 在区分局部变量和实例变量的时候不能省略。
				public void setName(String name){
					this.name =name;
				}
				this()只能出现在构造方法第一行，通过当前的构造方法去调用”本类“中
				其他的构造方法，目的是：代码复用。

		super：
			super能出现在实例方法和构造方法中。
			super的语法是：“super.”和“super()“
			super不能使用在静态方法中。
			super.大部分情况下是可以省略的。
			super.什么时候不能省略呢？
			super()只能出现在构造方法第一行，通过当前的构造方法去调用“父类”中
			的构造方法，目的是：创建子类对象的时候，先初始化父类型特征。		

	3、super()
		表示通过子类的构造方法调用父类的构造方法。
		模拟现实世界中的这种场景：要想有儿子，得先有父亲。	

	4、重要的结论：
		当一个构造方法的第一行：
			既没有this()有没有super()的话，默认会有一个super()；
			表示通过当前子类的构造方法调用父类的无参数构造方法。
			所以必须保证父类的无参数构造方法是存在的。

	5、注意：
		this()和super() 不能共存，他们都是只能出现在构造方法的第一行。		

	6、无论是怎样折腾，父类的构造方法是一定会执行的。(百分百的)。	

*/
public class SuperTest01{
	public static void main(String[] args){
		//创建子类对象
		/*
			A类的无参数构造方法
			B类的无参数构造方法
		*/
		new B();
	}
}

class A{
	//建议手动的将一个无参数构造方法写出来。
	public A(){
		//super()； //这里会默认有这一行代码，因为其实 class A后面所写的就是extends Object
		System.out.println("A类的无参数构造方法");
	}

	//一个类如果手动提供任何构造方法，系统会默认提供一个无参数构造方法
	//一个类如果手动提供了一个构造方法，那么无参数构造系统将不再提供。
	public A(int i){
		System.out.println("A类的有参数构造方法(int)");
	}

}	
class B extends A{
	/*
	public B(){
		super();//这里默认会有一个super()；构造方法无论你写不写都有。
		System.out.println("B类的无参数构造方法");
	}
	*/
	public B(){
		//调用父类中有参数的构造方法
		//super(123);

		this("zhangsan");
		System.out.println("B类的无参数的构造方法");
	}
	public B(String name){
		System.out.println("B类的有参数构造方法(String)");
	}
}	