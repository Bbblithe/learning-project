//在Editplus当中，字体颜色为红色的表示一个类的名字，并且这个类是javaSE类库中自带的。
//我们自定义的类MethodTest12，字体是’绿色‘的，是标识符
//javaSE类库自带的类，例如：String.class、System.class，这些类的类名也是标识符。
//只要是类名就一定是标识符。
//白色是变量

//重点：方法调用的时候，在参数传递的时候，实际上传递的是变量中保存的那个“值”传过去。
public class MethodTest12{
	public static void main(String[] args){
		int a=10;
		int b=20;

		int resValue=sumInt(a,b); //等号右边先执行，再将值赋值给左边
		System.out.println("retValue="+resValue);
	}

	public static int sumInt(int i,int j){
		int result =i + j;
		int num =3;
		int resValue=divide(result,num);
		return resValue;
	}

	public static int divide(int x,int y){
		int z=x/y;
		return z;
	}
}