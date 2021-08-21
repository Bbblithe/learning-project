#include <iostream>
using namespace std;

struct Teacher{
    int id;
    string name;
};

struct Student{
    int id;
    string name;
    Teacher tc;
};

int main(){
    Teacher t = {2015022136,"赖祥军"};
    Student stu = {18,"徐文杰",t};
    cout << "学生" << stu.name << "的老师是" << stu.tc.name << endl;
    cout << "老师编号" << stu.tc.id << endl;
    return 0;
}