package shilian;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/14 18:18
 * Description:
 */


class Customer {
    private long number;
    private String name;
    private String address;
    private int age;

    public void setNumber(long number) {
        if (number > 999999999 || number < 100000000) {
            System.out.println("请检查您输入的学号是否无误，或者您的学号不属于我们学校！");
        } else {
            this.number = number;
        }
    }

    public long getNumber() {
        return number;
    }

    public void setName(String name) {
        if (!name.equals("徐文杰")) {
            System.out.println("对不起，您不是我们学校的用户，请麻烦认证后重试");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setAddress(String addr) {
        if (addr.equals("四川")) {
            System.out.println("再次输入您的市");
        } else if (!addr.equals("四川成都")) {
            System.out.println("不好意思，验证失败。请重新再输入！");
        } else {
            System.out.println("确认成功");
            address = addr;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int old) {
        if (old < 0 || old > 110) {
            System.out.println("不好意思，我们学校并未有如此长寿的用户");
        } else if (old > 100) {
            System.out.println("在这里祝愿您长命二百岁");
            age = old;
        } else {
            age = old;
        }
    }

    public int getAge() {
        return age;
    }

}
