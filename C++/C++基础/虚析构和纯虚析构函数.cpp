#include <iostream>
using namespace std;

class Animal{
public:
    Animal(){
        cout << "Animal的构造函数调用!" << endl;
    }

    /*
    ~Animal(){
        cout << "Animal的析构函数调用" << endl;
    }
    */

   // 利用虚析构可以解决 父类指针析构函数无法释放干净子类开辟在堆区域空间的数据
   /*virtual ~Animal(){
       cout << "Animal的析构是函数调用" << endl;
   }
   */

    // 纯虚析构:需要声明，也需要实现
    // 有了纯虚析构之后这个类也属于抽象类，无法实例化对象
    virtual ~Animal() = 0;

    // 纯虚函数
    virtual void speak() = 0;
};

Animal::~Animal(){
    cout << "Animal的纯虚析构函数实现" << endl;
}

class Cat : public Animal{
public:
    
    Cat(string name){
        cout << "Cat构造函数调用" << endl;
        Name = new string(name);
    }

    ~Cat(){
        if(Name != NULL){
            cout << "小猫死亡！" << endl;
            delete Name;
            Name = NULL;
        }
    }

    void speak(){
        cout << *Name << ":喵喵喵" << endl;
    }

    string* Name;
};

void test01(){
    Animal* p = new Cat("Tom");
    p->speak();
    delete p; // 父类指针在析构时候，不会调用子类中对应的析构函数，导致子类如果有堆区属性，会出现内存泄漏情况
}


int main(){
    test01();
    return 0;
}