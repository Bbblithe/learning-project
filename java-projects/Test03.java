package xixi.haha.blithe;

public class Test03{
	public static void main(String[] args){
		//创建Test01对象
		//以下代码编译错误，当省略包名之后，会在当前包下找Test01
		//由于老师的Windows的系统原因自己查看视频即可
		//java动力节点基础入门班158集 -33:05 处
		Test01 tt=new Test01();
		System.out.println(tt);

		Test01 ttt=new Test01();
		System.out.println(ttt);
	}
}
class Test01{
	public static void main(String[] args){
		System.out.println("PackageTest's main method execute");
	}
}