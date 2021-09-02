#include <iostream>
using namespace std;

// 函数占位符
// 返回值类型 函数名(数据类型){}

// 目前阶段的占位参数，我们还用不到，以后阶段会用
// 占位参数 还可以有默认参数
void func(int a = 10,int = 10){
    cout << "this if func" << endl;
}

int main(){

    func();

    return 0;
}