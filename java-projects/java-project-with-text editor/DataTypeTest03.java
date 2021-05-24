7/*
    关于java语言当中的char类型：
       转义字符 \

       转义字符出现在特殊字符之前，可将特殊字符转义为普通字符

       \n 换行符
       \t 制表符
       \‘ 普通的单引号
       \\ 普通的反斜杠
       \" 普通的双引号
*/
public class DataTypeTest03
{
	public static void main(String[] args)
	{
		//普通的n字符
		char c1='n';
		System.out.println (c1);

		char c2='\n';// \n 这属于一个换行符，是单个字符，所以可以被char数据类型赋值
		//反斜杠在java语言当中具有转译功能。
		System.out.println (c2);
		System.out.println("Hello");
		System.out.println("World!");
		//System.out.print（）和System.out.println（）的区别有就是ln具有换行作用，只是print只是输出
		System.out.print("Hello");
		System.out.println("World!");
          //'\t'是制表符tab  制表符与空格的编译码不同（虽然看着都是空白）他们的ASCII不一样。体现在键盘上两个不同的按键
		char k = '\t';		
		System.out.println(k);
		char o = '\\';
		//第一个反斜杠将后面的反斜杠给转译为普通的无转译功能的反斜杠

		//  char o ='\'      (反斜杠将后面的单引号转译为不具备特殊含义的普通单引号字符，所以左边的单引号需要重新加入多的一个单引号来结束。)
		      
		System.out.println(o);
		System.out.println("\"hello,world!\"");

		char m ='中';
		System.out.println(m);
		//jDK 中自带的native2ascii.exe命令，可以将文字转换成unicode编码形式
		  //怎么使用这个命令：
		//在命令行输入native2ascii，回车，然后输入中文文字再回车即可得到unicode编码
  

        char n ='\u4e2d'; //通过反斜杠\u 后面的一串数字是某个文字的unicode编码
        System.out.println(n);

  /*
        十六进制:0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1e 1f 20
        八进制 : 0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20 21 22.....
  */
	}
}