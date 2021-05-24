/*
	通过这个测试得出的结论：
		super 不是引用。super也不保存内存地址，super也不指向任何对象。
		super 只是代表当前对象内部的那一块父类型的特征。
*/

public class SuperTest06{
	//实例方法
	public void doSome(){
		System.out.println(this);
		//SuperTest06@67b467e9
		//输出“引用”的时候，会自动调用引用的toString() 方法。
		//System.out.println(this.toString());

		//编译报错，需要'.'
		//System.out.println(super);
	}

	//this和super不能使用在static静态方法中
	public static void doOther(){
		//System.out.println(this); //无法从静态上下文中引用非静态 变量 this
		//System.out.pritnln(super.xxx);//无法从静态上下文中引用非静态 变量 super
	}

	//静态方法，主方法
	public static void main(String[] args){
		SuperTest06 st=new SuperTest06();
		st.doSome();

		//main方法是静态的
		//编译报错，this和super只能用在实例方法中
		/*
		System.out.println(this);
		System.out.println(super.xxx);
		*/
	}
}