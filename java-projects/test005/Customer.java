package test005;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 10:22
 * Description:
 */


class Customer {
    private int no;
    private String name;
    private String birth;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    //有参数的构造器
    public Customer(int a, String b, String c) {
        no = a;
        name = b;
        birth = c;
    }

    //无参数的构造器
    public Customer() {
    }
}
