package 第十一章_图.深度优先遍历;

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
