#include <iostream>
using namespace std;

const double PI = 3.14;

// 设计一个圆类，求圆的周长
// 圆求周长的公式： 2 * PI * R

// class 代表设计一个类，类后面紧跟着就是类名称
class Circle{
    // 访问权限
    public:

    // 属性
    // 半径
    int m_r;

    // 行为
    // 获取圆的周长
    double calclulateZC(){
        return 2 * PI * m_r;
    }
};

class Stu{
    public :

    // 类中的属性和行为我们统一称为成员

    // 属性：成员属性，成员变量
    // 行为： 成员函数 成员方法

    int no;
    string name;

    void setNo(int s_no){
        no = s_no;
    }

    void setName(string s_name){
        name = s_name;
    }

    void printStu(){
        cout << "学号:" << no << endl;
        cout << "姓名：" << name << endl;
    }
};

int main(){
    // 通过圆类，创建具体的圆（对象）
    // 实例话（通过一个类 创建一个对象的过程）
    Circle c1;
    // 给c1圆的半径属性赋值
    c1.m_r = 10;

    cout << "圆的周长 = " << c1.calclulateZC() << endl;

    Stu s1; 
    s1.setName("Blithe");
    s1.setNo(2015022136);

    s1.printStu();
    return 0;
}