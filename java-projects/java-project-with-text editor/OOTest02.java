//个测试类
public class OOTest02{
	public static void main(String[] args){
		//穿件User对象
		//u是一个局部变量
		//u是一个引用
		//u保存内存地址指向堆内存的User对象
		User u =new User();

		//输出User对象内部实例变量的值
		System.out.println(u.no); //0
		System.out.println(u.name);//null
		System.out.println(u.addr);//null

		//修改User对象内部实例变量的值
		u.no =110;
		u.name ="jack";//"jack"是一个java对象，属于String对象
		u.addr =new Address();

		//在mian方法当中只能看到一个引用“u”
		//一起都是只能通过u来进行访问
		System.out.println(u.name+"居住在哪个城市"+u.addr.city);
		System.out.println(u.name+"居住在哪个街道"+u.addr.street);
		System.out.println(u.name+"邮编"+u.addr.zipcode);

		u.addr.city ="北京";
		u.addr.street="朝阳";
		u.addr.zipcode="11111111";

		System.out.println(u.name+"居住在哪个城市:"+u.addr.city);
		System.out.println(u.name+"居住在哪个街道:"+u.addr.street);
		System.out.println(u.name+"邮编:"+u.addr.zipcode);		

	}
}
class User{
	//属性【以下都是成员变量之实例】

	//用户编号
	//int是一种基本数据类型：整数型
	//no是一个实例变量
	int no;

	//用户名
	//String是一种引用数据类型：代表字符串
	//name也是一个实例变量
	//name是一个引用
	String name;

	//家庭住址
	//Adress是一种引用数据类型：代表家庭住址
	//add是一个实例变量
	//addr是一个引用
	Address addr;
}
//家庭住址类
class Address{
	//属性【成员变量之实例变量】
	//城市
	//String是一种引用数据类型，city是一个变量名，属于实例变量
	//city是一个引用：保存内存地址的一个变量，该变量保存内存地址指向了堆内存当中的对象。
	String city;

	//街道
	String street;

	//邮编
	String zipcode;
}