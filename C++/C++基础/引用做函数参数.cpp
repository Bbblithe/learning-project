#include <iostream>
using namespace std;

// 交换函数

// 1、值传递
void mySwap(int a , int b){
    int temp = a ;
    a = b; 
    b = temp;

    cout << "swap方法中:a = " << a << endl;
    cout << "swap方法中:b = " << b << endl; 
}

// 2、地址传递
void exchange(int* a , int *b ){
    int temp = *a ;
    *a = *b ;
    *b = temp;
}

// 3、引用传递
void commutation(int& a , int& b){
    int temp = a;
    a = b;
    b = temp;
}

int main(){
    int a = 10; 
    int b = 20;

    mySwap(a , b); // 值传递，形参不会修饰实参
    cout << "a = " << a << endl;
    cout << "b = " << b << endl; 

    exchange(&a,&b); // 址传递，形参会修饰实参
    cout << "a = " << a << endl;
    cout << "b = " << b << endl; 

    commutation(a,b); // 引用传递，形参会修饰实参
    cout << "a = " << a << endl;
    cout << "b = " << b << endl; 

    return 0;
}