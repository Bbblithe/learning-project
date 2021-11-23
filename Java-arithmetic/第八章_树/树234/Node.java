package 第八章_树.树234;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/15 12:22
 * Description:
 */


public class Node {
    private static final int ORDER = 4;
    private int numItems;
    private Node parent;
    private Node childArray[] = new Node[ORDER];
    private DataItem itemArray[] = new DataItem[ORDER - 1];

    public void connectChild(int childNum,Node child){
        childArray[childNum] = child;
        if(child != null){
            child.parent = this;
        }
    }


    public Node disconnectionChild(int childNum){
        Node tempNode = childArray[childNum];
        childArray[childNum] = null;
        return tempNode;
    }

    public Node getChild(int childNum){
        return childArray[childNum];
    }

    public Node getParent(){
        return parent;
    }

    public boolean isLeaf(){
        return (childArray[0] == null) ? true : false;
    }

    public int getNumItems(){
        return numItems;
    }

    public DataItem getItem(int index){
        return itemArray[index];
    }

    public boolean isFull(){
        return(numItems == ORDER - 1) ? true : false;
    }

    public int findItem(long key){
        for(int j = 0 ; j <ORDER - 1 ; j++){
            if(itemArray[j] == null){
                break;
            }else if(itemArray[j].dData == key){
                return j;
            }
        }
        return -1;
    }

    public int insertItem(DataItem newItem){
        numItems ++;
        long newKey = newItem.dData;

        for(int j = ORDER - 2 ; j >= 0 ; j--){
            if(itemArray[j] == null){
                continue;
            }else{
                long itsKey = itemArray[j].dData;
                if(newKey < itsKey){
                    itemArray[j + 1] = itemArray[j];
                }else{
                    itemArray[j + 1] = newItem;
                    return j + 1;
                }
            }
        }
        itemArray[0] = newItem;
        return 0;
    }

    public DataItem removeItem(){
        DataItem temp = itemArray[numItems - 1];
        itemArray[numItems - 1] = null;
        numItems -- ;
        return temp;
    }

    public void displayNode(){
        for(int i = 0 ; i < numItems ; i ++){
            itemArray[i].displayItem();
        }
        System.out.println("/");
    }
}
