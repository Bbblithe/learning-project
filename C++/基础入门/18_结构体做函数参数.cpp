#include <iostream>
using namespace std;

struct Student{
    string name;
    int id ;
    int age;
};

void printStudent1(Student s){// 打印学生信息函数
    cout << "姓名："<<s.name << " 学号：" <<s.id << " 年龄：" <<s.age << endl;
}

void printStudent2(Student* s){
    cout << "姓名："<< s->name << " 学号：" << s->id << " 年龄：" << s->age << endl;
}

int main(){
    // 结构体做函数参数
    // 将学生传入到一个参数中，打印学生身上所有的信息

    // 创建结构体变量
    Student s;
    s.name = "徐文杰";
    s.age = 18;
    s.id = 2015022136;

    // cout << "main函数中打印的结果 姓名：" << s.name << " 年龄：" << s.age << " 学号：" << s.id << endl;
    printStudent1(s);
    printStudent2(&s);
    return 0;
}