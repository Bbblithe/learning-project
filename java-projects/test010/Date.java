package test010;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 21:12
 * Description:
 *
 * 自定义的日期类型
 *
 * this可以用在哪里：
 *      1、可以使用在实例方法当中，代表当前对【语法格式：this.】
 *      2、可以使用在构造当法当中，通过当前的构造方法调用其他的构造方法【语法格式：this(实参);】
 *
 * 重点【记忆】：this()这种方法只能出现在构造函数第一行。
 */


class Date {
    //属性
    private int year;
    private int month;
    private int day;

    //构造函数
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * 需求：当用户调用以下无参数的构造方法的时候，默认创造的日期是"1970-1-1"
     */
    public Date() {

        //System.out.println();
        /*
        this.year=1970;
        this.month=1;
        this.day=1;

        */

        //以上代码可以构造另一个构造方法来完成
        //但前提是不能创建新的对象。以下代码表示创建了一个全新的对象
        //new Date(1970,1,1);

        //需要采用以下的语法来完成构造方法的方式调用
        //这种方法不会创建新的java对象，但同时有可以达到调用其他的构造方法。
        this(1970,1,2);

    }

    //setter and getter方法
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<1970||year>2020){
            System.out.println("不好意思，您输入的年份有错");
        }
        else{
            this.year = year;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month<0||month>12){
            System.out.println("不好意思，您输入的月份有错");
        }
        else{
            this.month=month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

    }

    //对外提供一个方法可以将日期打印输出到控制台
    //实例方法
    public void print(){
        System.out.println(this.year+"年"+this.month+"月"+this.day+"日");
    }
}
