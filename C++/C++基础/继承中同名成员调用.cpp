#include <iostream>
using namespace std;

// 继承中同名成员处理
class Base{
public:
    Base(){
        a = 100;
    }

    void func(){
        cout << "Base 作用域下func函数调用" << endl;
    }

    void func(int a){
        cout << "Base 作用域下func(int)函数调用！" << endl;
    }

    int a;
};

class Son : public Base{
public:
    Son(){
        a = 200;
    }

    void func(){
        cout << "Son 作用域下func函数调用" << endl;
    }

    int a;
};

// 同名成员属性
void test01(){
    Son s;
    cout << "A = " << s.a << endl;
    cout << "A = " << s.Base::a << endl;
}

// 同名成员函数
void test02(){  
    Son s;
    s.func(); // 直接调用，调用的是子类的同名成员

    // 如何调用父类中同名成员函数
    // 如果想访问父类中被隐藏的同名成员函数，需要添加作用域
    s.Base::func(1);
    // 如果子类中出现和父类同名的成员函数，子类的同名成员会隐藏掉父类中所有的同名函数
    // s.func(2);
}

int main(){
    test02();
    // test01();
    return 0;
}