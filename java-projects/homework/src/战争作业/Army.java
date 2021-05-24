package 战争作业;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/26 14:13
 * Description:
 * 写一个类Army，代表一支军队，这个类有一个属性Weapon数组w（用来存储该军队所拥有的所有武器），
 * 该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量，
 * 并用这一大小来初始化数组w。
 *
 * 该类还提供一个方法addWeapon(Weapon wa),表示把参数wa所代表的武器加入到数组w中。
 * 在这个类中还定义两个方法attackAll() 让w数组中的所有武器攻击：
 * 以及moveAll()让w数组中的所有可移动的武器移动。
 *
 * 写一个主方法去测试以上程序。
 *
 * 提示：
 *      Weapon是一个父类。应该有很多子武器。
 *      这些子武器应该有一些是可移动的，有一些
 *      是可攻击的
 */


/**
 * 军队
 * 类在强制类型转换过程中，如果是类转换成接口类型。
 * 那么类和接口之间不需要存在继承关系，也可以转换，
 * java语法中允许。
 */
class Army {
    /**
     * 武器数组
     */
    private Weapon[] weapons = null;

    /**
     * 创建军队的构造方法。
     * @param count 武器数量
     */
    public Army(int count){
        // 动态初始化数组中每一个元素默认值是null。
        // 武器数组是有了，但是武器数组中没有放入武器
        weapons = new Weapon[count];
    }

    /**
     * 将武器加入数组
     * @param weapon
     */
    public void addWeapon(Weapon weapon) throws WeaponIndexOutOfBoundException{
        for(int i = 0;i< weapons.length;i++){
            if(null == weapons[i]){
                weapons[i] = weapon;
                System.out.println(weapon+"武器添加成功");
                return ;
            }
        }
        // 程序如果执行到此处，说明武器没有添加成功！
        throw new WeaponIndexOutOfBoundException("你的军队好像不能够容纳更多武器！");
    }


    /**
     * 所有可攻击的武器，攻击
     */
    public void attackAll(){
        // 遍历数组
        for(int i = 0;i<weapons.length;i++){
            if(weapons[i] instanceof Shootable){

                // 先向下转型，再调用子类的特有的方法。
                ((Shootable) weapons[i]).shoot();
            }
        }
    }

    /**
     * 所有可移动的武器，移动
     */
    public void moveAll(){
        for(int i = 0; i < weapons.length;i++){
            if(weapons[i] instanceof Moveable){
                // 调用子类特有的方法，向下转型。
                Moveable moveable = (Moveable) weapons[i];
                moveable.move();
            }
        }
    }
}
