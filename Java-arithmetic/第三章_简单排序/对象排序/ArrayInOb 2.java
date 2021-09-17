package 第三章_简单排序.对象排序;

/**
 * Author:  blithe.xwj
 * Date:    2021/4/30 22:30
 * Description:
 */


public class ArrayInOb {
    private Person[] a;
    private int nElems;

    public ArrayInOb(int max){
        a = new Person[max];
        nElems = 0;
    }

    public void insert(String last,String first, int age){
        a[nElems] = new Person(last,first,age);
        nElems++;
    }

    public void display(){
        for(int j = 0 ; j <nElems ; j++){
            a[j].displayPerson();
        }
    }

    public void insertionSort(){
        int in,out;

        for(out = 1; out < nElems ; out++){
            Person temp = a[out];
            in = out;
            while(in > 0 && a[in - 1].getLast().compareTo(temp.getLast()) > 0){
                a[in] = a[in - 1];
                -- in;
            }
            a[in] = temp;
        }
    }
}
