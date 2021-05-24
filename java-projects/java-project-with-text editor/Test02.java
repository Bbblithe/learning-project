package xixi.haha.blithe;

public class Test02{
	public static void main(String[] args){

		//完整类名是：
		Test01 t= new Test01();
		System.out.println(t); //xixi.haha.blithe.Test01@704921a5

		//可以省略包名，以为Test01和Test02在同一个软件包当中
		Test01 tt=new Test01();
		System.out.println(tt);//xixi.haha.blithe.Test01@7a36aefa
	}
}
class Test01{
	public static void main(String[] args){
		System.out.println("PackageTest's main method execute");
	}
}		
