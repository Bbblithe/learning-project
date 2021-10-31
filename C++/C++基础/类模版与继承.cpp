#include <iostream>
using namespace std;

template <class T>
class Base{
private:
    /* data */
public:
    T m;
};

class Son:public Base<int>{
    
};

// 如果想灵活指定父类中的T类型，子类也需要变类模版
template<class T,class T1>
class Son2:public Base<T>{
    T1 obj;
};

void test1(){
    Son s1;
    cout << typeid(s1.m).name() << endl;
}

void test2(){
    // Son2 s3;
    // cout << typeid(s3.m).name() << endl;
    // cout << typeid(s3.obj).name() << endl;
    Son2<int,char> s2;
}


int main(){
    test1();
    test2();
    return 0;
}