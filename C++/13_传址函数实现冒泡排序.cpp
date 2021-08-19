#include <iostream>
using namespace std;

void bublesort(int* arr , int size){
    for(int i = 0 ; i < size - 1 ; i ++){
        for(int j = 0 ; j < size - i - 1 ; j ++){
            if(*(arr + j) > *(arr + j + 1)){
                int temp = *(arr + j) ;
                *(arr + j) = *(arr + j + 1);
                *(arr + j + 1) = temp;
            }
        }
    }
}

void show(int* arr , int size){
    for(int i = 0 ; i < size ; i ++){
        cout << *(arr+i) << " ";
    }
    cout << endl;
}

int main(){
    int arr[] = {0,234,1,2332,9,3,4,5,6};
    int length = sizeof(arr)/sizeof(arr[0]);
    show(arr,length);
    bublesort(arr,length);
    show(arr,length);
    return 0;
}