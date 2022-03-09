package 第十一章_图.最小生成树_有权值;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/9 15:51
 * Description:
 */


class Vertex {
   public char label;
   public boolean isInTree;

   public Vertex(char lab){
      label = lab;
      isInTree = false;
   }
}
