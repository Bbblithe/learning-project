package shilian;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/14 18:48
 * Description:
 */


class Time {
    private double time;
    public void setTime(double time){
        if(time>24.00||time<0.00 ){
            System.out.println("不好意思，您输入的时间有误");
        }
        else{
            this.time=time;
        }
    }
    public String getTime(){
        if(time>6&&time<12){
            return "早上";
        }
        else if(time>=12&&time<=13){
            return "中午";
        }
        else if(time>13&&time<=17){
            return "下午";
        }
        else{
            return "晚上";
        }
    }
}
