package xu.wen.jie.blithe.javase.bean;

import java.io.Serializable;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/7 14:47
 * Description:
 */


public class User implements Serializable {
    private int no;

    // transient关键字表示游离的，不参与序列化。
    private transient String name; // name不参与序列化操作！

    public User(){

    }

    public User(int no, String name){
        this.name = name;
        this.no = no;
    }

    public void setNo(int no){
        this.no = no;
    }

    public int getNo(){
        return no;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "用户（"+name+")卡号："+no;
    }

}
