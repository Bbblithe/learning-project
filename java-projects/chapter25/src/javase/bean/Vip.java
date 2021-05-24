package javase.bean;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/15 19:54
 * Description:
 */


public class Vip {
    int no;
    String name;
    String birth;
    boolean sex;

    public Vip(){

    }

    public Vip(int no){
        this.no = no;
    }

    public Vip(int no,String name){
        this.no = no;
        this.name = name;
    }

    public Vip(int no,String name,String birth){
        this.no = no;
        this.birth = birth;
        this.name = name;
    }

    public Vip(int no,String name , String birth, boolean sex){
        this.no = no ;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }

    public String toString(){
        return "账号：" + no + "，姓名【" + name + "】，出生日期：" + birth + (sex ? ",男":",女");
    }
}
