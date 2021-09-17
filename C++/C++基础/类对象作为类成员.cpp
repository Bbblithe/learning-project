#include <iostream>
using namespace std;

// 当其他类对象作为本类成员，构造时候先构造类对象，在构造自身
// 析构的时候，先析构本身，再析构类对象


class Phone{
public:
    Phone(){
        cout << "Phone的无参构造调用" << endl;
        p_Name = "iPhone";
        call_number = 110;
    }

    Phone(string Name,long number){
        cout << "Phone的有参构造的调用！" << endl;
        p_Name = Name;
        call_number = number;
    }

    ~Phone(){
        cout << "Phone析构函数的调用！" << endl;
    }
    // 手机品牌名称
    string p_Name;
    long call_number;
};

class Person{
public:
    Person(string p_name,string pName,long number){
        name = p_name ;
        iPhone.call_number =number;
        iPhone.p_Name = pName;
        cout << "Person的有参构造的调用！" << endl;
    }

    ~Person(){
        cout << "Perosn析构函数的调用！ " << endl;
    }
    string name;
    Phone iPhone;
};

void test01(){
    Person p("张三","HUAWEI",16602812369);
    cout << p.name << "拿着" << p.iPhone.p_Name << ",电话号码是：" << p.iPhone.call_number << endl;
}

int main(){
    test01();
    return 0;
}