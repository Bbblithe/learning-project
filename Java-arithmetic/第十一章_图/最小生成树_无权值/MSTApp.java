package 第十一章_图.最小生成树_无权值;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/9 15:01
 * Description:
 */


class MSTApp {
    public static void main(String[] args){
        Graph theGraph = new Graph();
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');

        theGraph.addEdge(0,1);
        theGraph.addEdge(0,2);
        theGraph.addEdge(0,3);
        theGraph.addEdge(0,3);
        theGraph.addEdge(0,4);
        theGraph.addEdge(1,2);
        theGraph.addEdge(1,3);
        theGraph.addEdge(1,4);
        theGraph.addEdge(2,3);
        theGraph.addEdge(2,4);
        theGraph.addEdge(3,4);

        System.out.print("Minimum spanning three: ");
        theGraph.mst();
        System.out.println("");
    }
}
