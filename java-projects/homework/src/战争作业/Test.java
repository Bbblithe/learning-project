package 战争作业;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/26 19:07
 * Description:
 */


class Test {
    public static void main(String[] args) {
        // 构建一个军队
        Army army = new Army(4); // 军队容量只有4个
        // 创建武器对象
        try{
            army.addWeapon(new Tank());
            army.addWeapon(new GaoShePao());
            army.addWeapon(new WuZiFeiJi());
            army.addWeapon(new Fighter());
            army.addWeapon(new Tank());
        }catch(WeaponIndexOutOfBoundException e){
            e.printStackTrace();
        }

        // 让所有可移动的移动
        army.moveAll();

        // 让所有可攻击的攻击
        army.attackAll();

    }
}
