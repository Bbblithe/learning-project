/*
	1、“this.“ 和”super.“大部分情况下都是可以省略的。
	2、this.什么时候不能省略？
		public void setName(String name){
			this.name=name;
		}
	3、super.什么时候不能省略？
		父中有，子中又有，如果想在子中访问父的	
*/
public class SuperTest05{
	public static void main(String[] args){
		Vip v=new Vip("blithe");
		v.shopping();
		v.doSome();
	}
}

class Customer{
	String name;

	public Customer(){

	}

	public Customer(String name){
		this.name=name;
	}

	public void doSome(){
		System.out.println(this.name+"do some!");
		System.out.println(name+"do some!");
		//错误：找不到符号
		//System.out.println(super.name+"do some");
	}
}

class Vip extends Customer{

	//假设子类也有一个同名属性
	//java中允许在子类中出现和父类一样的同名变量/同名属性。
	String name;//实例变量

	public Vip(){

	}

	public Vip(String name){
		super(name);
		//this.name =null;
	}
	public void shopping(){
		/*
			java是怎么来区分子类和父类的同名属性的？
				this.name:当前对象的name 属性
				super.name:当前对象的父类型特征中的name属性
		*/
		System.out.println(this.name+"正在购物！");
		System.out.println(super.name+"正在购物！");
		System.out.println(name+"正在购物");
	}
}