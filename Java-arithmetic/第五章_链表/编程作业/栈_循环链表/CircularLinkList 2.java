package 第五章_链表.编程作业.栈_循环链表;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/22 09:12
 * Description:
 */


class CircularLinkList {
    private Link first;

    public CircularLinkList(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(long dd){
        Link newLink = new Link(dd);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList()
    {
        Link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
