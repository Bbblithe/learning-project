#include <iostream>
using namespace std;

template<typename T>// 声明一个模版，高数编译器后面代码中紧跟着的T不要报错，T是一个通用数据类型
void mySwap(T& a, T& b){
    T temp = a;
    a = b;
    b = temp;
}

void swapInt(int& a , int& b ){
    int temp = a;
    a = b ;
    b = temp;
}

// 交换两个浮点型函数
void swapDouble(double& a , double& b ){
    double temp = a;
    a = b;
    b = temp;
}

void test01(){
    int a = 10;
    int b = 20;
    swapInt(a,b);
    // 利用函数模版交换
    // 两种方式使用函数模版
    // 1、自动类型推导
    // mySwap(a,b);
    // 现实指定类型
    mySwap<int>(a,b);
    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
}

int main(){
    test01();
    return 0;
}