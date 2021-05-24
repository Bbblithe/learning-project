/*
	先不使用递归，计算N的阶乘
	5的阶乘：
		5*4*3*2*1

*/

/*		//这里没用用上递归
public class RecursionTest04{
	public static void main(String[] args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("在这里输入数值--->");
		int n=s.nextInt();
		工具.打印(method(n));
	}

	public static int method(int n){
		int result=1;
		for(int i=n;i>=1;i--){
			result*=i;
		}
		return result;
	}
}		
*/
public class RecursionTest04{
	public static void main(String[] args){
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("在这里输入数值--->");
		int n=s.nextInt();
		工具.打印(method(n));
	}

	public static int method(int n){
		int result=1;
		if(n==1){
			return result;
		}
		else{
			return n*method(n-1);
		}
	}
}		