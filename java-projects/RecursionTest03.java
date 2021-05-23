/*
	使用递归计算1-N的求和
*/
public class RecursionTest03{
	public static void main(String[] arg){
		//1-4的和
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("这里输入您的值--->");
		int n=s.nextInt();
		int retValue=sum(n);
		工具.打印(retValue);
	}

	public static int sum(int n){
		if(n==1){
			return 1;
		}
		else{
		return n+sum(n-1);
		}
	}
}	