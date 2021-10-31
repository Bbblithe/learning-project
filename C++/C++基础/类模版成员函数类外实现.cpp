#include <iostream>
using namespace std;

template<class T1,class T2>
class Person{
public:

    Person(T1 name,T2 age);
    void showPerson();

    T1 name;
    T2 age;
};

// 构造函数类外实现
template<class T1,class T2>
Person<T1,T2>::Person(T1 name , T2 age){
    this->name = name;
    this->age = age;
}

// 成员函数类外实现
template<class T1,class T2>
void Person<T1,T2>::showPerson(){
    cout << "姓名:" << this->name << " 年龄：" << this->age << endl;
}

void test01(){
    Person<string,int> p("熏悟空",19);
    p.showPerson();
}


int main(){
    test01();
    return 0;
}