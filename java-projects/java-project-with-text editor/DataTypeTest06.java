/*
  		关于浮点型数据类型：
  		  float 单精度【四个字节】
  		  double 双精度【八个字节，精度较高】

  	double的精度太低【相对来说的】不适合做财务软件。
  	财务涉及到钱的问题，要求精度较高所以SUN在基础SE类库中为程序员准备了精准度更高的的类型，只不过这种类型是一种饮用的
  	数据类型，不属于基本数据类型，他是：java.math.BigDecimal

  	其实java程序中SUN提供了一套庞大额类库，java程序员是基于这套基础的类库来进行开发的，所以要知道javaSE类库的字节码在哪，要知道java的SE类库的源码在哪儿
  		*SE类库字节码：
  		*SE类库源码：位置见视频

  	例如String .java 和String calss

  	在java语言中，所有的浮点型字面值【3.0】，默认被当作double类型来处理，
  	要想该字面值当作float类型来处理，需要在字面值后面添加F/f

 	*注意
  		double和float在计算机内部二进制存储的时候存储的都是近似值。
		在现实世界当中有一些数字是无限循环的，例如：3.3333.....	
		计算机的资源是有限的，用有限的资源存储无限的数据只能存储近似值。
*/
  	public class DataTypeTest06
  	{
  		public static void main(String[] args)
  		{
  			//3.0是double类型的字面值
  			//d是double 类型的变量
  			//所以不存在类型转换
  			double d = 3.0;

  			System.out.println(d);

  			//float f = 5.1;  由于float是大容量，而默认的5.1是double小容量
  			//因为大容量无法自动转换小容量，所以报错会损失精准度
  			//修改方法---> float f = (float)5.1;
  			float f = 5.1f;// 没有类型转换
  			System.out.println(f);

  		}
  	}
