package 第2章编程作业;

/**
 * Author:  blithe.xwj
 * Date:    2021/4/22 22:31
 * Description:
 */


public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey){
        int j;
        for(j = 0 ; j <nElems ; j ++){
            if(a[j] == searchKey){
                break;
            }
        }
        if(j == nElems){
            return false;
        }else{
            return true;
        }
    }

    public void insert(long value){
        for(int i = 0 ; i < nElems ; i ++){
            if(value == a[i]){
                System.out.println("不好意思，该数组中已经存在该元素！");
                return;
            }
        }
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value){
        int j;
        for(j = 0 ; j < nElems ; j ++){
            if(value == a[j]){
                break;
            }
        }
        if(j == nElems){
            return false;
        }else{
            for( int k = j ; k <nElems ; k ++){
                a[k] = a[k+1];
            }
            nElems --;
            return true;
        }
    }

    public void dispaly(){
        for(int j = 0 ; j <nElems ; j ++){
            System.out.println(a[j] + " ");
        }
    }

    public long getMax(){
        long max = -1;
        if(a.length == 0){
            return max;
        }
        max = a[0]; // 这一步防止 数组中所有值都小于-1
        for(int i = 1 ; i < nElems ; i ++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public long removeMax() {
        long max = getMax();
        System.out.println(delete(max) ?"删除成功":"删除失败");
        return max;
    }

    public long[] getA() {
        return a;
    }

    public void setA(long[] a) {
        this.a = a;
    }

    public int getnElems() {
        return nElems;
    }

    public void setnElems(int nElems) {
        this.nElems = nElems;
    }
}
