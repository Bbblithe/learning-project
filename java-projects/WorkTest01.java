public class WorkTest01{
	public static void main(String[] args){
		/*
			验证7是否是素数
				实验思路：
					7/1【不需要】
					7/2【7%2 !=0】
					7/3【7%3 !=0】
					7/4【7%4 !=0】
					7/5【7%5 !=0】
					7/6【7%6 !=0】
					7/7【不需要】
				结论是：7是素数	
		*/
		/*
		for(int i=1;i<=100;i++){
			boolean isSuShu = true; //默认将i看作一个素数【标记在开发中比较常用】
			for(int j=2;j<i;j++){
				//j是什么：2 3 4 5 6
				if(i%j ==0){
					//非素数
					isSuShu = false;
					//已经知道i是非素数，跳出循环
					break;
				}
			}
			System.out.print(isSuShu ? i + "是素数，" : i + "不是素数，"); //真就输出 素数i，假就输出 该数字不是数字
		}
		*/
		int count =0;
		for(int i=1;i<=100;i++){
			boolean isSuShu = true; //默认将i看作一个素数【标记在开发中比较常用】
			for(int j=2;j<i;j++){
				//j是什么：2 3 4 5 6
				if(i%j ==0){
					//非素数
					isSuShu = false;
					//已经知道i是非素数，跳出循环
					break;
				}
			}
			if(isSuShu){
				count++;
				System.out.print(i + ",");
				if(count == 8){
					System.out.print("    ");
					count = 0;
				}
			}
		}
	}
}