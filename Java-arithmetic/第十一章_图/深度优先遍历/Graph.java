package 第十一章_图.深度优先遍历;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/8 21:01
 * Description:
 */


class Graph {
   private final int MAX_VERTS = 20;
   private Vertex vertexList[];
   private int adjMat[][];
   private int nVerts;
   private StackX theStack;

   public Graph(){
      vertexList = new Vertex[MAX_VERTS];
      adjMat = new int[MAX_VERTS][MAX_VERTS];
      nVerts = 0;
      for(int i = 0 ; i < MAX_VERTS ; i ++){
         for(int j = 0 ; j < MAX_VERTS ;j  ++){
            adjMat[i][j] = 0;
         }
      }
      theStack = new StackX(10);
   }

   public void addVertex(char lab){
      vertexList[nVerts ++] = new Vertex(lab);
   }

   public void addEdge(int start,int end){
      adjMat[start][end] = 1;
      adjMat[end][start] = 1;
   }

   public void displayVertex(int v){
      System.out.print(vertexList[v].label);
   }

   public void dfs(){
      vertexList[0].wasVisited = true;
      displayVertex(0);
      theStack.push(0);

      while(!theStack.isEmpty()){
         int v = getAdjUnvisitedVetex(theStack.peek());
         if(v == -1){
            theStack.pop();
         }else{
            vertexList[v].wasVisited = true;
            displayVertex(v);
            theStack.push(v);
         }
      }

      for(int j = 0 ;j < nVerts ;j ++){
         vertexList[j].wasVisited = false;
      }
   }

   private int getAdjUnvisitedVetex(int v) {
      for(int i = 0 ; i < nVerts ; i ++){
         if(adjMat[v][i] == 1 && vertexList[i].wasVisited == false){
            return i;
         }
      }
      return -1;
   }
}
