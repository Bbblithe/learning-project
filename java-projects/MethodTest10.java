/*
	在返回值类型是void的方法中使用"return;"语句。
	"return;" 语句出现在返回值void的方法当中主要是为了结束当前方法。
*/
public class MethodTest10{
	public static void/* 这里就是数据类型 这里的void不能返回数据，但是可以return;用来结束语句比如下面结束main */main(String[] args){
		m();

		for(int i=10;i>0;i--){
			if(i==2){
				return; //结束的是main方法
			}
			System.out.println("data:-->"+i);
		}
		System.out.println("Execute here!");
	}
	public static void m(){
		/*
		return 10;//编译无法通过因为，结果类型为空，却返回了一个int类型的值，不兼容的类型: 意外的返回值
		*/
		/*
		return; //可以执行，因为没有返回值，仅是一个返回语句，终止方法的执行
		*/
		for(int i=0;i<10;i++){
			if(i==5){
				// return; //不是终止for循环，终止的是m()方法。直接结束整个m类方法
				break; //终止的for循环，if外层的hello world 还能继续执行。
			}
			System.out.println("i----->" +i);
		}
		System.out.println("Hello World");
	}
}	