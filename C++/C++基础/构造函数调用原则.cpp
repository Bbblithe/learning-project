#include <iostream>
using namespace std;

// 构造函数的调用规则
// 1、创建一个类，C++编译器会给每个类都添加至三个函数
// 默认构造（空实现）
// 析构函数（空实现）
// 拷贝构造（值拷贝）

// 2、如果我们写了有参构造函数，编译器将不再提供无参构造
// no default constructor exists for class "Person"

// 3、入股哦我们写了拷贝构造函数，编译器不再提供其他的普通的构造函数
class Person{
public:
    Person(){
        cout << "Person默认构造函数" << endl;
    }

    ~Person(){
        cout << "Person的析构函数调用！" << endl;
    }

    Person(int a){
        age = a;
        cout << "Person的有参构造调用！" << endl;
    }

    Person(const Person& p){
        age = p.age;
        cout << "Person的拷贝构造函数调用！" << endl;
    }

    int age;
};

// void test01(){
//     Person p;
//     p.age = 18;

//     Person p2(p);
//     cout << "p2的年龄有" << p2.age << endl;
// }

void test02(){
    Person p(29);
    Person p2(p);

    cout << "p2今年" << p2.age << "岁" << endl;
}
int main(){
    test02();
    return 0;
}