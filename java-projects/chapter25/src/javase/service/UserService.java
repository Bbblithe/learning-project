package javase.service;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/15 15:07
 * Description:
 * 用户业务类
 */


public class UserService {

    /**
     * 登陆方法
     * @param name 用户名
     * @param password 密码
     * @return true表示登陆成功，false表示登陆失败！
     */
    public boolean login(String name,String password){
        if("admin".equals(name) && "123".equals(password)) {
            return true;
        }
        return false;
    }

    // 可能还有一个同名login方法
    // java中怎么区分一个方法，依靠方法名和参数列表。
    public void login(int i){

    }

    /**
     * 退出系统方法
     */
    public void logout(){
        System.out.println("系统已经安全退出");
    }
}
