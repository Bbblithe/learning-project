/*
	1、举个例子：在恰当的时间使用：super(实际参数列表);

	2、注意：在构造方法执行过程中一连串调用了父类的构造方法，
	父类的构造方法又继续向下调用了他的父类的构造方法，但是实
	际上对象中只创建了一个。

	3、思考："super(实参)"到底是干啥的?
		super(实参)的作用是：初始化当前对象的父类型特征。
		并不是创建新对象，实际上对象只创建了一个。

	4、super关键字代表什么？
		super关键字代表的就是”当前对象“的那部分父类型特征。

		我继承了我父类型的一部分特征：
			例如：眼睛、皮肤等。
			super代表的就是”眼睛、皮肤等“。
			”眼睛、皮肤等“虽然是继承了父亲的，但这部分是在我身上的。
*/
//测试程序
public class SuperTest03{
	public static void main(String[] args){
		CreditAccount ca1=new CreditAccount();
		System.out.println(ca1.getActno()+","+ca1.getBalance()+","+ca1.getCredit());
		CreditAccount ca2=new CreditAccount("2015022136",460.09,0.999);
		System.out.println(ca2.getActno()+","+ca2.getBalance()+","+ca2.getCredit());
	}
}

//账户
class Account{	//父类
	//属性
	private String actno;
	private double balance;

	//构造方法
	public Account(){

	}

	public Account(String actno, double balance){
		this.actno=actno;
		this.balance=balance;
	}

	//setter and getter
	public void setActno(String actno){
		this.actno=actno;
	}
	public String getActno(){
		return actno;
	}

	public void setBalance(double balance){
		this.balance =balance;
	}
	public double getBalance(){
		return balance;
	}
}

//信用账户	
class CreditAccount extends Account{
	//属性:诚信值
	//子类特有的一个特征，父类没有。
	private double credit;

	//构造方法
	//分析以下程序是否存在编译错误？
	public CreditAccount(){

	}

	//提供有参数的构造方法
	public CreditAccount(String actno,double balance,double credit){
		//私有的属性，只能在本类中访问。
		/*
		this.actno=actno;//actno 在 Account 中是 private 访问控制
		this.balance=balance;//balance 在Account 中是private 访问控制
		*/

		//以上两行代码在恰当的位置，正好可以使用：super(actno,balance);
		//通过子类的构造方法调用父类的构造方法。
		super(actno,balance);
		this.credit=credit;
	}

	public void setCredit(double credit){
		this.credit=credit;
	}
	public double getCredit(){
		return credit;
	}
}