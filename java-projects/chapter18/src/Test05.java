/**
 * Author:  blithe.xwj
 * Date:    2020/12/5 18:01
 * Description:
 */


class Test05 {
    public static void main(String[] args) {
        Address ad1=new Address("YiBing","CuiPingQu","52952");
        Address ad2=new Address("YiBing","CuiPingQu","54954");
        Address ad3=new Address("YiBing","CuiPingQu","52952");
        User u1=new User("blithe",ad1);

        User u2=new User("andy",ad2);

        User u3=new User("blithe",ad3);
        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u3));
        System.out.println(u3.equals(u3));
    }
}

class User{
    //用户名
    String name;

    //用户的住址
    Address addr;

    public User(){

    }
    public User(String name,Address addr){
        this.name = name;
        this.addr = addr;
    }

    //重写equals方法
    //重写规则：当一个用户的用户名和家庭住址都相同，表示同一个用户。
    //这里的equals判断的是User对象和User对象是否相等。
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null||!(obj instanceof User))return false;
        User u =(User)obj;
        return this.name.equals(u.name)&&this.addr.equals(u.addr);
    }
}

class Address{
    String city;
    String street;
    String zipcode;
    public Address(){

    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    //注意：这里并没有重写equals方法。
    //这里的equals判断的是：Address对象和Address对象是否相等。
    public boolean equals(Object obj){
        if(this == obj)return true;
        if(obj==null||!(obj instanceof Address))return false;
        Address ad=(Address)obj;
        return this.city.equals(ad.city)&&this.street.equals(ad.street)&&this.zipcode.equals(ad.zipcode);
    }
}