

/**
 * Author:  blithe.xwj
 * Date:    2020/11/21 18:38
 * Description:
 * 需求：
 *      请定义一个交通工具(Vehicle)的类
 *              其中有属性：
 *              速度（speed）
 *              体积（size）等等
 *              方法移动（move（））
 *              设置速度（setSpeed（int speed））
 *              加速speedUp（）
 *              减速speedDown（）等等.
 *
 *              最后在测试类Vehicle中的main()中实例化一个交通工具对象
 *              并通过方法给它初始化speed，size的值并打印出来。
 *              另外调用加速减速的方法对速度进行改变。
 */


public class Homework2 {
    public static void main(String[] args){
        //通过无参数构造方法创建对象
        Vehicle car=new Vehicle();

        //通过set方法给属性赋值
        car.setSpeed(120);
        car.setSize(5);
        System.out.println("您目前的速度"+car.getSpeed()+",您目前驾驶的车长"+car.getSize());
        java.util.Scanner yes=new java.util.Scanner(System.in);
        do{
            System.out.println("看到驾驶车辆消息请输入已确认！！！");
        }while (!yes.nextLine().equals("已确认"));
        car.move(car.getSpeed());


        System.out.println("加速：");
        java.util.Scanner jiasu=new java.util.Scanner(System.in);
        //调用加速方法
        car.speedUp(jiasu.nextInt());
        System.out.println("speed:"+car.getSpeed());
        //调用减速方法
        System.out.println("减速：");
        java.util.Scanner jiansu=new java.util.Scanner(System.in);
        car.speedDown(jiansu.nextInt());
        System.out.println("speed:"+car.getSpeed());
        //通过有参数构造方法创造对象
        //Vehicle car=new Vehicle();

    }
}
//交通工具
class Vehicle{
    //这里是两个属性
    private int speed;
    private double size;

    public Vehicle() {
    }

    public Vehicle(int speed, double size) {
        this.speed = speed;
        this.size = size;
    }

    //这里是速度的设置
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    //交通工具的移动方法
    public void move(int speed){
        System.out.println("汽车现在正以"+getSpeed()+"匀速行驶");
    }
    //加速方法
    public void speedUp(double jiasu){
        speed+=jiasu;
        if(speed>200){
            speed=200;
            System.out.println("不好意思，根据安全交通发展速度不能超过200km/h");
        }
    }
    //减速犯法
    public void speedDown(double jiansu){
        if(jiansu>speed){
            speed=0;
            System.out.println("不好意思，最低速度是0,无法减速到负数");
        }
        else{
            speed-=jiansu;
        }
    }
}
