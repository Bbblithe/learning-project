package xu.wen.jie.javase.danlink;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/30 22:46
 * Description:
 */


class Test {
    public static void main(String[] args) {
        // 创建了一个集合对象
        Link link = new Link();

        // 向集合中添加元素
        link.add("abc");
        link.add("edf");
        link.add("xyz");

        // 获取元素个数
        System.out.println(link.size());

    }
}
