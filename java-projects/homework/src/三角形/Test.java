package 三角形;

/**
 * Author:  blithe.xwj
 * Date:    2021/4/7 23:11
 * Description:
 */


class Test {

    static int[] initArr = {1,2,3,4,5,6,7,8,9};
    static int ans = 0;

    public static void main(String[] args) {
        f(initArr,0);
        System.out.println(ans/6);
    }

    private static void f(int[] arr, int k) {
        if(k == arr.length){
            int a1 = arr[0]+arr[1]+arr[3]+arr[5];
            int a2 = arr[0]+arr[2]+arr[4]+arr[8];
            int a3 = arr[5]+arr[6]+arr[7]+arr[8];
            // 如果三条边的值都是相等的，则成立
            if(a1 == a2 && a1 == a3){
                ans++;
            }
        }

        for(int i = k ; i <  arr.length ; i++){
            int t = arr[k];
            arr[k] = arr[i];
            arr[i] = t;

            f(arr,k+1);

            t = arr[k];
            arr[k] = arr[i];
            arr[i] = t;
        }
    }

}
