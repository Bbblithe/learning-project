package 第八章_树.编程作业;

/**
 * Author:  blithe.xwj
 * Date:    2021/10/15 21:02
 * Description:
 */


class Node {
   public char cData;
   public Node leftChild;
   public Node rightChild;

   public Node(char cData ){
      this.cData = cData ;
   }

   public void displayNode(){
      System.out.print('{');
      System.out.print(cData);
      System.out.print("} ");
   }
}
