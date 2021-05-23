public class SuperTest04{
	public static void main(String[] args){
		Vip v=new Vip("blithe");
		v.shopping();
	}
}

class Customer{
	String name;

	public Customer(){

	}

	public Customer(String name){
		this.name=name;
	}
}

class Vip extends Customer{
	public Vip(){

	}

	public Vip(String name){
		super(name);
	}
	//super和this 都不能出现在静态方法中。
	public void shopping(){
		//this表示当前对象。
		System.out.println(this.name+"正在购物！");
		//super表示的是当前对象的父类型特征。（super是this指向的对象中的一块空间。）
		System.out.println(super.name+"正在购物！");
		System.out.println(name+"正在购物");
	}
}