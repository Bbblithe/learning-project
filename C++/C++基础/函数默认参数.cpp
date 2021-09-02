#include <iostream>
using namespace std;

// 函数默认参数

// 如果我们自己传入了数据，就用自己的数据，如果没有，则使用默认值
// 语法：返回值类型 函数名称(形参 = 默认值,形参 = 默认值){}
int func(int a, int b = 20, int c = 30){
    return a + b + c;
}

// 注意事项
// 1、如果某个位置已经有了默认参数，那么从这个位置往后，从左到右都必须有默认值
/*
int func2(int a , int b = 10 , int c ,int d){
    return a + b + c;
}
*/

// 2、如果函数的声明有了默认参数，函数实现就不能有默认参数
int func2(int a, int b); // 函数的声明

int func2(int a = 20, int b = 10){
    return a + b;
}

int main(){
    int ret = func(10,30);
    cout << ret << endl;
    cout << func2(10,20) << endl;
    return 0;
}