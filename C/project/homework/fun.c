#include <stdio.h>

// void Init(int array[], int sz){
//     for(int i = 0 ; i < sz ; i ++){
//         array[i] = 0;
//     }
// }

void Print(int array[] , int sz){
    for(int i = 0 ;i < sz ; i ++){
        printf("%d ",array[i]);
    }
    printf("\n");
}

// void Reverse(int array[] , int sz){
//     int left = 0 ;
//     int right = sz - 1;
//     while(left <= right){
//         int temp = array[left];
//         array[left++] = array[right];
//         array[right--] = temp;
//     }
// }
// int main(){
//     int arr[11] = {1,2,3,4,5,6,7,8,9,20,11};
//     int sz = sizeof(arr)/sizeof(arr[0]);
//     Reverse(arr , sz);
//     Print(arr,sz);
//     Init(arr , sz);// 把函数初始化为0
//     Print(arr,sz);
//     return 0;
// }

void exchange(int arr1[] , int arr2[] , int sz){
    int temp;
    for(int i = 0 ; i < sz ; i ++){
        temp = arr1[i];
        arr1[i] = arr2[i];
        arr2[i] = temp;
    }
}

int main(){
    int arr1[] = { 1,2,3,4,5};
    int arr2[] = { 6,7,8,9,0};
    int sz = sizeof(arr1)/sizeof(arr1[0]);
    exchange(arr1,arr2,sz);
    Print(arr2,sz);
    return 0;
}


