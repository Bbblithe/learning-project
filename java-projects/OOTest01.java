public class OOTest01{
	public static void main(String[] args){
		int i=10;
		//通过一个类可以实例化N个对象
		//实例化对象的方法：new 类名();
		//new是java语言当中的一个运算符
		//new运算符的作用是创建对象，在JVM堆内存当中开辟新的内存空间
		//方法去内存：在类加载的时候，class字节码代码片段被加载到该内存空间当中。
		//栈内存（局部变量）：方法代码片段执行的时候，会给该方法分配内存空间，在栈内存中压栈。
		//堆内存：new的对象在堆内存中储存
		//Student是一个引用数据类型
		//s是一个变量名
		//new Student()是一个学生对象
		//s是一个局部变量【在栈内存中储存】
		//什么事对象？new运算符在堆内存中开辟的内存空间称为对象。
		//什么是引用？引用是一个变量，只不过这个变量保存了另一个java对象的内存地址。
		//java语言当中，程序员不能直接操作堆内存，java中没有指针。不像c语言。
		//java语言当中，程序员只能通过“引用”去访问堆内存当中对象内部的实例变量。
		Student s=new Student();
		
		//访问实例变量的语法格式
		// 读取数据：引用.变量名
		// 修改数据：引用.变量名 = 值
		int stuNo=s.no;
		String stuName=s.name;
		int stuAge=s.age;
		boolean stuSex=s.sex;
		String stuAddr=s.addr;

		/*
		System.out.println("学号="+stuNo);
		System.out.println("姓名="+stuName);
		System.out.println("年龄="+stuAge);
		System.out.println("性别="+stuSex);
		System.out.println("地址="+stuAddr);
		*/
		System.out.println("学号="+s.no);
		System.out.println("姓名="+s.name);
		System.out.println("年龄="+s.age);
		System.out.println("性别="+s.sex);
		System.out.println("地址="+s.addr);

		s.no =10;
		s.name ="jack";
		s.age =20;
		s.sex =true;
		s.addr ="北京";
		System.out.println("学号="+s.no);
		System.out.println("姓名="+s.name);
		System.out.println("年龄="+s.age);
		System.out.println("性别="+s.sex);
		System.out.println("地址="+s.addr);

		//再通过类实例化一个全新的对象
		//stu是一个引用
		//stu同时也是一个局部变量
		//Student是变量的数据类型
		Student stu =new Student();

		System.out.println(stu.no);
		System.out.println(stu.name);
		System.out.println(stu.addr);
		System.out.println(stu.sex);
		
		//编译报错，no这个实例变量不能直接采用“类名”的方式访问
		//因为no是实例变量，对象级别的变量，变量储存在java对象的内部，必须先有对象
		//通过对象才能访问no这个实例变量。不能直接通过“类名”访问
		//System.out.println(Student.age);


	}
}

/*

	局部变量在栈内存中存储
	成员变量中的实例变量在堆内存的java对象内部存储

	实例变量是一个对象一份，100个对象有100份。
*/



//学生类
//学生类是一个模版
//描述了所有学生的共同模版【状态+行为】
//当前类只描述了学生的状态信息【属性】
//studetn是类，属于引用数据类型，这个类型的名就是：Student01
class Student{
	//类体=属性+方法

	//属性【存储数据采用变量的形式】
	//由于变量定义在类体当中，方法体之外，这种变量称为成员变量
	//所有学生都有学号信息
	//但是每一个学生的学号都是不同的
	//所有要访问这个学号必须先创建对象，通过对象去访问学号信息
	//学号信息不能直接通过“类”去访问，所有这种成员变量又被叫做：实例变量
	//对象又被称为实例，实例变量又被称为对象变量。【对象级别的变量】
	//不创建对象，这个no变量的内存空间是不存在的，只有创建了对象，这个no变量内存空间才会被创造
	int no;

	//性别
	boolean sex;

	//姓名
	String name;

	//住址
	String addr;

	//年龄
	int age;
}
//成员变量没有手动赋值的话，系统赋默认值
//默认值
/*
	数据类型                     默认值
	----------------------------------------------
	byte，short，int，long      	0
	float，double				0.0
	boolean 					false
	char 						\u0000
	字符串						null void
*/
