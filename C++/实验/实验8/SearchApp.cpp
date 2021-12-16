#include <iostream>
#include<iomanip>
using namespace std;
#define MAXSIZE 100

template<class T>
class LineSerarch{
public :
    LineSerarch(T a[],int n){
        for(int i = 0 ; i < n ; i ++){
            data[i] = a[i];
        }
    }

    ~LineSerarch(){
        for(int i = 0 ;i < MAXSIZE ; i ++){
            data[i] = 0;
        }
    }

    int linerSerach(int key){
        for(int i = 0 ; i < MAXSIZE ; i ++){
            if(data[i] == key){
                return i;
            }
        }
        return -1;
    }

    int binarySerach1(int key){
        // int center;
        // int left = 0;
        // int right = MAXSIZE;
        // while(right > left){
        //     center = (right + left) /2;
        //     if(data[center] >key){
        //         right = center + 1;
        //     }else if(data[center] < key){
        //         left = center - 1;
        //     }else{
        //         return key;
        //     }
        // }
        // return -1;
        int lowerBound = 0;
        int upperBound = MAXSIZE - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (data[curIn] == key) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return -1;
            } else {
                if (data[curIn] < key) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    int binarySerach2(int key,int left ,int right){
        int center = (left + right) / 2;
        if(right < left){
            return -1;
        }

        if(data[center] > key){
            // binarySerach2(key,left,center - 1);
            return binarySerach2(key,left,center - 1);
        }else if(data[center] < key){
            // binarySerach2(key,right,center + 1);
            return binarySerach2(key,center + 1,right);
        }else{
            return center;
        }
    }

    void show(){
        for(int i = 1 ; i <= MAXSIZE ; i ++){
            cout<< setw(4) << data[i-1] << setw(4) << " ";
            if(i % 10 == 0){
                cout << endl;
            }
        }
    }

    void bubleSort(){
        int out,in;
        for(out = MAXSIZE - 1 ; out > 1 ; out --){
            for(in = 0 ; in < out ; in ++) {
                if (data[in] > data[in + 1]) {
                swap(in, in + 1);
                }
            }
        }
    }
 
private :
    T data[MAXSIZE];
    int length;
    void swap(int x , int y){
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;
    }
};




int main(){
    clock_t start,finish;
    srand((unsigned int)time (NULL));
    int a[MAXSIZE] = {0};
    for(int i = 0 ; i < MAXSIZE ; i ++){
        a[i] = rand() % 100 + 1;
    }
    LineSerarch<int> l(a,MAXSIZE);

    l.show();
    start = clock();
    int result = l.linerSerach(50);
    finish = clock();
    if(result == -1){
        cout << "该随机数组中没有该元素" << endl;
    }else{
        cout << "该元素位于" << result << endl;
    }
    cout << "顺序查找耗费时间:" << finish - start << endl;

    l.bubleSort();
    l.show();

    start = clock();
    result = l.binarySerach1(50);
    finish = clock();
    if(result == -1){
        cout << "该随机数组中没有该元素" << endl;
    }else{
        cout << "该元素位于" << result << endl;
    }
    cout << "非递归二分查找耗费时间:" << finish - start << endl;

    start = clock();
    result = l.binarySerach2(50,0,MAXSIZE);
    finish = clock();
    if(result == -1){
        cout << "该随机数组中没有该元素" << endl;
    }else{
        cout << "该元素位于" << result << endl;
    }
    cout << "递归二分查找耗费时间:" << finish - start << endl;
    return 0;
}