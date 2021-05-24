/**
 * Author:  blithe.xwj
 * Date:    2020/12/11 07:39
 * Description:
 */


class ReplaceMax {
    public static void sortArray(int[] i,int value){
        int max=i[0];
        int index=0;
        for(int a=1;a<i.length;a++){
            if(max<i[a]){
                max=i[a];
                index=a;
            }
        }
        i[index]=value;
    }
    public static void main(String[] args){
        int[] array={1,23,2,35,436,34,6,34};
        ReplaceMax.sortArray(array,100000000);
        for(int a=0;a<array.length;a++){
            System.out.println(array[a]);
        }
    }
}
