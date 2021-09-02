#include <iostream>
using namespace std;

// 常量引用
// 使用场景：用来修饰形参，防止误操作

// showValue 只用来打印数据，但是如果其中不小心加入赋值修改操作，可通过加入const来限制修改 
void showValue(const int& val){
    // val = 1000;
    cout << "val = " << val << endl;
}


int main(){
    // int a = 10;
    // int& ref = 10;
    // 引用必须是一个合法的内存空间
    // 加上const之后 编译器将代码修改 
    // int temp = 10; 
    // const int & ref = temp;
    // const int& ref = 10;

    int a = 100;
    showValue(a);

    cout << "a = " << a << endl;
    return 0;
}