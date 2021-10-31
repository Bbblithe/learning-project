#include <iostream>
using namespace std;

// 1、如果函数模版和普通函数都可以调用，优先调用普通函数
// 2、可以通过空模版参数列表 强制调用 函数模版
// 3、函数模版可以发生函数重载
// 4、如果函数模版可以产生更好的匹配，优先调用函数模版

void myPrint(int a, int b){
    cout << "调用的是普通函数" << endl;
}

template <typename T>
void myPrint(T a, T b){
    cout << "调用的是函数模版" << endl;
}

template <class T>
void myPrint(T a, T b , T c){
    cout << "模版函数的重载" << endl;
}

void test01(){
    int b = 20;
    int a = 10;

    // myPrint(a ,b );

    // 通过空模版参数列表，强制调用函数模版
    myPrint<>(a,b);

    myPrint(a,b ,100);

    // 如果函数模版产生更好的匹配，优先调用函数模版
    char c1 = 'a';
    char c2 = 'b';
    myPrint(c1,c2);
}


int main(){
    test01();
    return 0;
}