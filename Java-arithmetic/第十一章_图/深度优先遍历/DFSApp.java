package 第十一章_图.深度优先遍历;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/8 21:11
 * Description:
 */


class DFSApp {
   public static void main(String[] args) {
      Graph theGraph = new Graph();
      theGraph.addVertex('A');
      theGraph.addVertex('B');
      theGraph.addVertex('C');
      theGraph.addVertex('D');
      theGraph.addVertex('E');

      theGraph.addEdge(0,1);
      theGraph.addEdge(1,2);
      theGraph.addEdge(0,3);
      theGraph.addEdge(3,4);

      System.out.print("Visits: ");
      theGraph.dfs();
      System.out.println();
   }
}
