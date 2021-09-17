#include <iostream>
using namespace std;

// 初始化列表
class Person{
public :

    // 传统初始化操作
    // Person(int a1, int b1, int c1){
    //     a = a1;
    //     b = b1;
    //     c = c1;
    // }

    // 初始化列表初始化属性
    Person(int a,int b,int c):a(a),b(b),c(c){
        
    }

    int a;
    int b;
    int c;
        
};

void test01(){
    // Person p(10,20,39);
    Person p(10,20,30);
    cout << p.a << " " << p.b << " " << p.c << endl;
}

int main(){
    test01();
    return 0;
}