#include <stdio.h>

/* 
    找出10个整数的最大值
*/

int main(){
    int arr[] = {1,2,3,4,5,6,7,8,9,10}; 
    int max = arr[0]; // 最大值
    int i = 0 ;
    int sz = sizeof(arr)/sizeof(arr[0]);
    for(i = 1 ; i < sz ; i ++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    printf("%d\n",max);
}