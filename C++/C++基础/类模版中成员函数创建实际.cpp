#include <iostream>
using namespace std;


// 类模版中成员函数在调用时才去创建

class Person1{
public :
    void showPerson1(){
        cout << "Person1 show" << endl;
    }
};

class Person2{
public:
    void showPerson2(){
        cout << "Person2 show" << endl;
    }
};

template <class T>
class MyClass{
public:
    T obj;

    // 类模版中的成员函数
    void fun1(){
        obj.showPerson1();
        
    }

    void fun2(){
        obj.showPeron2();
    }
};

void test01(){
    MyClass<Person1> p;
    p.fun1();
    // p.fun2();
}

int main(){
    test01();
    return 0;
}