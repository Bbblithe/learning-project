/*
	
*/
public class MethodTest12{
	public static void main(String[] args){
		int i=10;
		method(i);
		System.out.println("i--->"+i); //这里的输出结果是10 ，不是11。（因为方法互不联系，运行了直接就过了）
	}
	public static int method(int i){
		i++;
		System.out.println("method--->"+i);
		return i;
	}
}