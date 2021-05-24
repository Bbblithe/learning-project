package test004;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/14 16:49
 * Description:
 */

//顾客类
class Customer {

    //属性
    private int id;
    private String name;
    private int age;
    private String addr;

    //setter and getter方法
    public int getId(){
        return id;
    }
    public void setId(int id){
        //安全控制
        this.id= id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age= age;
    }
    public String getAddr(){
        return addr;
    }
    public void setAddr(String addr){
        this.addr= addr;
    }
}
