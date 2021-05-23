/*
 *字面值:
 -100
 -"abc"
 -"a"
 -true、false
 -10
 (上面都是字面值)
   *字面值就是数据。
   *字面值是java程序的组成部分之一。包括标识符和关键字他们都是java源程序的组成部分
   *数据在现实生活中是分门别类的，所以数据在计算机编程语言中也是有类型的：「数据类型」
                                                                 —10、100       属于整形字面值
                                                                 -3.14          属于浮点型字面值
                                                                 -true、false   属于布尔型字面值
                                                                 -"abc"、"中国人"属于字符串型字面值
                                                                 -’A‘、’人‘      属于字符型字面值
           *java语言中所有的字符串型字面值必须使用双引号括起来，双引号半角""
           *java语言中所有的字符型字面值必须使用单引号括起来，单引号半角''

*/
public class ConstTest01
{
	public static void main(String[] args){
		System.out.println("abc");
		System.out.println("最近你过得怎么样");
		System.out.println(10);
		System.out.println(100);
		System.out.println(false);
		System.out.println(true);
		System.out.println('A');
		System.out.println("3.14");

	}
}