#include <iostream>
using namespace std;

// 函数调用运算符重载

// 打印输出类
class Print{
public:
    
    // 重载函数调用运算符
    void operator()(string test){
        cout << test << endl;
    }
};

void print02(string test){
    cout << test << endl;
}

void test01(){
    Print p;
    p("nihao"); // 由于使用起来非常类似于函数调用，因此称为仿函数
    print02("hello world ！") ;
}

// 仿函数非常灵活，没有固定的写法
// 加法类
class Add{
public:
    int operator()(int num1,int num2){
        return num1 + num2;
    }
};

void test02(){
    Add a;
    cout << a(29,11) << endl;

    // 匿名函数对象
    cout <<  Add()(100,299) << endl;
}


int main(){
    // test01();
    test02();
    return 0;
}