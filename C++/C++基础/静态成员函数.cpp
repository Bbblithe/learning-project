#include <iostream>
using namespace std;

// 静态成员函数
// 所有对象共享同一个函数
// 静态成员函数只能访问静态成员变量

class Person{
public:
    // 静态成员函数
    static void func(){
        m_A = 100; // 静态函数可以访问静态成员变量
        // m_B = 200; // 静态成员函数 不可以访问 非静态成员变量
        cout << "staci void fun调用！ " << endl;
    }

    static int m_A; // 静态成员变量
    int m_B;

    // 静态成员函数也是有访问权限的
private :
    static void func2(){
        cout << "static void fun2的调用" << endl;
    }
};

int Person::m_A;

// 有两种方式调用
void test01(){
    // 1、通过对象访问
    Person p;
    p.func();
    // 2、通过类名访问
    Person::func();
    // Person::func2();
}

int main(){
    test01();
    return 0;
}