#include <iostream>
using namespace std;

class Calculator{
public:

    int getResult(string oper){
        if("+" == oper){
            return num1 + num2;
        }else if("-" == oper){
            return num1 - num2;
        }else if("*" == oper){
            return num1 * num2;
        }
        return 0;
    }

    int num1; // 第一位
    int num2; // 第二位
};

void test1(){
    Calculator c;
    c.num1 = 10;
    c.num2 = 20;

    cout << c.num1 << " + " << c.num2 << " = " << c.getResult("+") << endl;
    cout << c.num1 << " - " << c.num2 << " = " << c.getResult("-") << endl;
    cout << c.num1 << " * " << c.num2 << " = " << c.getResult("*") << endl;
}

// 利用多态实现计算器
// 多态好处：1、组织结构清晰  2、可读性强 3、对于前期和后期扩展和维护性高
class AbstractCalculator{
public:

    virtual int getResult(){
        return 0;
    }

    int num1;
    int num2;
};

// 加法计算器类
class AddCalculator : public AbstractCalculator{
public:
    int getResult(){
        return num1 + num2 ;
    }
};

// 减法计算器类
class SubCalculator : public AbstractCalculator{
public:
    int getResult(){
        return num1 - num2;
    }
};

// 乘法计算器类
class MulCalculator : public AbstractCalculator{
public:
    int getResult(){
        return num1 * num2;
    }
};

void test2(){
    // 多态的使用条件
    // 父类指针或者引用指向子类对象
    AbstractCalculator* as = new AddCalculator;
    as->num1 = 100;
    as->num2 = 20;

    cout << as->num1 << " + " << as->num2 << " = " << as->getResult() << endl;
    // 用完后记得销毁
    delete as;

    AbstractCalculator* sm = new SubCalculator;
    sm->num1 = 200;
    sm->num2 = 300;
    cout << sm->num1 << " - " << sm->num2 << " = " << sm->getResult() << endl;
    delete sm;

    // 乘法
    sm = new MulCalculator;
    sm->num1 = 200;
    sm->num2 = 300;
    cout << sm->num1 << " * " << sm->num2 << " = " << sm->getResult() << endl;
    delete sm;
}

int main(){
    // test1();
    test2();
    return 0;
}