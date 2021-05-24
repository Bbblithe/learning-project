/*
	关于java语言当中的if语句，属于选择结构，if语句又被称为分支语句，又被称为分支语句/条件控制语句
		*if语句的语法结构：四种编写方式
			第一种：
				if(布尔表达式)
				{
					java语句：
					java语句：
					java语句：
				}
			第二种:*这种方式一定有分支执行，因为含有if
				if(布尔表达式)
				{
	
				}
				else
				{
	
				}
			第三种:*这种方法一定有分支执行，同理
				if(布尔表达式)
				{
	
				}
				else if(布尔表达式)
				{
	
				}
				else if(布尔表达式)
				{
	
				}	
				else
				{
	
				}
		*重点：if语句中任何一个分支执行，直接全部结束分支结构。	
		*"所有的控制语句"（for switch while） 都是可以嵌套使用，只要合理就行。
		*嵌套使用的时候，代码格式要保证完美。【该缩进的时候必须缩进，大部分情况下使用大括号包围的需要缩进】
		*if 语句的分支中只有一条java语句的话，大括号可以省略不写。
			if()										
			{													
				一条java语句;		--------> 等同于------>	if(true/false) 一条java语句;//这种方式不推荐使用，别人这么写能看懂就行。
			}

*/
public class IfTest01
{
	public static void main (String[] args){
		int a =0;//1是下雨 0时未下雨
		int x=a;
		int sex = 1;//0是女生，1是男生
		if(x == 1){
			if(sex == 0){
				System.out.println("该带上伞了！");
			}
			else if (sex ==1 ){
				System.out.println("该打车了！");
			}		
			
		}
		else{
			if(sex == 0){
				System.out.println("该戴墨镜");
			}
			else if (sex == 1){
				System.out.println("涂上防晒霜，带上太阳伞");
			}	
		}
	/*	int grade = 80;
		if(grade >= 90){
			System.out.println('A');
		}
		else if(grade >= 80){
			System.out.println('B');
		}
		else if(grade >= 70){
			System.out.println('C');
		}
		else if(grade >- 60){
			System.out.println('D');
		}
		else{
			System.out.println('E');
		}
	*/
		double score = 59.5;

		if(score < 0 || score >100){
			System.out.println("对不起，您提供的考生成绩不合法");
		}
		else if(score >= 90){
			System.out.println('A');
		}
		else if(score >= 80){
			System.out.println('B');
		}
		else if(score >= 70){
			System.out.println('C');
		}
		else if(score >= 60){
			System.out.println('D');
		}
		else{
			System.out.println('E');
		}	
	}
}
