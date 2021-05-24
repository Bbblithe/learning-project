package com.bjpowernode.javase.array;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/6 14:07
 * Description:
 *
 * 模拟一个系统，假设这个系统要使用，必须输入用户名和密码。
 */


class ArrayTest06 {
    //用户名和密码输入到String[] args数组当中。
    public static void main(String[] args){
        if(args.length!=2){
            System.out.println("使用该系统时请输入程序参数，参数中包括用户名和密码信息，例如：your_bestfather qishinijiushi2..");
            return ;
        }

        // 程序执行到此处说明用户确实提供了用户名和密码。
        // 接下来你应该判断用户名和密码是否正确。
        // 取出用户名
        String username=args[0];

        // 取出密码
        String password=args[1];

        // 假设密码是admin，密码是123456的时候表示登陆成功。其他一律失败。
        // 判断两个字符是否相等，需要使用equals方法。
        // 采用以下编码风格，即使 username和password都是null，也不会出现空指针异常。(这是老程序员给的一个编程经验)
        if("admin".equals(username)&&"123456".equals(password)){
            System.out.println("尊敬的"+args[0]+"，欢迎回来");
        }
        else{
            System.out.println("不好意思您的账号不存在，或您输入的密码有误！");
        }
    }
}
