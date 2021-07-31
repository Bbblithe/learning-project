#include <iostream>
using namespace std;

// 常量的定义方式
// 1、#define 宏常量
#define Day 7

// 2、const修饰的常变量 

int main(){
    const int month = 12;
    cout << "一周总共有" << Day << "天" << endl;
    cout << "一年总共有" << month << "个月份" << endl;
    return 0;
}
