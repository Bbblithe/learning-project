/*
	for循环嵌套for循环
*/
public class ForTest06{
	public static void main(String[] args){
		for(int i = 1;i <= 10;i++){  //	共循环10次
			//循环体中可以编写其他的控制语句
			//控制语句可以嵌套使用
			//控制语句可以是：if、if.....else、switch、for、while、do...while

			//最好不要想太多，即使循环体中是一个for循环，不要将这个for循环特殊化，也只是一个普通的for循环
			//只不过是一段合法的java语法的代码
			//内层循环，内层循环中的变量名和外层循环中的变量名不能重名
			for(int j = 0;j<3;j++){
				System.out.println("j-->"+j);
			}
		}
	}
}