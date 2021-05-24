/*
  关于八种基本类型数据的默认值
         数据类型                     默认值
     ——————————————————————————————————————————    
     byte,short,int,long.            0
     float,double                    0.0
     boolean                         false [在c语言中 ，true是1 false是0]
     char                            \u0000
   *八种数据类型的默认值一切都是向0看齐。
*/
public class DataTypeTest02
{
	static int k= 1000; //这里的k 叫做成员变量
	//   *成员变量在没有手动赋值，系统会默认赋值。
	static int j;
	public static void main(String[] args)
	{
		/*
		int i;  //局部变量  必须自己手动赋值，先声明再赋值，这样才能访问。
		System.out.println(i);
		*/

		System.out.println (k);
		System.out.println(j);//j 默认不赋值，自动会赋予0
	}
}