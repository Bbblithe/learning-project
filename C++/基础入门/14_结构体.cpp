#include <iostream>
using namespace std;

// 1、创建学生数据类型：学生包括（姓名，年龄，分数）
// 自定义数据类型，一些类型集合组成的一个类型
// 语法 struct类型名称 {成员列表};
struct Student {
    // 姓名
    string name;

    // 年龄
    int age;

    // 分数
    double score;
}s3; // 顺便创建结构体变量

// 2、通过学生类型创建具体学生(创建对象时，结构体关键值struct可以省略)

int main(){

    // 1.struct Student s1;
    struct Student s1;
    // 给s1属性赋值，通过.访问结构体变量中的属性
    s1.name = "张三";
    s1.age = 18;
    s1.score = 99.3;

    cout << "s1的姓名" << s1.name << "，s1的年龄:" << s1.age << "，s1的分数:" << s1.score << endl;
    
    // 2.struct Studetn s2 = {...};
    Student s2 = {"徐六",18,100};
    cout << "s2的姓名" << s2.name << "，s2的年龄:" << s2.age << "，s2的分数:" << s2.score << endl;

    // 3.在定义结构体是顺便创建结构体变量
    s3.name = "王五";
    s3.age = 20;
    s3.score = 60;
    cout << "s3的姓名" << s3.name << "，s3的年龄:" << s3.age << "，s3的分数:" << s3.score << endl;
    return 0;
}