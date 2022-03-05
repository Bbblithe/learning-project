package 第九章_哈希表.哈希链表;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/3 11:02
 * Description:
 */


public class Link {
    private int iData;
    public Link next;

    public Link(int it){
        iData = it;
    }

    public int getKey(){
        return iData;
    }

    public void displayLink(){
        System.out.print(iData + " ");
    }
}
