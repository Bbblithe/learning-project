/**
 * Author:  blithe.xwj
 * Date:    2020/12/11 13:19
 * Description:
 *  这是我的方法，老师标准答案在chapter19 module里。
 */


class SelectSort {
    public static void main(String[] args) {
        int[] arr ={3,1,6,2,5,1};

        for(int i =0;i<arr.length-1;i++) {

            for(int j=i+1;j<arr.length;j++){
                int min=arr[i];
                int index=i;
                if(arr[j]<min){
                    min=arr[j];
                    index =j;
                }
                arr[index]=arr[i];
                arr[i]=min;
            }
        }

    }
}
