#include <iostream>
using namespace std;

template<class T1,class T2>
class Person{
public :
    Person(T1 name , T2 age){
        this->name = name;
        this->age = age;
    }

    void showPerson(){
        cout << "姓名：" << name << " 年龄：" << age << endl;
    }

    T1 name;
    T2 age;
};

// 1、指定传入类型
void printPerson1(Person<string,int>& p){
    p.showPerson();
}

void test01(){
    Person<string,int> p ("孙悟空",123);
    printPerson1(p);
}

// 2、参数模版化
template<class T1,class T2>
void printPerson2(Person<T1,T2>& p){
    p.showPerson();
    cout << "T1的类型" << typeid(T1).name() << endl;
    cout << "T2的类型" << typeid(T2).name() << endl;
 }

void test02(){
    Person<string,int>p ("猪八件",12);
    printPerson2(p);
}

// 3、整个类模版化
template<class T>
void showPerson3(T p){
    p.showPerson();
    cout << "T的数据类型是" << typeid(T).name() << endl;
}

void test03(){
    Person<string,int> p ("唐生",1) ;
    showPerson3(p);
}

int main(){

    // test01();
    // test02();
    test03();
    return 0;
}