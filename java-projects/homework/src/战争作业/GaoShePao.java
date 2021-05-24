package 战争作业;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/26 16:40
 * Description:
 * 高射炮，是武器，但是不能移动，只能射击
 */


class GaoShePao extends Weapon implements Shootable{

    @Override
    public void shoot() {
        System.out.println("高射炮开火");
    }

    @Override
    public String toString() {
        return "高射炮";
    }
}
