/*

*/
public class SwitchTest03{
	public static void main(String[] args){
		char c = 'A';
		switch(c) {
			case 'A':
				System.out.println("高级");
				break;
			case 'B':
				System.out.println("中级");	
				break;
			case 'C':	
				System.out.println("初级");
				break;
			default :
				System.out.println("出错了");
				break;	
		}
	}
}