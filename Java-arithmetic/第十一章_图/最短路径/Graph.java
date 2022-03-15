package 第十一章_图.最短路径;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/14 21:25
 * Description:
 */


class Graph {
    private final int MAX_VERTS = 20;
    private final int INFINITY= 1000000;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private int nTree;
    private DistPar sPath[];
    private int currentVert;
    private int startToCurrent;

    public Graph() {
        vertexList =new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        nTree = 0;
        for(int i = 0 ; i < MAX_VERTS ; i ++){
            for(int j = 0 ; j < MAX_VERTS ; j ++){
                adjMat[i][j] = INFINITY;
            }
        }
        sPath = new DistPar[MAX_VERTS];
    }

    public void addVertex(char lab){
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start , int end , int weight){
        adjMat[start][end] = weight;
    }

    public void path(){
        int startTree = 0 ;
        vertexList[startTree].isInTree = true;
        nTree = 1;
        for(int j = 0 ; j < nVerts ; j ++){
            int tempDist = adjMat[startTree][j];
            sPath[j] = new DistPar(startTree,tempDist);
        }
        while(nTree < nVerts) {
            int indexMin = getMin();
            int minDist = sPath[indexMin].distance;

            if(minDist == INFINITY){
                System.out.println("There are unreachable vertices");
                break;
            }else{
                currentVert = indexMin;
                startToCurrent = sPath[indexMin].distance;
            }
            vertexList[currentVert].isInTree = true;
            nTree++;
            adjust_sPath();
        }

        displayPath();

        nTree = 0;
        for(int i = 0 ; i < nVerts ; i ++){
            vertexList[i].isInTree = false;
        }
    }

    private void adjust_sPath() {
        int column = 1;
        while(column < nVerts){
            if(vertexList[column].isInTree){
                column ++;
                continue;
            }

            int currentToFringe = adjMat[currentVert][column];
            int startToFringe = startToCurrent + currentToFringe;

            int sPathDist = sPath[column].distance;

            if(startToFringe < sPathDist){
                sPath[column].parentVertex = currentVert;
                sPath[column].distance = startToFringe;
            }
            column ++;
        }
    }

    public void displayPath(){
        for(int i = 0 ; i < nVerts ; i ++){
            System.out.print(vertexList[i].label + "=");
            if(sPath[i].distance == INFINITY){
                System.out.print("inf");
            }else{
                System.out.print(sPath[i].distance);
            }
            char parent = vertexList[sPath[i].parentVertex].label;
            System.out.print("(" + parent + ")");
        }
        System.out.println("");
    }

    private int getMin() {
        int minDist =  INFINITY;
        int indexMin = 0 ;
        for(int j = 1 ; j < nVerts ; j ++){
            if(! vertexList[j].isInTree && sPath[j].distance < minDist){
                minDist = sPath[j].distance;
                indexMin = j;
            }
        }
        return indexMin;
    }
}
