package shilian;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 21:12
 * Description:
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
        this.year=1970;
        this.month=1;
        this.day=1;
    }

    //setter and getter方法
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<0||year>2020){
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
        if(year%400==0||(year%4==0&&year%100!=0)){
            if(month<=7){
                if(month%2==0){
                    if(month==2){
                        if(day<0||day>29){
                            System.out.println("不好意思，闰年的二月只有29天，您输入的日期有误");
                        }
                        else{
                            this.day=day;
                        }
                    }
                    else{
                        if(day<0||day>30){
                            System.out.println("不好意思，闰年的"+month+"月只有30天，您输入的日期有误");
                            
                        }
                        else{
                            this.day=day;
                        }
                    }
                }
                else{
                    if(day<0||day>31){
                        System.out.println("不好意思，闰年的"+month+"月只有31天，您输入的日期有误");
                        
                    }
                    else{
                        this.day=day;
                    }
                }
            }
            else{
                if(month%2==0){
                    if(day<0||day>31){
                        System.out.println("不好意思，闰年的"+month+"月只有31天，您输入的日期有误");
                        
                    }
                    else{
                        this.day=day;
                    }
                }
                else{
                    if(day<0||day>30){
                        System.out.println("不好意思，闰年的"+month+"月只有30天，您输入的日期有误");
                        
                    }
                    else{
                        this.day=day;
                    }
                }
            }
        }
        else{
            if(month<=7){
                if(month%2==0){
                    if(month==2){
                        if(day<0||day>29){
                            System.out.println("不好意思，平年的二月只有28天，您输入的日期有误");
                            
                        }
                        else{
                            this.day=day;
                        }
                    }
                    else{
                        if(day<0||day>30){
                            System.out.println("不好意思，平年的"+month+"月只有30天，您输入的日期有误");
                            
                        }
                        else{
                            this.day=day;
                        }
                    }
                }
                else{
                    if(day<0||day>31){
                        System.out.println("不好意思，平年的"+month+"月只有31天，您输入的日期有误");
                        
                    }
                    else{
                        this.day=day;
                    }
                }
            }
            else{
                if(month%2==0){
                    if(day<0||day>31){
                        System.out.println("不好意思，平年的"+month+"月只有31天，您输入的日期有误");
                        
                    }
                    else{
                        this.day=day;
                    }
                }
                else{
                    if(day<0||day>30){
                        System.out.println("不好意思，平年的"+month+"月只有30天，您输入的日期有误");
                        
                    }
                    else{
                        this.day=day;
                    }
                }
            }
        }
    }

    //对外提供一个方法可以将日期打印输出到控制台
    //实例方法
    public void print(){
        System.out.println(this.year+"年"+this.month+"月"+this.day+"日");
    }

}
