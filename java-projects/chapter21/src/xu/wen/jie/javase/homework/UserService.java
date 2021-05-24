package xu.wen.jie.javase.homework;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/26 09:53
 * Description:
 * 用户业务类，处理用户相关的业务：例如登陆，注册等功能。
 */


class UserService {
    /**
     * 用户注册
     * @param username 用户名
     * @param password  密码
     * @throws IllegalArgumentException 当用户名为null，或者用户名长度小于6，或者长度大于14，会出现该异常！
     */
    public void register(String username,String password) throws IllegalArgumentException {
        /*
        引用等于null的这个判断最好放在所有条件的最前面。
         */

        /*
        再分享一个经验：username == null 不如写成 null == username
        这个经验的主要目的是防止自己少写一个=号，导致将null赋给了username

        "abc".equals(username) 比 username.equals("abc") 好。
         */
        if(null == username || username.length()>=6&&username.length()<=14){
            char[] un = username.toCharArray();
        }else{
            throw new IllegalArgumentException("您输入用户名的长度不合法！");
        }
        if(password == null || password.length()>=8 && password.length()<=16){
            char[] pw = password.toCharArray();
            int index = 0;
            for(int i = 0 ;i<pw.length;i++){
                /*for(int a = 65;a<=90;a++){
                    if(pw[i] == (char)a){
                        index++;
                    }
                }
                这里是我的写法，我哥直接只用一次遍历
                 */
                // 这样同样能够实现判断大小写字母
                if(pw[i]>=65&&pw[i]<=90){
                    index++;
                }
            }
            if(index == 0){
                throw new IllegalArgumentException("密码中至少需要存在一个大写字母！");
            }else if(index == pw.length){
                throw new IllegalArgumentException("密码中至少需要存在一个小写字母！");
            }
            System.out.println("欢迎用户["+username+"]");
        }
        else{
            throw new IllegalArgumentException("您输入的密码长度不合法！");
        }
    }
}
