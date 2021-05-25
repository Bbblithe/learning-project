#include <stdio.h>
#include <string.h>

// int main(){
//     // 创建一个数组-存放整形-10个
//     int arr[10] = {1,2,3,4};// 不完全初始化,其余元素默认初始化为0
//     char arr2[5] = {'a','b'};
//     char arr3[5] = "ab";// 数组中有三个char类型'a','b','\0'
//     char arr4[] = "abcdef"; // 根据初始化内容自动开辟一个"abcdef"空间大小的数组
//     printf("%lu\n",sizeof(arr4)); // 7 
//     printf("%lu\n",strlen(arr4)); // 6
//     return 0;
// }


// int main(){
//     char arr1[] = "abc";
//     char arr2[] = {'a','b','c'};
//     printf("%lu\n",sizeof(arr1));// 4，一个char占一个字节，且数组里共有四个元素'a','b','c','\0'
//     printf("%lu\n",sizeof(arr2));// 3，一个char占一个字节，且数组里共有三个元素'a','b','c'
//     printf("%lu\n",strlen(arr1));// 3，长度为3个，strlen函数读取在'\0'之前的元素，一共有'a','b','c'三个
//     printf("%lu\n",strlen(arr2));// 随机数，由于strlen函数读取在'\0'之前的元素，但是这里数组里并没有'\0'，因此随机数
//     return 0;
// }

// int main(){
//     char arr[] = "abcdef";
//     int a;
//     for(a = 0 ; a <strlen(arr) ;a++ ){
//         printf("%c ",arr[a]);
//     }
//     return 0;
// }

// int main(){
//     char arr[] = {1,2,3,4,5,6,7,7,8,8,8,10};
//     int sz = sizeof(arr)/sizeof(arr[0]);
//     int a;
//     for(a = 0 ; a <sz ; a++){
//         printf("&arr[%d] = %p\n",a,&arr[a]);
//     }
// }

// 二维数组
// int main(){
//     int arr[3][4] = {{1,23,4},{4,5},{111,3,366}}; 
//     return 0;
// }

// 二维数组遍历
// int main(){
//     int arr[3][4] = {{1,2,3},{4,5}};
//     int i = 0;
//     for(int i = 0 ; i < 3 ; i++){
//         int j = 0 ;
//         for(int j = 0 ; j < 4 ; j ++){
//             printf("%d ",arr[i][j]);
//         }
//         printf("\n");
//     }
//     return 0;
// }


// int main(){
//     int arr[3][4] = {{1,2,3},{4,5}};
//     int i = 0;
//     for(int i = 0 ; i < 3 ; i++){
//         int j = 0 ;
//         for(int j = 0 ; j < 4 ; j ++){
//             printf("&arr[%d][%d] = %p\n",i,j,&arr[i][j]);
//         }
//     }
//     return 0;
// }



// void bubble_sort(int arr[],int sz){
//     int i = 0 ;
//     for(int i = 0 ; i < sz - 1; i++){
//         int flag = 1;// 假设这一趟要排序的数据已经有序
//         int j = 0 ;
//         for(int j = 0 ; j < sz - 1 - i ; j ++){
//             if(arr[j] > arr[j + 1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//                 flag = 0; // 本趟发虚的数据其实不完全有序
//             }
//         }
//         if(flag == -1){
//             return;
//         }
//     }

// }

// int main(){
//     int arr[] = {8,365,6,7,2,1,3,6,1,9};
//     int sz = sizeof(arr)/sizeof(arr[0]);
//     // arr是数组，函数里传入的是第一个元素地址
//     bubble_sort(arr,sz);//
//     for(int i = 0 ; i < sz ; i ++){
//         printf("%d ",arr[i]);
//     }
//     return 0;
// }