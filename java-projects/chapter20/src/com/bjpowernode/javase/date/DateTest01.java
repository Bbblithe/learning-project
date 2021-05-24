package com.bjpowernode.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/20 20:05
 * Description:
 * java中对日前的处理
 *      这个案例最主要掌握：
 *          知识点1：怎么获取系统当前时间
 *          知识点2：String-->Date
 *          知识点3：Date-->String
 */


class DateTest01 {
    public static void main(String[] args) throws Exception{

        // 获取系统当前时间(精确到毫秒的系统当前时间)
        // 直接调用无参数构造方法就行。
        Date nowTime = new Date();

        // java.util.Date类的toString()方法已经被重写了。
        // 输出的应该不是一个对象的内存地址，应该是一个日期字符串。
        System.out.println(nowTime.toString()); //Sun Dec 20 20:07:13 CST 2020

        // 日期可以格式化吗？
        // 将日期类型Date，按照指定的格式进行转换：Date -- 转换具有一定格式的日期字符串-->String
        // SimpleDateFormat是java.text包下的。专门负责日期格式化的。
        /*
        yyyy 年（年是4位）
        MM 月（月是2位）
        dd 日（日是2位）
        HH 时（时是2位）
        mm 分
        ss 秒
        SSS 毫秒（月是3位，最高999。1000毫秒代表1秒）
        注意：在日期格式中，除了y M d H m s S 这些字符不能随便写之外，剩下的符号格式自己随便组织。
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);

        // 假设现在有一日期字符串String，怎么转换成Date类型？
        // String --> Date
        String time = "2003/4/15 08/35/15";
        //simpleDateFormat sdf2 = new SimpleDateFormat("格式不能随便写，要和日期字符串格式相同");
        // 注意：字符串的日期格式和SimpleDateFormat对象指定的日期格式要一致。不然就出现异常：java.text.ParseException
        SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy/MM/dd HH/mm/ss");
        Date dateTime = sdf2.parse(time);
        System.out.println(dateTime); //Tue Apr 15 08:35:15 CST 2003
    }
}
