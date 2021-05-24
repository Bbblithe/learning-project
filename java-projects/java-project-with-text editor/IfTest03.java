/*
	需求：

		判断当前的天气：

			当外面下雨的时候：
				带雨伞：
					判断性别：
						当性别为男：带一把大黑伞
						当性别为女：带一把小花伞

			当外面是晴天的时候：
				判断天气的温度：
					当天气温度在30度以上：
						当性别为男：带墨镜
						当性别为女：擦防晒霜
	提示：
		*一定会用到嵌套
		*天气状况、温度、性别都需要从键盘输入。
			天气状况：1表示下雨、0表示晴天
			温度直接使用数字即可
			性别：1表示男、0表示女					
*/
public class IfTest03{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("按要求输入以下当前数据即可进行简单的安排");
		System.out.print("天气状况，1表示下雨、0表示晴天：");
		int whther = s.nextInt();
		System.out.print("温度情况：");
		double temp = s.nextInt();
		System.out.print("性别，1表示男、0表示女：");
		int sex = s.nextInt();
		String wenZi = "伞";
		if(whther == 1){
			if(sex == 1){
				wenZi = "大黑伞";
			}else if(sex == 0){
				wenZi = "小花伞";
			}
			System.out.println("带一把" + wenZi);
		}
		else if(whther == 0){

			if(temp > 30){
				if(sex == 1){
					System.out.println("带墨镜哟");
				}else if(sex == 0){
					System.out.println("擦防晒霜");
				}
			}
			else if(temp < 30){
				System.out.println("什么也不用带哈");
			}
		}
		else{
			System.out.println("不好意思，麻烦您看看输入的值是否满足要求（1/0）?");
		}	

	}
}						