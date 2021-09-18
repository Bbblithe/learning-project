#include <iostream>
using namespace std;

// 常函数
class Person{
public :

    Person():m_A(100),m_B(200){
        cout << "Person的无参构造调用" << endl;
    }

    // this指针的本质 是指针常量 指针的指向是不可以修改的
    // Person* const this;
    // 在成员函数后面加const，修饰的是this指针，使得指针指向的值也不可以修改
    void showPerson() const{
        this->m_B = 200;
        // m_A = 100;
        // this = NULL; // this指针不可以修改窒指向方向
        // m_A = 200;
    }

    void func(){

    }

    int m_A;
    mutable int m_B; // 特殊变量 ，即使在长函数中，也可以修改这个值,加关键字mutable
};

void test01(){
    Person p;
    p.m_A = 300;
    cout << p.m_A << endl;
    p.showPerson();
}

void test02(){
    const Person p;// 在对象前加const ，变为常对象
    // p.m_A = 200;
    p.m_B = 300;// m_B是特殊值，在常对象下也可以修改
    // 常对象只能调用常函数
    p.showPerson();
    // p.func(); // 常对象只能调用常函数，因为非常函数可以修改属性，但是常对象不允许，因此常对象只能调用常函数都不允许修改
}

int  main(){
    test01();
    return 0;
}