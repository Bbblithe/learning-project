#include <iostream>
#include <iomanip>
#include <time.h>
using namespace std;
#define nElems 500
int a[500] = {0};

void swap(int x , int y){
    int temp = a[x];
    a[x] = a[y];
    a[y] = temp;
}

void bubleSort(){
    int out,in;
    for(out = nElems - 1 ; out > 1 ; out --){
        for(in = 0 ; in < out ; in ++) {
            if (a[in] > a[in + 1]) {
               swap(in, in + 1);
            }
        }
    }
}

void shellSort(){
    int inner, outer;
        int temp;

        int h = 1;
        while(h <= nElems/3){
            h = h*3 + 1;
        }

        while(h > 0){
            for(outer = h ; outer < nElems ; outer ++){
                temp = a[outer];
                inner = outer;
                while(inner > h-1 && a[inner - h] >= temp){
                a[inner] = a[inner - h];
                inner -= h;
            }
            a[inner] = temp;
        }
        h = (h-1)/3;
    }
}

void insertSort(){
    int in,out;
        for(out = 1 ; out < nElems ; out ++){
            long temp = a[out];// 复制
            in = out;
            while(in > 0 && a[in - 1] >= temp){
            a[in] = a[in - 1];
            in--;
        }
        a[in] = temp;
    }
}

int partitionIt(int left , int right , int pivot){
    int leftPtr = left;
        int rightPtr = right - 1 ;

        while(true){
            while(a[++leftPtr] < pivot){
            }

            while(a[--rightPtr] > pivot){
            }

            if(leftPtr >= rightPtr){
                break;
            }else{
                swap(leftPtr , rightPtr);
            }
        }
        swap(leftPtr , right -1);
        return leftPtr;
}

int medianOf3(int left , int right){
    int center = (left + right) / 2;
        if(a[left] > a[center]){
            swap(left,center);
        }
        if(a[left] > a[right]){
            swap(left,right);
        }
        if(a[center] > a[right]){
            swap(center,right);
        }

        swap(center , right -1);
        return a[right - 1];
}


void manualSort(int left,int right){
    int size = right - left + 1;
        if(size < 1){
            return ;
        }
        if(size == 2){
            if(a[left] > a[right]){
                swap(left,right);
            }
            return;
        }else{
            if(a[left] > a[right - 1]){
                swap(left,right - 1);
            }
            if(a[left] > a[right]){
                swap(left,right);
            }
            if(a[right -1] > a[right]){
                swap(right - 1, right);
            }
        }
}

void recQuickSort(int left ,int right){
    int size = right - left + 1;
        if(size <= 3){
            manualSort(left , right);
        }else{
            long median = medianOf3(left , right);
            int partition = partitionIt(left , right , median);
            recQuickSort(left , partition - 1);
            recQuickSort(partition + 1 , right);
        }
}

void quickSort(){
    recQuickSort(0,nElems - 1);
}

void show(){
    for(int i = 1 ; i <= nElems ; i ++){
        cout<< setw(4) << a[i-1] << setw(4) << " ";
        if(i % 10 == 0){
            cout << endl;
        }
    }
}

int main(){
    clock_t start,finish;
    srand((unsigned int)time (NULL));

    // 冒泡排序
    for(int i = 0 ; i < nElems ; i ++){
        a[i] = rand() % 1200 + 1;
    }
    start = clock();
    bubleSort();
    finish = clock();
    cout << "冒泡排序所用时间:" << finish - start << endl;

    for(int i = 0 ; i < nElems ; i ++){
        a[i] = rand() % 1200 + 1;
    }
    start = clock();
    insertSort();
    finish = clock();
    cout << "插入排序所用时间:" << finish - start << endl;

    for(int i = 0 ; i < nElems ; i ++){
        a[i] = rand() % 1200 + 1;
    }
    start = clock();
    shellSort();
    finish = clock();
    cout << "希尔排序所用时间" << finish - start << endl;

    for(int i = 0 ; i < nElems ; i ++){
        a[i] = rand() % 1200 + 1;
    }
    start = clock();
    quickSort();
    finish = clock();
    cout << "希尔排序所用时间" << finish - start << endl;

    return 0;
}