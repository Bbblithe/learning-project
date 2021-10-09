#include <iostream>
using namespace std;

// 实现多继承
class Base1{
public:
    Base1(){
        a = 0;
    }
    Base1(int a){
        this->a = a;
    }
    int a;
};

class Base2{
public:
    Base2(){
        a = 0;
    }
    Base2(int a){
        this->a = a;
    }
    int a;
};

// 子类 需要继承Base1和Base2
// 语法：class 子类：继承方式 父类1, 继承方式 父类2, ...{};
class Son:public Base1,public Base2{
public:
    Son(){
        c = 1;
        d = 2;
    }
    int c;
    int d;
};

void test01(){
    Son s;
    cout << "Son子类的大小:" << sizeof s << endl;
    cout << s.Base2::a << endl;
    cout << s.Base1::a << endl;
}

int main(){
    test01();
    return 0;
}