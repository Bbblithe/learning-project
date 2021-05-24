/*
	关于布尔型数据类型：
		boolean

	在java语言当中boolen类型只有两个值：true，false，没有其他值。
	不像c语言当中，0和1可以表示假和真。

	在底层存储的时候boolean类型占用1个字节，因为实际存储的时候false底层是0
	true底层是1.
	布尔类型在实际开发中非常重要，经常使用在逻辑运算和条件控制语句当中。	
*/
public class DataTypeTest07
{
	public static void main(String[] args)
	{
		//boolean flag =1;(报错，不兼容的类型)

		boolean loginSuccesss = false;
		if(loginSuccesss)
		{
			System.out.println("恭喜你，登陆成功");
		}	
		else
		{
			System.out.println("对不起，登陆失败");
		}	
	}
}