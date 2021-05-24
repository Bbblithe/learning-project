package 访问控制权限3;

import 访问控制权限.User;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/4 22:00
 * Description:
 */

//  User在访问控制权限包下
//  Vip在访问控制权限3包下
//  User和Vip不在同一个包下。
//  但是Vip是User的子类。

public class Vip extends User {

    //实例方法
    public void shopping(){
        //this 表示当前对象

        //默认不行
        //System.out.println(this.name);

        //protected可以
        System.out.println(this.age);
    }
}
