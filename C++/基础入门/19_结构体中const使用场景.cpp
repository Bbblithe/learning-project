#include <iostream>
using namespace std;

struct Student{
    string name;
    int age;
    int score;
};

// 将函数中的形参改为指针，可以减少内存空间，而且不会赋值新的副本出来
// 在结构体指针前加const，变成常量指针，一旦有修改的操作就会报错，因此当需求只需要读时，不能写时，就能通过编译器报错提醒
void printStudentInfo(const Student* s){
    cout << "姓名：" << s->name << " 年龄：" << s->age << " 得分：" << s->score << endl;
}

int main(){
    // 创建结构体变量
    Student s = {"张三",19,70};

    // 通过函数打印结构体变量信息
    printStudentInfo(&s);
    return 0;
}