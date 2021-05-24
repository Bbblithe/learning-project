package 战争作业;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/26 16:59
 * Description:
 */

/**
 * 战斗机，是武器，可移动，可攻击
 */
class Fighter extends Weapon implements Shootable,Moveable{
    @Override
    public void move() {
        System.out.println("战斗机起飞");
    }

    @Override
    public void shoot() {
        System.out.println("战斗机开炮");
    }

    @Override
    public String toString() {
        return "战斗机";
    }
}
