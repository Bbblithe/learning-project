package 第十一章_图.最短路径;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/14 21:23
 * Description:
 */


class DistPar {
   public int distance;
   public int parentVertex;

   public DistPar(int pv,int d){
      distance = d;
      parentVertex = pv;
   }
}
