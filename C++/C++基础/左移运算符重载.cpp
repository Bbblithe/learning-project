#include <iostream>
using namespace std;

class Person{
friend ostream& operator<<(ostream& cout ,Person& p);
public:
    Person(int a,int b){
        m_A = a;
        m_B = b;
    }

private:

    // 利用成员函数重载 左移运算符
    // 不会利用成员函数重载左移运算符 ，因为无法实现 cout在左边
    // void operator<<(cout)

    int m_A;
    int m_B;
};

// 只能利用全局函数重载左移运算符
ostream&  operator<<(ostream& cout ,Person& p){ // 本质 operator<<(cout ,p ) 简化之后 cout << p
    cout << "m_A = " << p.m_A << " m_B = " << p.m_B;
    return cout;
}
void test01(){
    Person p(10,20);
    cout << p << endl;
}

int main(){
    
    test01();
    return 0;
}