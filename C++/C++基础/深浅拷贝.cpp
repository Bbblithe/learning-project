#include <iostream>
using namespace std;

// 如果属性有在堆区开辟的，一定需要自己写深拷贝函数

// 深拷贝和 浅拷贝:自己在内存区再次创建一块空间
class Person{
public :
    Person(){
        cout << "Person的无参构造调用！" << endl;
    }

    Person(int age , int height){
        m_Age = age;
        m_Height = new int(height);
        cout << "Person的有参构造调用！" << endl;
    }

    // 自己实现拷贝构造函数 解决浅拷贝带来的问题
    Person(const Person& p){
        cout << "Person拷贝构造函数的调用！" << endl;
        m_Age = p.m_Age;
        // m_Height = p.m_Height 编译器默认实现就是这行代码

        m_Height = new int(*p.m_Height);
    }

    ~Person(){
        // 析构代码，将对区开辟的数据进行释放操作
        if(m_Height != NULL){
            delete m_Height;
            m_Height = NULL;
        }
        cout << "Person的析构函数调用！" << endl;
    }

    int m_Age;
    int *m_Height; // 身高
};

void test01(){
    Person p1(18,178);
    cout << "p1的年龄：" << p1.m_Age << " 身高：" << *p1.m_Height << endl;
    Person p2(p1);
    cout << "p2的年龄:" << p2.m_Age << " 身高:" << *p2.m_Height << endl;
    cout << &p1 << "   " << &p2 << endl;
}

int main(){
    test01();
    return 0;
}