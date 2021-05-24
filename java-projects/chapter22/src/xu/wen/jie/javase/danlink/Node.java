package xu.wen.jie.javase.danlink;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/30 22:06
 * Description:
 * 单链表中的节点。
 * 节点是单项链表中基本的元素。
 * 每一个节点Node都有两个属性：
 *      一个属性：是存储的数据。
 *      另一个属性：是下一个节点的内存地址。
 */


class Node {

    // 存储的数据
    Object element;

    // 下一节点的内存地址
    Node next;

    public Node(){

    }

    public Node(Object element,Node next){
        this.element = element;
        this.next = next;
    }
}
