#include <stdio.h>


// int main(){
//     printf("hehe\n");
//     main();
//     return 0;
// }


// 通过递归来依次打印数字
// void print(int n){
//     if(n > 9){
//         print(n/10);
//     }
//     printf("%d ",n%10);
// }

// int main(){
//     unsigned int num = 0 ;
//     scanf("%d",&num);
//     print(num);
// }

// 通过递归不创建临时变量来计算数组长度
// int my_strlen(char* str){
//     if(*str != 0){
//         return 1+my_strlen(str +1);
//     }else{
//         return 0;
//     }
// }

// int main(){
//     char arr[] = "hahaha";
//     int len = my_strlen(arr);// arr是数组，数组传参，传过去的不是整个数组，而是第一个元素的地址
//     printf("%d\n",len);
//     return 0;
// }

// 使用递归实现累乘
// int multiplicative(int n){
//     if(n != 1){
//         return n * multiplicative(n-1);
//     }else{
//         return 1;
//     }
// }

// int main(){
//     int result = multiplicative(5);
//     printf("%d\n",result);
// }

// 使用递归实现菲波纳基数列
// long f(int num){
//     if(num <= 2){
//         return 1;
//     }else{
//         return f(num - 1) + f(num - 2);
//     }
// }

// 使用循环
// int f(int num){
//     int a = 1;
//     int b = 1;
//     int c = 1;
//     while(num > 2){
//         c = a + b;
//         a = b ;
//         b = c ;
//         num --;
//     }
//     return c;
// }

// int main(){
//     printf("%d",f(10));
//     return 0;
// }

