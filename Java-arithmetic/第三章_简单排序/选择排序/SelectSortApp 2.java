package 第三章_简单排序.选择排序;

import java.util.Date;

/**
 * Author:  blithe.xwj
 * Date:    2021/5/6 22:36
 * Description:
 */


class SelectSortApp {
    public static void main(String[] args) {
        int maxSize = 100001;
        ArraySel arr;
        arr = new ArraySel(maxSize);

//        arr.insert(77);
//        arr.insert(99);
//        arr.insert(44);
//        arr.insert(55);
//        arr.insert(22);
//        arr.insert(88);
//        arr.insert(11);
//        arr.insert(00);
//        arr.insert(66);
//        arr.insert(33);

        for(int i = 0 ; i < maxSize ; i ++){
            arr.insert((int)(Math.random()*10000));
        }

//        arr.display();
        Date start = new Date();
        arr.selectionSort();
        Date end = new Date();

//        arr.display();

        System.out.println("消耗时间:" + (end.getTime() - start.getTime()));
    }
}
