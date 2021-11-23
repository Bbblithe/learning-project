package 第八章_树.树234;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/18 20:33
 * Description:
 */


class Tree234 {
   private Node root = new Node();

   public int find(long key){
      Node curNode = root;
      int childNumber;
      while(true){
         if((childNumber = curNode.findItem(key)) != -1){
            return childNumber;
         }else if(curNode.isLeaf()){
            return -1;
         }else{
            curNode = getNextChild(curNode,key);
         }
      }
   }

   public void insert(long dValue){
      Node curNode = root;
      DataItem tempItem = new DataItem(dValue);

      while(true){
         if(curNode.isFull()){
            split(curNode);
            curNode = curNode .getParent();
            curNode = getNextChild(curNode,dValue);
         }else if(curNode.isLeaf()){
            break;
         }else{
            curNode = getNextChild(curNode,dValue);
         }
      }
      curNode.insertItem(tempItem);
   }

   public void split(Node thisNode){
      DataItem itemB,itemC;
      Node parent,child2,child3;
      int itemIndex;

      itemC = thisNode.removeItem();
      itemB = thisNode.removeItem();
      child2 = thisNode.disconnectionChild(2);
      child3 = thisNode.disconnectionChild(3);
      Node newRight = new Node();

      if(thisNode == root){
         root = new Node();
         parent = root;
         root.connectChild(0,thisNode);
      }else{
         parent = thisNode.getParent();
      }

      itemIndex = parent.insertItem(itemB);
      int n = parent.getNumItems();

      for(int j = n - 1 ;j > itemIndex ; j--){
         Node temp = parent.disconnectionChild(j);
         parent.connectChild(j+1 , temp);
      }

      parent.connectChild(itemIndex + 1 ,newRight);
      newRight.insertItem(itemC);
      newRight.connectChild(0,child2);
      newRight.connectChild(1,child3);
   }

   public Node getNextChild(Node theNode , long theValue){
      int j;
      int numItems = theNode.getNumItems();
      for(j = 0 ; j < numItems; j ++){
         if( theValue < theNode.getItem(j).dData){
            return theNode.getChild(j);
         }
      }
      return  theNode.getChild(j);
   }

   public void displayTree(){
      recDisplayTree(root,0,0);
   }

   private void recDisplayTree(Node thisNode , int level, int childNumber){
      System.out.print("level=" + level + " child=" + childNumber + " ");
      thisNode.displayNode();

      int numItems= thisNode.getNumItems();
      for(int j = 0 ;j < numItems + 1 ; j ++){
         Node nextNode = thisNode.getChild(j);
         if(nextNode != null){
            recDisplayTree(nextNode,level + 1,j );
         }else{
            return ;
         }

      }
   }
}
