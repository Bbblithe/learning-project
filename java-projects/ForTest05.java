/*
	在前一个程序的基础上计算1-100所有奇数的和
		1+2+3+4+.......+99累加

	运算符 += 就是专门完成追加的。	
*/
public class ForTest05{
	public static void main (String[] atgs){
		int sum = 0;
		for(int i =1;i<=100;i+=2){
			//i一定是奇数
			//累加求和
			sum +=i;
		}
		System.out.println("100内所有的奇数和=" + sum);
	}
}	