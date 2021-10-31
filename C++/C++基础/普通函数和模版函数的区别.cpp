#include <iostream>
using namespace std;

// 普通函数与模版函数的区别

// 1、普通函数调用可以繁盛隐式类型转换
// 2、模版函数 用自动类型推导，不可以发生隐式类型转换
// 3、模版函数 用显式指定类型，可以发生隐式类型转换

int myAdd1(int a, int b){
    return a + b;
}

template <typename T> 
T myAdd2(T a , T b){
    return a + b;
}

void test01(){
    int a = 10 ;
    char c = 'a';

    cout << myAdd1(a,c) << endl;

    // 自动类型推导
    // cout << myAdd2(a,c) << endl;

    cout << myAdd2<int>(a,c) << endl;
}

int main(){
    test01();
    return 0;
}