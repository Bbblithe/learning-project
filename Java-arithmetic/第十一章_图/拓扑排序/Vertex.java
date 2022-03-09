package 第十一章_图.拓扑排序;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/9 15:05
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
