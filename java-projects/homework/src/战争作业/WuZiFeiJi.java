package 战争作业;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/26 17:02
 * Description:
 */

/**
 * 物资运输飞机，是武器，但是只能移动，不能攻击
 */
class WuZiFeiJi extends Weapon implements Moveable{
    @Override
    public void move() {
        System.out.println("运输机起飞");
    }

    @Override
    public String toString() {
        return "运输机";
    }
}
