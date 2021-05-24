package shilian;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 21:23
 * Description:
 */


class DateTest {
    public static void main(String[] args) {
        System.out.println("在这里输入你的年份：");
        java.util.Scanner shuruyear=new java.util.Scanner(System.in);
        System.out.println("在这里输入你的月份:");
        java.util.Scanner shurumonth=new java.util.Scanner(System.in);
        System.out.println("在这里输入你的日：");
        java.util.Scanner shuruday=new java.util.Scanner(System.in);

        Date xixi=new Date();
        xixi.setYear(shuruyear.nextInt());
        xixi.setMonth(shurumonth.nextInt());
        xixi.setDay(shuruday.nextInt());

        int a;
        if(xixi.getYear()%400==0||(xixi.getYear()%4==0&&xixi.getYear()%100!=0)){
                if(xixi.getMonth()<=7){
                    if(xixi.getMonth()%2==0){
                        if(xixi.getMonth()==2){
                            if(xixi.getDay()<0||xixi.getDay()>29){
                                a=0;
                            }
                            else{
                                a=1;
                            }
                        }
                        else{
                            if(xixi.getDay()<0||xixi.getDay()>30){
                                a=0;
                            }
                            else{
                                a=1;
                            }
                        }
                    }
                    else{
                        if(xixi.getDay()<0||xixi.getDay()>31){
                            a=0;
                        }
                        else{
                            a=1;
                        }
                    }
                }
                else{
                    if(xixi.getMonth()%2==0){
                        if(xixi.getDay()<0||xixi.getDay()>31){
                            a=0;
                        }
                        else{
                            a=1;
                        }
                    }
                    else{
                        if(xixi.getDay()<0||xixi.getDay()>30){
                            a=0;
                        }
                        else{
                            a=1;
                        }
                    }
                }
        }
        else{
            if(xixi.getMonth()<=7){
                if(xixi.getMonth()%2==0){
                    if(xixi.getMonth()==2){
                        if(xixi.getDay()<0||xixi.getDay()>29){
                            a=0;
                        }
                        else{
                            a=1;
                        }
                    }
                    else{
                        if(xixi.getDay()<0||xixi.getDay()>30){
                            a=0;
                        }
                        else{
                            a=1;
                        }
                    }
                }
                else{
                    if(xixi.getDay()<0||xixi.getDay()>31){
                        a=0;
                    }
                    else{
                        a=1;
                    }
                }
            }
            else{
                if(xixi.getMonth()%2==0){
                    if(xixi.getDay()<0||xixi.getDay()>31){
                        a=0;
                    }
                    else{
                        a=1;
                    }
                }
                else{
                    if(xixi.getDay()<0||xixi.getDay()>30){
                        a=0;
                    }
                    else{
                        a=1;
                    }
                }
            }
        }
        if((shuruyear.nextInt()<1970||shuruyear.nextInt()>2020)||(a==0)||(shurumonth.nextInt()<0||shurumonth.nextInt()>12)){
            System.out.println("不好意思您输入的数据有误,麻烦检查后再次输入");
        }
        else{
            System.out.println(xixi.getYear()+"年"+xixi.getMonth()+"月"+xixi.getDay()+"日");
        }
    }

}
