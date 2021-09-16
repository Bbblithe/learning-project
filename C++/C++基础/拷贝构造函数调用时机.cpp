#include <iostream>
using namespace std;

class Person{
    public:
    Person(){
        cout << "Person的默认无参构造函数调用！" << endl;
    }

    Person(int age_){
        cout << "Person的有参构造函数调用" << endl;
        age = age_;
    }

    Person(const Person& p){
        cout << "Person的拷贝构造函数调用！" << endl;
        age = p.age;
    }

    ~Person(){
        cout << "Person的析构函数调用！" << endl;
    }
    
    int age;
};

// 拷贝构造函数的调用时期

// 1、使用一个已经创建完毕的的对象来初始化一个新对象
void test01(){
    Person p = Person(20);
    Person p2 = Person(p);
    cout << "p2的年龄为" << p2.age << endl;
}

// 2、值传递的方式给函数参数传值

void doWork(Person p){
    
}

void test02(){
    Person p = Person();
    doWork(p); // 调用拷贝构造函数
}

// 3、值方式返回局部对象
Person doWork2(){
    Person p1 ;
    cout << &(p1) << endl;
    return p1;
}

void test03(){
    Person p = doWork2();
    cout << &p << endl;
}

int main(){
    // test01();
    // test02();
    test03();
    return 0;   
}