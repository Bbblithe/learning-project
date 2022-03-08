package 第十章_堆.编程作业.升序堆;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/6 16:04
 * Description:
 */


public class Node {
    private int iData;
    public Node(int key){
        iData = key;
    }

    public int getKey(){
        return iData;
    }

    public void setKey(int id){
        iData = id;
    }
}
