package com.bjpowernode.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/21 08:20
 * Description:
 */


class DateTest04 {
    public static void main(String[] args) {
        // 这个时间是什么时间？
        // 1970-01-01 00:00:00 001
        Date time =new Date(1);// 注意：参数是一个一毫秒

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        // 北京是东8区，差8个小时。
        System.out.println(sdf.format(time));//1970-01-01 08:00:00 001

        // 获取昨天的此时的时间。
        Date time2 = new Date(System.currentTimeMillis()-1000*60*60*24);
        System.out.println(sdf.format(time2));//2020-12-20 08:28:01 276 //昨天的

        // 获取"去年的今天"的时间
        Date time3 = new Date(System.currentTimeMillis()- 1000L *60*60*24*365);
        System.out.println(sdf.format(time3));
    }
}
