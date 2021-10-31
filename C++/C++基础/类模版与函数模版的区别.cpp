#include <iostream>
using namespace std;

// 类模版与函数模版的区别
template<class NameType,class AgeType = int>
class Person{
public:
    Person(NameType Name,AgeType age){
        this->Name = Name ;
        this->Age = Age;
    }

    void showPerson(){
        cout << "name:" << Name << " age:" << age << endl;
    }

    NameType Name;
    AgeType Age;
};

// 1、类模版没有自动类型推导使用方式
void test01(){
    // Person p("苏悟空",999); 无法使用自动类型推导

    Person<string,int> p = Person<string,int>("无奈悟空",999);
}

// 2、类模版在模版参数列表中可以有默认参数
void test02(){
    Person<string> p ("猪八件",123);
}

int main(){

    return 0;
}