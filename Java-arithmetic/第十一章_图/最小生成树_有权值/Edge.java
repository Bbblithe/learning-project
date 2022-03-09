package 第十一章_图.最小生成树_有权值;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/9 15:43
 * Description:
 */


class Edge {
   public int srcVert;
   public int destVert;
   public int distance;

   public Edge(int sv,int dv,int d){
      srcVert = sv;
      destVert = dv;
      distance = d;
   }
}
