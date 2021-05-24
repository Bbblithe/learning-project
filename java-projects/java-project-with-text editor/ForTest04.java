/*
	循环语句和条件判断语句嵌套使用【for和if的嵌套】
*/
public class ForTest04{
	public static void main(String[] args){

		for(int i = 1;i <= 100;i +=2){
			System.out.println("100内的所有奇数有"+i );
		}

		for(int a = 0;a <= 100; a++){
			if(a%2 != 0){
				System.out.println("1-100里的奇数" + a);
			}
		}
	}
}	