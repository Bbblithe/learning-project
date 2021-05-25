#include <stdio.h>

// int main(){
//     // typedef - 类型定义 - 类型重定义
//     typedef unsigned int u_int;

//     // 下面两行在通过typedef之后，意义相同
//     unsigned int num = 20;
//     u_int num2 = 20;
// }

// static 修饰局部变量，局部变量生命周期变长
// void test(){
//     static int a = 1; // 加上static a变成一个静态的局部变量
//     // 如果不加static修饰变量a，则会打印出5个2
//     printf("a = %d\n",++a);
// }
// int main(){
//     int i = 0; 
//     while(i < 5){
//         test();
//         i++;
//     }

//     return 0;
// }

// int main(){
//     // 在add.c 中static修饰了全局变量，
//     // static修饰全局变量改变了变量的作用域- 让静态的全局变量只能在自己所在的源文件内部使用
//     // 处理源文件就没法使用了
//     extern int g_val;
//     printf("g_val = %d\n",g_val);
//     return 0;
// }

// 声明外部函数
// extern int Add(int , int);

// // static 修饰函数，也是改变了函数的作用域- 不准确
// static 改变了函数的链接属性，正常的函数是有外部链接属性
// static 将外部链接属性-- > 内部链接属性
// int main(){
//     int a = 10;
//     int b = 20;
//     int sum =  Add(a,b);
//     printf("sum = %d\n",sum);
//     return 0;
// }

// #define 定义常量和宏

// #definde 可以定义标识符常量
// #define MAX 100

// 函数
int Max(int x, int y){
    if( x > y )
        return x ;
    return y;
}

// 宏的定义
#define MAX(X,Y) (X>Y?X:Y)

int main(){
    int a = 10;
    int b = 20;
    // 函数
    int max = Max(a,b);
    printf("max = %d\n",max);
    max = MAX(a, b);
    // max = (a>b?a:b);
    printf("max = %d\n",max);
    return 0;
}
