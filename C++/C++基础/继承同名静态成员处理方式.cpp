#include <iostream>
using namespace std;

// 继承中的同名静态成员处理方式

class Base{
public:
    
    static int a;

    static void func(){
        cout << "Base 下的静态函数调用！" << endl;
    }

    static void func(int a){
        cout << "Base重载" << a << endl;
    }
};
int Base::a = 100;

class Son:public Base{
public:
    static int a;
    static void func(){
        cout << "Son 下的静态函数调用！" << endl;
    }
};
int Son::a = 200;


// 同名静态成员属性
void test01(){

    // 1.通过对象访问数据
    Son s;
    cout << "Son下 a = " << s.a << endl;
    cout << "Base 下 a =" << s.Base::a << endl;

    cout << "================" << endl;

    // 2.通过类名访问
    cout << "Son下 a = " << Son::a << endl;
    cout << "Base下 a = " << Base::a << endl;  
    // 第一个::，代表通过类名方式访问，第二个:: 代表访问父类作用域下
    cout << Son::Base::a << endl;
}

void test02(){
    Son::func();
    Base::func();

    // 子类出现和父类同名静态成员函数，也会隐藏父类中所有的成员函数
    // 如果想访问父类中被隐藏同名成员，需要加作用域的下称
    Son::Base::func(200);
}

int main(){
    // test01();
    test02();
    return 0;
}