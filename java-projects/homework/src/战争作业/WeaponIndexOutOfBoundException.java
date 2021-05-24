package 战争作业;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/26 18:51
 * Description:
 * 添加武器异常
 */


class WeaponIndexOutOfBoundException extends Exception{
    public WeaponIndexOutOfBoundException(){

    }

    public WeaponIndexOutOfBoundException(String s){
        super(s);
    }
}
