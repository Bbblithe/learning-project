#include <iostream>
using namespace std;

// struct 和 class唯一的区别就在于默认的访问权限不同

class C1{
    int m_A; // 默认权限 是 私有
};

struct C2{
    int m_A; // 默认权限 是 公共
};

int main(){
    // struct 和 class区别
    // struct 默认权限是 公共 public
    // class 默认权限是 私有 private
    C1 c1;
    // c1.m_A = 19;

    C2 c2;
    c2.m_A = 200; // 在struct 默认的权限为公共的， 默认可以访问
    return 0;
}