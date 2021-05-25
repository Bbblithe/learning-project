#include <stdio.h>
#include <string.h>

// int main(){
//     char arr1[] = "bit";
//     char arr2[20] = "#######";
//     strcpy(arr2,arr1);// 拷贝成功
//     printf("%s\n",arr2);
//     return 0;
// }

// int main(){
//     char arr[] = "hello world";
//     memset(arr,'*',5);// 修改arr，前5个位置变为*
//     printf("%s\n",arr);
//     return 0;
// }

// 这个函数并不会交换传入的值，仅仅改变了x,y两个的值，最后实际效果并没有改变
// 当实参传给形参的时候，形参其实是实参的一份临时拷贝，对形参的修改是不会改变实参的
// void swap1(int x , int y){
//     int temp = x;
//     x = y ;
//     y = temp;
// }

// void swap2(int* x,int* y){
//     int temp = *x;
//     *x = *y;
//     *y = temp;
// }


// int main(){
//     int a = 10;
//     int b = 20;
//     printf("%d,%d\n",a,b);
//     // swap1(a,b);
//     // printf("交换之后：%d,%d\n",a,b);
//     swap2(&a,&b);
//     printf("交换之后：%d,%d\n",a,b);
//     return 0 ;
// }


// 二分查找
// int binary_search(int arr[],int k,int sz){
//     // 算法的实现
//     // int sz = sizeof(arr)/sizeof(arr[0]);
//     int left = 0 ;
//     int right = sz - 1;
//     while(left <= right ){
//         int mid = (left + right)/2;
//         if(arr[mid] < k){
//             left = mid + 1;
//         }else if(arr[mid] > k){
//             right = mid - 1;
//         }else{
//             return mid;
//         }
//     }
//     return -1;
// }

// int main(){
//     int arr[] = {1,2,3,4,5,6,7,8,9,10,22};
//     int sz = sizeof(arr)/sizeof(arr[0]);
//     printf("%d\n",binary_search(arr,12,sz));
//     return 0;
// }

// void Add(int* num){
//     (*num)++; // 如果直接写*num++ 的话，由于++ 优先级较高，会直接让p++，再解地址*(p++)；
// }

// int main(){
//     int num = 0,i;
//     for(i = 0; i < 3 ; i ++){
//     Add(&num);
//     }
//     printf("%d\n",num);
//     return 0;
// }

// int main(){
//     printf("%d",printf("%d",printf("%s","nimade"))); // printf()函数的返回值是打印字符的个数
//     return 0;
// }

// 函数声明
// int Add(int x , int y);

// int main(){
//     int a = 10;
//     int b = 20;
//     int sum = 0 ;
//     // 函数调用
//     sum = Add(a,b);
//     printf("%d\n",sum);
//     return 0;
// }

// // 函数的定义
// int Add(int x , int y){
//     return x + y;
// }