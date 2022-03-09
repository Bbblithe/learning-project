package 第十一章_图.最小生成树_有权值;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/9 15:51
 * Description:
 */


class Graph {
   private final int MAX_VERTS = 20;
   private final int INFINITY = 1000000;
   private Vertex vertexList[];
   private int adjMat[][];
   private int nVerts;
   private int currentVert;
   private PriorityQ thePQ;
   private int nTree;

   public Graph(){
      vertexList = new Vertex[MAX_VERTS];
      adjMat =  new int[MAX_VERTS][MAX_VERTS];
      nVerts = 0;
      for(int i = 0 ; i < MAX_VERTS ; i ++){
         for(int j = 0 ; j < MAX_VERTS ; j ++){
            adjMat[i][j] = INFINITY;
         }
      }
      thePQ = new PriorityQ();
   }

   public void addVertex(char lab){
      vertexList[nVerts ++] = new Vertex(lab);
   }

   public void addEdge(int start,int end, int weight){
      adjMat[start][end] = weight;
      adjMat[end][start] = weight;
   }

   public void displayVertex(int v){
      System.out.print(vertexList[v].label);
   }

   public void mstw(){
      currentVert = 0 ;

      while(nTree < nVerts -1){
         vertexList[currentVert].isInTree = true;
         nTree ++;

         for(int i = 0 ; i < nVerts ; i ++){
            if(i == currentVert){
               continue;
            }
            if(vertexList[i].isInTree){
               continue;
            }
            int distance = adjMat[currentVert][i];
            if(distance == INFINITY){
               continue;
            }
            putInPQ(i,distance);
         }
         if(thePQ.isEmpty()){
            System.out.println("GRAPH NOT CONNECTED");
            return;
         }
         Edge theEdge = thePQ.removeMin();
         int sourceVert = theEdge.srcVert;
         currentVert = theEdge.destVert;

         System.out.print(vertexList[sourceVert].label);
         System.out.print(vertexList[currentVert].label);
         System.out.print(" ");
      }
      for(int i = 0 ; i < nVerts ; i ++){
         vertexList[i].isInTree = false;
      }
   }


   public void putInPQ(int newVert,int newDist){
      int queueIndex = thePQ.find(newVert);
      if(queueIndex != -1){
         Edge tempEdge = thePQ.peekN(queueIndex);
         int oldDist = tempEdge.distance;
         if(oldDist > newDist){
            thePQ.removeN(queueIndex);
            Edge theEdge = new Edge(currentVert ,newVert,newDist);
            thePQ.insert(theEdge);
         }
      }else{
         Edge theEdge = new Edge(currentVert,newVert , newDist);
         thePQ.insert(theEdge);
      }
   }
}
