#include <iostream>
using namespace std;

class Base{ // 抽象类
public:
    // 纯虚函数
    // 只要有一个纯虚函数，那么这个类就被称为抽象类
    // 1、抽象类无法实例化对象
    // 2、抽象类的子类必须要重写父类中的纯虚函数，否则也是抽象类
    virtual void func() = 0;
};

class Son : public Base{
    void func(){
        cout << "儿媳类" << endl;
    }
};

void test1(){
    // Base b; //object of abstract class type "Base" is not allowed
    // Base* b = new Base; 不管是栈上，还是堆区都无法实例化对象
}

void test2(){
    // Son s;
    // new Son;
    Son s;
    // s.func();
}


int main(){

    test1();
    return 0;
}