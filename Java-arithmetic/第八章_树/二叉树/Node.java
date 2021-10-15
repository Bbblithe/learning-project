package 第八章_树.二叉树;

/**
 * Author:  blithe.xwj
 * Date:    2021/10/15 21:02
 * Description:
 */


class Node {
   public int iData;
   public double dData;
   public Node leftChild;
   public Node rightChild;

   public Node(int iData , double dData){
      this.iData = iData ;
      this.dData = dData ;
   }

   public void displayNode(){
      System.out.print('{');
      System.out.print(iData);
      System.out.print(", ");
      System.out.print(dData);
      System.out.print("} ");
   }
}
