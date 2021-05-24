/**
 * Author:  blithe.xwj
 * Date:    2020/12/11 10:25
 * Description:
 *  该冒泡算法是我自己想出来的。
 *  老师的在chapter19 Module里的BubbleSort里
 */


class BubbleSort {
    public static void main(String[] args) {
        int[] i={1,0,3,43,5,34,53,6,2,124,1,23,12,1,0};
        //这他吗就是冒泡排序！！！！
        for(int x=1;x<i.length;x++){
            for(int a=0;a<i.length-x;a++){
                if(i[a]>i[a+1]){
                    int j= i[a];
                    i[a]=i[a+1];
                    i[a+1]=j;
                }
            }
        }
        for(int a=0;a<i.length;a++){
            System.out.println(i[a]);
        }
    }
}
