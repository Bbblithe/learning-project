#include <iostream>
using namespace std;

// 重载关系运算符

class Person{
public :
    Person(string name , int age){
        this->age = age;
        this->name = name;
    }

    bool operator==(Person& p){
        if(this->name == p.name && this->age == p.age){
            return true;
        }
        return false;
    }

    bool operator!=(Person& p){
        if(this->name == p.name && this->age == p.age){
            return false;
        }
        return true;
    }

    string name;
    int age;
};

void test01(){
    Person p1("Tom",18);
    Person p2("Tom",18);

    cout << (p1 == p2 ? "p1和p2相等" : "p1和p2不相等") << endl;
    cout << (p1 != p2 ? "p1和p2不相等" : "p1和p2相等") << endl;
}

int main(){
    test01();
    return 0;   
}