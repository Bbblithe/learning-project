/*
猜数字游戏
一个类A有一个实例变量v，从键盘接受一个正整数作为实例变量v 的初始值。
另外再定义一个类B，对A类的实例变量v进行猜测。
如果大了就提示大了
小了就提示小了
等于则提示成功
*/

class A{
	private int v;

	public void setV(int v){
		this.v=v;
	}

	public int getV(){
		return v;
	}

	public A(){

	}

	public A(int v){
		this.v=v;
	}

}