package 第十一章_图.最小生成树_无权值;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/8 21:01
 * Description:
 */


class Vertex {
    public char label;
    public boolean wasVisited;

    public Vertex(char lab){
        label = lab;
        wasVisited = false;
    }
}
