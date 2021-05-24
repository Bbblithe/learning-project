/*
	continue语句：
		1、continue表示：继续/go on /下一个

		2、continue也是一个continue 关键字加上一个分号构成一个单独的完整的java语句，主要出现循环语句当中用来控制循环的执行

		3、break和continue的区别？
			*break表示循环不执行了
			*continue表示直接进入下一次的循环继续执行。


*/
public class ContinueTest01{
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			if(i==5){
				break;
			}
			System.out.println(i);
		}
		System.out.println("Hello World");

		for(int i=0;i<10;i++){
			if(i==5){
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Hello World");
	}
}			