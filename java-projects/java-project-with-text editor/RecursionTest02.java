/*
	不使用递归，计算1-N的求和【可以不用递归，尽量不用递归】
*/
public class RecursionTest02{
	public static void main(String[] args){
		/*
		int sum=0;
		for(int i=0;i<=4;i++){
			sum+= i;
		}
		System.out.println("1到4内所有数字之和为"+sum);
		*/i·
		工具.打印("该程序可以实现从1到你输入的任意数字的求和");
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("在这里输入你想从1到你输入的数字求和，即可开始计算-->");
		int n=s.nextInt();
		int retValue=sum(n);
		工具.打印("1到"+n+"之间所有整数的和为"+retValue);

	}
	public static int sum(int n){
		int result=0;
		for(int i=0;i<=n;i++){
			result+=i;
		}
		return result;
	}
}	