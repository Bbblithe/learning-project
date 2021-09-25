#include <iostream>
using namespace std;

class Base{
public:
    int a;
protected:
    int b;
private:
    int c;
};

class Son : public Base{
public :
    int d;
};

void test01(){
    Son s;
    // 16 父类中所有非静态成员属性都会被子类继承下去
    // 父类中私有成员属性 是被编译器隐藏了，因此是访问不到的，但是确实被继承下去了
    cout << sizeof s << endl;
}


int main(){
    test01();
    return 0;
}