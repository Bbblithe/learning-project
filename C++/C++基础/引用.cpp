#include <iostream>
using namespace std;

int main(){
    // 引用基本语法
    // 数据类型 &别名 = 原名

    int a = 10;
    // 创建引用
    int &b = a;
    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
    b = 100;

    cout << "a = " << a << endl;
    cout << "b = " << b << endl;

    // 注意事项:
    // 1、引用必须初始化
    //int &c ;
    int &c = a;

    // 2、引用在初始化后，不可以改变
    int d = 20;
    c = d; // 赋值操作，而不是更改引用

    cout << "a = " << a << endl;
    cout << "b = " << c << endl;
    cout << "c = " << d << endl;
    return 0;
}