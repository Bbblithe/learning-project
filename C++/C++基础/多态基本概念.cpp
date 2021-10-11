#include <iostream>
using namespace std;

// 多态

// 动物类
class Animal{
public:
    // 虚函数
    virtual void speak(){
        cout << "动物在说话" << endl;
    }
};

class Cat :public Animal{
public:
    void speak(){
        cout << "喵喵喵" << endl; 
    }
};

class Dog : public Animal{
public:
    // 重写 函数返回值类型 函数名 参数列表 完全相同，方法体不同
    virtual void speak(){ // 这里的virtual可以写也可以不写
        cout << "汪汪汪" << endl;
    }
};

// 执行说话
// 地址早绑定，在编译阶段就确定了函数的地址
// 如果想执行子类说话，这个函数的地址就不能提前绑定，需要在进行阶段进行绑定，地址晚绑定

// 动态多态满足条件
// 1、有继承关系
// 2、子类重写父类的虚函数

// 动态多态使用
// 父类的指针活着引用 执行子类对象

void doSpeak(Animal& animal){ // Animal& animal = Cat cat;
    animal.speak();
}

void test01(){
    Cat cat = Cat();
    doSpeak(cat);

    Dog dog;
    doSpeak(dog);
}

int main(){
    test01();
    return 0;
}