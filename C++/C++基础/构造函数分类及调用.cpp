#include <iostream>
using namespace std;

// 构造函数的分类及调用
// 分类
// 按照参数分类 无参构造（默认构造）   和有参构造
// 按照类型分类 普通构造 拷贝构造
class Person{
public :    
    Person(){
        cout << "person的无参构造方法的调用" << endl;
    }

    ~Person(){
        cout << "Person的析构方法的调用" << endl;
    }

    // 拷贝构造函数
    Person(const Person& p){
        // 将传入的人身上的所有属性，拷贝到我身上
        cout << "拷贝构造函数调用" << endl;
        age = p.age;
    }

    Person(int a){
        age = a;
        cout << "Person的有参构造的调用" << endl;
    }

    int age;
};

void test1(){
    // 调用
    // 1、括号法
    Person p1; // 默认构造函数的调用
    Person p2(10); // 有参构造函数调用
    Person p3(p2); // 拷贝构造函数调用
   
    // 注意事项
    // 调用默认构造函数时候，不需要加()
    // Person p1(); 编译器会将该语句当作函数的声明 类似 void func();
    // previous definition is here

    // cout << p2.age << endl;
    // cout << p3.age << endl;

    // 2、显示法
    Person p4;
    Person p5 = Person(300); // 有参构造
    Person p6 = Person(p5);

    Person(30); // 匿名对象 特点：当前行执行结束后，系统会自行回收掉匿名对象
    cout << "aaaa" << endl;

    // 注意事项2
    // 不要利用拷贝构造函数 初始化匿名对象 编译器会认为 Person(p3) === Person p3; 对象声明
    Person(p3);

    // 3、隐式转换法
    Person p4 = 10; // 相当于 写了 Person p4 = Person(10); 有参构造
    Person p5 = p4; // 拷贝构造 
}

int main(){
    test1();
    return 0;   
}