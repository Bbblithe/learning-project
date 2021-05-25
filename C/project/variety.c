#include <stdio.h>

// int main(){
//     const int n = 10;// n是变量，但是又有常属性，所以我们说n是常变量
//     int arr[n] = {0};
//     // n = 20;
// }

// #define 定义的标识符常量

// #define MAX 10
// int main(){
//     int arr[MAX] = {0};
//     printf("%d\n",MAX);

// }

// 4.枚举常量
// 枚举 ： 一一列举
// 性别：男，女，保密
// 三原色： 红，黄，蓝
// 星期：1，2，3，4，5，6，7

// 枚举关键字:enum

enum Sex{
    MALE,
    FEMALE,
    SECRET
};

// MALE,FEMALE,SECRET - 枚举常量
int main(){
    enum Sex s = FEMALE;
    printf("%d\n",MALE);// 0 
    printf("%d\n",FEMALE);// 1
    printf("%d\n",SECRET);// 2
    return 0 ;
}