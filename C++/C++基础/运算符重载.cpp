#include <iostream>
using namespace std;

// 加法运算符重载

class Person{
    // 1、成员函数重载 + 号
public:
    int m_A;
    int m_B;

    Person operator+(Person p){
        Person temp;
        temp.m_A = this->m_A + p.m_A;
        temp.m_B = this->m_B + p.m_B;
        return temp;
    }

    Person operator+(int i){
        Person temp;
        temp.m_A = this->m_A + i;
        temp.m_B = this->m_B + i;
        return temp;
    }

    Person(){
        this->m_A = 0;
        this->m_B = 0;
    }

    Person(int a, int b){
        m_A = a;
        m_B = b;
    }
};

// 2、全局函数重载 - 号
Person operator- (Person p1,Person p2){
    Person temp;
    temp.m_A = p1.m_A - p2.m_A;
    temp.m_B = p1.m_B - p2.m_B;
    return temp;
}

Person operator- (Person p1,int i){
    Person temp;
    temp.m_A = p1.m_A - i;
    temp.m_B = p1.m_B - i;
    return temp;
}

void test(){
    Person p1 = Person(10,20);
    Person p2 = Person(1,2);
    Person p3 = p2 + p1;
    cout << "p3.m_A = " << p3.m_A << ",p3.m_B = " << p3.m_B << endl; 
    Person p4 = p1 - p3;
    cout << "p4.m_A = " << p4.m_A << ",p3.m_B = " << p4.m_B << endl; 
}

int main(){
    test();
   return 0; 
}