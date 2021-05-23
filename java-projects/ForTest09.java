/*
	编写for循环找出1～100中所有素数

	素数：又被称为质数，能够被1和自身整除，不能够被数字整除的数称为素数

	该题目主要掌握的知识点：
		*for循环的使用
		*for循环的嵌套
		*标记
		*break;
		*统计

	下面是我自己的想出来的代码	
*/
public class ForTest09{
	public static void main(String[] args){
		for(int i=1;i<=100;i++){//这个我是想列出1-100中的所有数字嘛
			xixi1: for(int j=2;j<i;j++){ //这个for循环是为了让 第一个循环列出来的数除以（从2 到 i-1的所有数字）
				if(i%j == 0){ //求余数，如果他等于0的话就说明他不是素数
					break xixi1 ;	//此时就跳出求余数和除的数字的循环，直接让1-100中的数字加一开始找下一个数字
				}
				else if(j == i-1){
					System.out.print( i + "是素数,");
				}
				else{
					continue; //发现这个被除数目前满足条件，（进入第二层for循环）让除数再加1 再次求余
				}				
			}
		}
	}
}

//老师的标准好答案在WorkTest01.java中。详情 运用了许多
