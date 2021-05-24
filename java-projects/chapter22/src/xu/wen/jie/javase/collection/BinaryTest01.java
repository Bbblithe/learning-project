package xu.wen.jie.javase.collection;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/30 19:59
 * Description:
 * 位运算符 >>
 * 这个代表将一个十进制数字转换成二进制数再往后移1位
 */


class BinaryTest01 {
    public static void main(String[] args){

        // 5
        // >> 1 二进制右移一位。
        // >> 2 二进制右移两位。
        // 10的二进制位就是00001010 【10】
        // 10的二进制右移1位是：00000101 【5】
        System.out.println(10 >> 1);// 右移1位就是除以2

        // 二进制位左移1位
        // 10的二进制位就是00001010 【10】
        // 10的二进制位左移1位：00010100 【20】
        System.out.println(10 << 1);
    }
}
