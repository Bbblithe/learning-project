#include <iostream>
using namespace std;

// 定义学生结构体
struct Student {
    string name;
    int age;
    int id;
};

int main(){
    // 创建学生结构体变量
    Student s = {"徐文杰",18,2015022136};

   // 通过指针指向结构体变量
    Student* sp = &s;

    // 通过指针访问结构体变量中的数据
    // 通过结构体指针访问结构体中的属性，需要使用"->"访问
    cout << "姓名：" << sp->name << " 年龄：" << sp->age << " 学号：" << sp->id << endl; 
    return 0;
}