package xu.wen.jie.javase.homework;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/26 10:08
 * Description:
 * 编写程序模拟用户注册：
 * 1、程序开始执行时，提示用户输入"用户名"和"密码"信息。
 * 2、输入信息之后，后台java程序模拟用户注册。
 * 3、注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。
 *
 * 注意：
 *     完成注册的方法放到一个单独的类中。
 *     异常类自定义即可。
 */


class Test {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        UserService bt = new UserService();
        try{
            System.out.print("请输入您的用户名并以enter结束，再次输入你的密码：");
            bt.register(s.nextLine(),s.nextLine());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
