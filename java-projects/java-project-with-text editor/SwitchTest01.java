/*
	关于switch语句：
		*switch语句也属于选择结构，也是分支语句
		*swicch语句的语法结构钢：
			一个比较完整的Switch应该这样编写：

				switch(int/String类型的字面值或变量){
					case int或String类型的字面值或变量：
						java语句;
						...
						break;
					case int或String类型的字面值或变量：
						java语句;
						...
						break;
					case int或String类型的字面值或变量：
						java语句;
						...
						break;
					case int或String类型的字面值或变量：
						java语句;
						...
						break;
					...
					default:
						java语句;
						...	
				}
		*switch语句的执行原理：
			switch后面小括号当中的“数据”和case后面的“数据”进行一一匹配，匹配成功的分支执行。
			按照自上而下的顺序依次匹配。

		*匹配成功的分支执行，分支当中最后又“break;“语句的话，整个switcg语句终止。
		
		*匹配成功的分支执行，分支当中没有”break;”语句的话，直接进入下一个分支执行（不进行匹配）,
		这种现象被称为case的穿透现象。【提供break;语句可以避免穿透】

		*所有分支都没有匹配成功，当有defaul的语句话，会执行defaul当中的语句。

		*switch后面和case后面只能是int或String类型的数据，不能是探测其他类型。
			#当然byte，short，char也可以直接写到switch和case后面，因为他们可以进行自动类型转换。
			byte，short，char可以自动转换成int类型

			#JDK6的话，switch和case后面只能探测int类型。
		
			#JDK7之后包括7版本在内，引入新特性，switch关键字和case关键字后面可以探测int和String类型的数据。

		*case可以合并：
		int i =10;
		switch(i){
			case 1: case 2: case 3: case 10:
				System.out.println("Test Code!");
		}	

*/
public class SwitchTest01{
	public static void main(String[] agrs){
		/*
		long a = 10L;
		int b = a;
		*/

		/*
		long x = 100L;
		switch(x){}//编译报错
		*/
		long x = 100L;
		switch((int) x){}

		byte b = 10;
		switch(b){}

		short a =10;
		switch(a){}

		char c = 'a';
		switch(c){}

		char cc = 97;
		switch(cc){}

		//switch(true){}
		//不兼容的数据类型

		String username = "zhangsan";
		switch(username){}

		/*
			较完整的switch语句
		*/
		//就收用户的输入：
		//1 表示星期一
		//2 表示星期二
		//...
		//7 表示星期日
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入数字:");
		int num = s.nextInt();
		switch(num){
			case 1 :
				System.out.println("星期一");
				break;
			case 2 :
				System.out.println("星期二");
				break;
			case 3 :
				System.out.println("星期三");
				break;
			case 4 :
				System.out.println("星期四");
				break;
			case 5 :
				System.out.println("星期五");
				break;
			case 6 :
				System.out.println("星期六");
				break;
			case 7 :
				System.out.println("星期日");
				break;
			default :
			 	System.out.println("对不起，您输入的数字非法");
		}

	}
}