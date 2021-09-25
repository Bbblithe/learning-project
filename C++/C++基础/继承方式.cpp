#include <iostream>
using namespace std;

// 公共继承
class A{
public:
    int a;
protected:
    int b;
private:
    int c;
};

class Son : public A{
public :
    void func(){
        a = 10; // 父类中的公共权限成员，到子类依然是公共权限
        b = 10; // 父类中的保护权限成员，到子类依然是保护权限
        // c = 20; // 子类无法访问
    }
};

class Son2 : protected A{
public:
    void func(){
        a = 100;
        b = 200;
        // c = 300; 父类中私有成员无法访问
    }
};

class C : private A{
public:
    void func(){
        a = 100; // 变为私有
        b = 200 ; // 变为私有
        // c = 300 父类中私有成员无法访问
    }
};

void test01(){
    Son s1;
    s1.a = 100;
    // s1.b = 200; 到son1 中b是保护权限，类外访问不到
    Son2 s2;
    // s2.a = 100; 在Son2中 a 变为保护权限， 因此类外访问不到
    C c;
    // c.a = 100;  // 均为私有成员
    // c.b = 200;
    // c. c = 300
}



int main(){

    return 0;
}