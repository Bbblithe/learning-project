package 第2章编程作业;

/**
 * Author:  blithe.xwj
 * Date:    2021/4/23 22:43
 * Description:
 */


public class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElems;
            } else {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void insert(long value) {
        int left = 0;
        int right = nElems - 1;
        int insertPosition = -1;

        while (left <= right) {
            //找到中间数
            final int mid = (left + right) >>> 1;
            final long midValue = a[mid];
            if (midValue < value) {
                left = mid + 1;
            } else if (midValue > value) {
                right = mid - 1;
            } else {
                insertPosition = mid;
                break;
            }
        }

        if (insertPosition != -1) {
            //找到了相同的位置
            int i;
            for (i = nElems; i > insertPosition + 1; i--) {
                a[i] = a[i - 1];
            }
            a[i] = value;
            nElems++;
        } else if (right < 0) { //始终比插入的值大
            int i;
            for (i = nElems; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[i] = value;
            nElems++;
        } else if (left > nElems - 1) {//始终比插入的值小
            a[nElems] = value;
            nElems++;
        } else if (right < nElems - 1) {
            //中间的某个位置, a[left]  = value
            int i;
            for (i = nElems; i > left; i--) {
                a[i] = a[i - 1];
            }
            a[i] = value;
            nElems++;
        }
    }

    public void insert(long value, boolean normal) {
        int i, k;
        for (i = 0; i < nElems; i++) {
            // 遍历比较
            if (value <= a[i]) { // 遍历找到整个有序数组中第一个比插入值大的元素的下标就是此时的i
                for (k = nElems; k > i; k--) {
                    a[k] = a[k - 1];
                }
                a[k] = value;
                nElems++;
                return;
            }
        }
        // 如果程序执行到这里说明数组中每一元素都比这元素小
        a[nElems] = value;
        nElems++;
    }


    public boolean delete(long value) {
        int flag = find(value);
        if (flag == nElems) {
            return false;
        } else {
            nElems--;
            for (int i = flag; i < nElems; i++) {
                a[i] = a[i + 1];
            }
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.println(a[j]);
        }
    }

    public void merge() {

    }
}
