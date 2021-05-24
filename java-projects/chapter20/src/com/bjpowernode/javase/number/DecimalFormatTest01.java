package com.bjpowernode.javase.number;

import java.text.DecimalFormat;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/21 08:34
 * Description:
 * 关于数字的格式化。
 */


class DecimalFormatTest01 {
    public static void main(String[] args) {
        // java.text.DecimalFormat专门负责数字格式化的。
        //DecimalFormat df = new DecimalFormat("数字格式");

        /*
        数字格式有哪些？
            # 代表任意数字
            , 代表千分位
            . 代表小数点
            0 代表不够时补0

            ###,###.##
                表示：加入千分位，保留2个小数。
         */
        DecimalFormat df = new DecimalFormat("###,###.##");
        //String s = df.format(13123.56);
        String s = df.format(123123.1);
        System.out.println(s); // "12,3123.1"

        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        String s1 = df2.format(1234.56);
        System.out.println(s1);
    }
}
