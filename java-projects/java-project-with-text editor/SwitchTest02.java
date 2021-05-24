/*
	switch确实可以探测String类型，这是java7的新特性
*/
public class SwitchTest02{
	public static void main(String[] args){

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("请输入星期几：");
		String dayOfWeek = s.next();
		switch(dayOfWeek){
			case "星期一" :
				System.out.println(1);
				break;
			case "星期二":
				System.out.println(2);
				break;
			case "星期三":
				System.out.println(3);
				break;
			default :
				System.out.println("对不起，您输入的数据非法");				
		}

	}
}