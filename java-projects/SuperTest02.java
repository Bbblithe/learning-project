/*
最后的输出结果：

A的无参数构造执行
B类的有参数构造执行(String)
C的有参数构造执行(String,int)
C的有参数构造执行(String)
C的无参数构造执行

在java语言中不管是new什么对象，最后老祖宗的Object类的无参数构造方法
一定会执行。（Object类的无参数构造方法是处于“栈顶部”）

栈顶的特点：
	最后强调，但是最先执行结束。
	后进先出原则。

大家要注意：
	以后写代码的时候，	一个类的无参数构造方法还是建议大家手动的写出来。
	如果无参数构造方法丢失的话，可能会影响到“子类对象的构建”。
*/

public class SuperTest02{
	public static void main(String[] args){
		new C();
	}
}

class A extends Object{	//这里其实在继承老祖宗Object，所以这了会有一个
	public A(){
		super();
		System.out.println("A的无参数构造执行");//1
	}
}

class B extends A{
	public B(){
		System.out.println("B的无参数构造执行");//2
	}
	public B(String name){
		System.out.println("B类的有参数构造执行(String)");//3
	}
}

class C extends B{
	public C(){	//这个是最先调用的，但是最后结束
		this("zhangsan");
		System.out.println("C的无参数构造执行");//4
	}

	public C(String name){
		this(name,20);
		System.out.println("C的有参数构造执行(String)");//5
	}

	public C(String name,int age){
		super(name);
		System.out.println("C的有参数构造执行(String,int)");//6
	}
}

