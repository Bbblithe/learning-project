package 第十一章_图.拓扑排序;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/9 15:18
 * Description:
 */


class TopoApp {
   public static void main(String[] args) {
      Graph graph = new Graph();

      graph.addVertex('a');
      graph.addVertex('b');
      graph.addVertex('c');
      graph.addVertex('d');
      graph.addVertex('e');
      graph.addVertex('f');
      graph.addVertex('g');
      graph.addVertex('h');

      graph.addEdge(0,3);;
      graph.addEdge(0,4);
      graph.addEdge(1,4);
      graph.addEdge(2,5);
      graph.addEdge(3,6);
      graph.addEdge(4,6);
      graph.addEdge(5,7);
      graph.addEdge(6,7);

      graph.topo();
   }
}
