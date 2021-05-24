package test010;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 21:23
 * Description:
 */


class DateTest {
    public static void main(String[] args) {
        //创建日期对象1
        Date time1=new Date();
        time1.print();

        //创建日期对象2
        Date time2=new Date(2020,12,31);
        time2.print();

    }
}
