public class KeyInputTest01
{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		//String userInputContent = s.next();
		//System.out.println("您输入了:" + userInputContent);
		int num = s.nextInt();
		System.out.println("您输入的数字是：" + num);
	}
}