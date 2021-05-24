package 战争作业;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/26 16:29
 * Description:
 */

/**
 * 坦克是一个武器，可移动，可攻击l
 */
public class Tank extends Weapon implements Moveable,Shootable{
    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开炮");
    }

    @Override
    public String toString() {
        return "坦克";
    }
}
