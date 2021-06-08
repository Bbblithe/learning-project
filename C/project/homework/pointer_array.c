#include <stdio.h>

void print(int* p , int sz){
    for(int i = 0 ; i < sz ; i ++){
        printf("%d ",*(p+i));
    }
}

int main(){
    int arr[] = {1,2,3,3,5,6,7,8,89,9};
    int sz = sizeof(arr)/sizeof(arr[0]);
    print(arr , sz);
    return 0;
}