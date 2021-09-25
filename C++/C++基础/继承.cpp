#include <iostream>
using namespace std;

// 继承页面
// 公共页面类
class menu{
public:
    void header(){
        cout << "首页，页面" << endl;
    }
    void footer(){
        cout << "帮组中心，交流合作" << endl;
    }

    void left(){
        cout << "Java , Web , Php , C++ , Python ...." << endl;
    }
};

class Java: public menu{
public: 
    void content(){
        cout << "java独占" << endl;
    }
};

class Cpp:  public menu{
public:
    void content(){
        cout << "C++独占" << endl;
    }
};

class Python: public menu{
public:
    void content(){
        cout << "Python" << endl;
    }
};

void test01(){
    Java j;
    Cpp c;
    Python p;
    j.header();
    j.content();
    j.left();
    j.footer();
    cout << "=================================" << endl;
    c.header();
    c.content();
    c.left();
    c.footer();
    cout << "=================================" << endl;
    p.header();
    p.content();
    p.left();
    p.footer();
}

// 继承的好处，减少重复的好处
// 继承语法：
// class 子类 : 继承方式 父类{};
// 子类也称为派生类
// 父类也称为基类
int main(){
    test01();
    return 0;
}