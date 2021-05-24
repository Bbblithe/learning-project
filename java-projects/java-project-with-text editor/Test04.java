package xixi.haha.blithe;

/*
	inport语句用来完成倒入其他类，同一个包下的类不需要导入，
	不在同一个包下需要导入。

	import语法格式：
		import 类名;
		import 包名.*;

	import语句需要编写到package语句之下，class语句之上。	
*/

public class Test04{
	public static void main(String[] args){

		Test01 tt=new Test01();
		System.out.println(tt);

		Test01 ttt=new Test01();
		System.out.println(ttt);

		//以上程序可以，就是麻烦一点。
	}
}
class Test01{
	public static void main(String[] args){
		System.out.println("PackageTest's main method execute");
	}
}