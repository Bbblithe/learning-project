package 方法覆盖;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/23 09:34
 * Description:
 *
 */

//方法覆盖比较经典的案例
//一定要注意：方法覆盖/重写的时候，建议将父类的方法复制粘贴，这样比较保险。
public class OverrideTest03 {
    public static void main(String[] args){
        //创建中国人对象
        ChinaPeople c=new ChinaPeople();
        c.setName("张三");
        c.Speak();

        //创建美国人对象
        AmericaPeople a=new AmericaPeople();
        a.setName("blithe");
        a.Speak();

    }
}

//人
class People{
    //属性
    private String name;
    //无参数构造
    public People(){

    }

    //有参数构造
    public People (String name){
        this.name=name;
    }

    //setter and getter
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    //人都会说话
    public void Speak(){
        System.out.println(name +"正在说话。。。。");
    }
}

//中国人
class ChinaPeople extends People{
    //中国人说话是汉语
    //所以子类需要对父类的speak()方法进行重写

    public ChinaPeople(String name) {
        super(name);
    }

    public ChinaPeople() {
    }

    public void Speak(){
        System.out.println(this.getName()+"正在说汉语");
    }
}

//美国人
class AmericaPeople extends People{
    //美国人说话是英语
    //所以子类需要对父类的speak()方法进行重写

    public AmericaPeople() {
    }

    public AmericaPeople(String name){
        super(name);
    }
    public void Speak(){
        System.out.println(this.getName()+" speaks English");
    }
}