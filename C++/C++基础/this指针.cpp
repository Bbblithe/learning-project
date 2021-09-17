#include <iostream>
using namespace std;

class Person{
public:
    Person(int a){
        this->a = a;
    }

    Person& PersonAdda(Person &p){
        this->a += p.a;
        // this指向p2的指针，而*this执行的就是p2这个对象的本体
        return *this;
    }

    int a;
};

void test01(){
    Person p(12);
    cout << p.a << endl;
}

void test02(){
    Person p1(10);
    Person p2(20);
    p2.PersonAdda(p1).PersonAdda(p1).PersonAdda(p1).PersonAdda(p1);

    cout << p2.a << endl;
}

int main(){
    // test01();
    test02();
    return 0;
}