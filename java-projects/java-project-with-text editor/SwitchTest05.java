/*
	假设系统给定考生成绩，请判断考生的成绩等级：
		1、有效成绩范围：【0～100】

		2、考试成绩可能带有小数		92.5

		3、考试成绩和等级之间的对照关系：
			[90-100] 	A
			[80-90]	 	B
			[70-80]		C
			[60-70]		D
			[0-60]		E

		4、以上需求必须采用Switch语句完成，不能采用if。

		窍门： (int)(成绩/10）
			0
			1
			2
			3
			4
			5
			6
			7
			8
			9
			10	
*/
public class SwitchTest05{
	public static void main(String[] args){

		java.util.Scanner s = new java.util.Scanner(System.in);

		System.out.print("这里请输入您的成绩：");
		 double a = s.next();

		switch(a){
			case 10: case 9:
			System.out.println('A');
			break;
			case 8:
			System.out.println('B');
			break;
			case 7:
			System.out.println('C');
			break;
			case 6: 
			System.out.println('D');
			break;
			case 5: case 4: case 3: case 2: case 1: case 0:
			System.out.println('E');
			break;
			default :
			System.out.println("不好意思，您的成绩有误，麻烦请重新输入有效成绩！");
			break;

		}
	}
}			