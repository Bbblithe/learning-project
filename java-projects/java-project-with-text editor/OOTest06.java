/*
	需求：
		定义一个计算机类【电脑/笔记本】，计算机类有哪些属性：
			*品牌
			*型号
			*颜色

		定义一个学生类，学生类有哪些属性：
			*学号
			*姓名
			*学生有一台笔记本电脑
		请编写程序来表示以上的类，然后分别将类创建位对象，
		对象数量不限，然后让其中的一个学生去使用其中的一台笔记本电脑。

		然后编译并运行，并且将整个执行的过程采用图形的方法描述出来。

	所有的代码全部写到当前的java源文件里		

*/
//测试类
public class OOTest06{
	public static void main(String[] args){
		//创建学生对象
		Student stu=new Student();

		//不采用系统默认值
		//手动赋值
		stu.name ="徐文杰";
		stu.id =2015022136;
		stu.macBook=new Computer();

		System.out.println(stu.name);
		stu.macBook.pingPai ="apple";
		stu.macBook.xingHao ="MacBook pro";
		stu.macBook.yanSe="深空灰";
		//让这个学生和笔记本对象产生关系【通过学生可以找到他的笔记本】
		System.out.println(stu.name+"的电脑品牌是"+stu.macBook.pingPai);
		System.out.println(stu.name+"的电脑型号是"+stu.macBook.xingHao);
		System.out.println(stu.name+"的电脑品牌是"+stu.macBook.yanSe);

		Computer noteBook =new Computer();
		System.out.println(stu.name+"的电脑品牌是"+noteBook.pingPai);
		System.out.println(stu.name+"的电脑型号是"+noteBook.xingHao);
		System.out.println(stu.name+"的电脑品牌是"+noteBook.yanSe);

	}
}

//学生类
class Student{
	long id;
	String name;
	Computer macBook;
}

//计算机类
class Computer{
	String pingPai;
	String xingHao;
	String yanSe;

}		