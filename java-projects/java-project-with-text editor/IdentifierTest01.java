//关于java语言中的标识符
/*
-标识符就是java 源程序程序员可以自己命名的单词都是标识符
-标识符可以标识
  *类名
  *方法名
  *变量名
  *接口名
  *常量名
  ...

 —标识符命令规则：
  *只能用"数字，下划线_，字母，美元符号$“ 组成，不能含有其他符号
  *不能数字开头
  *严格区分大小写
  *关键字不能用标识符
  *理论上无长度限制

-标识符的命令规范（只是一种规范，编译器并不会报错）
 *最好见名知意（意思就是自己的标识符想表示钱，就用money 来直接作为标识符）
 *遵守驼峰命名方式
  SystemService
  UserService
 *类名，接口名：首字母大写，后面每个单词首字母大写
 *变量名，方法名：首字母小写，后面每个单词首字母大写
 *常量名：全部大写 
*/
 public class IdentifierTest01//这里的IdentifierTest01是类名，名字可以修改
 {
 	  //main是一个方法名
 	public static void main (String[] args)
 	{
    System.out.println("o love java");
  }
 	public static doSome()
  {
 		//i是变量名
 		int i = 10;
 	}
 } 