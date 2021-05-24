/**
 * Author:  blithe.xwj
 * Date:    2020/11/22 11:14
 * Description:
 *  在程序中经常要对时间进行操作但是并没有时间类型的数据。
 *  那么我们可以自己实现一个时间类来满足程序中的需求。
 *  定义名为MyTime的类其中应用三个整形成员 时hour、分minute、秒second
 *  为了保证数据的安全性这个三个成员变量应声明为私有。
 *  为MyTime类定义构造方法以便创建对象时初始化成员变量。
 *  再定义diaplay方法将时间信息打印出来。
 *  为Mytime类添加以下方法
 *      addSecond(int sec)
 *      addMinute(int min)
 *      addHour(int hou)
 *      subSecond(int sec)
 *      subMinute(int min)
 *      subHour(int hou)
 *  分别对时、分、秒进行加减运算。
 */


public class Homework3 {
    public static void main(String[] args) {
        MyTime t=new MyTime(13,31,31);
        t.dispaly();

        //加秒
        t.addSecond(141312);
        t.dispaly();

        //加时
        t.addHour(14124);
        t.dispaly();

        //加分
        t.addMinute(11231);
        t.dispaly();

        //减分
        t.subMinute(151);
        t.dispaly();
    }
}

class MyTime{
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        if(hour<0||hour>24){
            System.out.println("不好意思，时的数值有问题");
            return ;
        }
        else{
            this.hour = hour;
        }
        if(minute<0||minute>60){
            System.out.println("不好意思，分的数值有问题");
            return;
        }
        else{
            this.minute = minute;
        }
        if(second<0||second>60){
            System.out.println("不好意思，秒的数值有问题");
        }
        else{
            this.second = second;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour<0||hour>24){
            System.out.println("不好意思，时的数值有问题");
            return ;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute<0||minute>60){
            System.out.println("不好意思，分的数值有问题");
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second<0||second>60){
            System.out.println("不好意思，秒的数值有问题");
        }
        this.second = second;
    }

    /*加秒*/
    public void addSecond(int sec){
        int oldallsec=(getHour()*60*60)+(getMinute()*60)+getSecond();
        int newallsec=oldallsec+sec;
        setHour(((newallsec/60)/60)%24);
        setMinute(((newallsec/60)%60));
        setSecond((newallsec)%60);
    }
    /*加分*/
    public void addMinute(int min){
        int oldallmin=(getHour()*60)+getMinute();
        int newallmin=oldallmin+min;
        setHour(newallmin/60%24);
        setMinute(newallmin%60);
    }
    /*加时*/
    public void addHour(int hou){
        int oldallhou=getHour();
        int newallhou=oldallhou+hou;
        setHour(newallhou%24);
    }
    /*减秒*/
    public void subSecond(int sec){
        int oldallsec=(getHour()*60*60)+(getMinute()*60)+getSecond();
        int newallsec=oldallsec-sec;
        setHour(((newallsec/60)/60)%24);
        setMinute(((newallsec/60)%60));
        setSecond((newallsec)%60);
    }
    /*减分*/
    public void subMinute(int min){
        int oldallmin=(getHour()*60)+getMinute();
        int newallmin=oldallmin-min;
        setHour(newallmin/60%24);
        setMinute(newallmin%60);
    }
    /*减时*/
    public void subHour(int hou){
        int oldallhou=getHour();
        int newallhou=oldallhou-hou;
        setHour(newallhou%24);
    }

    public void dispaly(){
        System.out.println(getHour()+":"+getMinute()+":"+getSecond());
    }
}
