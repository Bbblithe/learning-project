/*	
	别墅类：
		*面积
		*主人
*/
public class BieShu{
	public static void main(String[] args){
		//面积
		double mianJi;

		//主人【人类】
		//变量/引用
		//变量怎么声明：数据类型 变量名;
		Ren zhuRen=new Ren();
		zhuRen.id ="1523523";
		zhuRen.sex=false;
		zhuRen.name="张三";
		zhuRen.age=17;
		System.out.println("主人的姓名"+zhuRen.name);
	}	


}
class Ren{
	//身份证号
	String id;

	//名字
	String name;

	//性别
	boolean sex;

	//年龄
	int age;

	Wife wife;

}