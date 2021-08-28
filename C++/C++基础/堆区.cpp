#include <iostream>
using namespace std;

int* func(){
    // int a = 10; 这里的a是一个局部变量，函数调用结束，将会自动释放空间

    // 利用new关键字，可以将数据开辟到堆区！
    // 指针本质
    int* a = new int(10);
    return a;
}

int main(){
    // 在堆区开辟数据
    int *p = func();
    cout << *p << endl;
    return 0;
}