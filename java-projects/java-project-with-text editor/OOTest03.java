public class OOTest03{
	public static void main(String[] args){
		//u是一个引用
		//u是一个局部变量
		User u=new User();

		//a是引用
		//a还作为一个局部变量
		Address a=new Address();
		u.addr =a;

		System.out.println(u.addr.city);//null

		a.city ="天津";
		System.out.println(u.addr.city);
	}
}
class User{
	int no;
	String name;
	Address addr;
}
class Address{
	String city;
	String street;
	String zipcode;
}