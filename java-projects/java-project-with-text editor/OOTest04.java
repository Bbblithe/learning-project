public class OOTest04{
	public static void main(String[] args){
		//创建一个丈夫对象
		Husband huangXiaoMing =new Husband();
		huangXiaoMing.name ="黄晓明";
		
		//创建一个妻子对象
		Wife baby=new Wife();
		baby.name ="angelbaby";

		//结婚【能通过丈夫找到妻子，通过妻子也可以找到丈夫】
		huangXiaoMing.w=baby;
		baby.h=huangXiaoMing;

		//得到以上“黄晓明”的妻子的名称
		System.out.println(huangXiaoMing.name+"的妻子名字叫做"+huangXiaoMing.w.name);
	}
}
//这是一个丈夫类
class Husband{
	//姓名
	String name;

	//丈夫对象当中含有妻子引用
	Wife w;
}
//妻子类
class Wife{
	//姓名
	String name;

	//妻子对象当中含有丈夫引用
	Husband h;
}