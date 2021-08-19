#include <iostream>
using namespace std;

// 结构体数组


// 1、定义结构体
struct Student{
    string name;
    int age;
    int id;
};

int main(){
    // 2、创建结构体数组
    struct Student stuArray[3] = {
            {"李四",18,2015022136},
            {"张三",28,2015022137},
            {"王五",38,2015022139}
        };
    // 3、给结构体数组的元素赋值
    stuArray[0].name = "徐文杰";

    // 4、遍历结构体数组
    for(int i = 0 ; i < 3 ; i ++ ){
        cout << "姓名：" << stuArray[i].name << " 年龄：" << stuArray[i].age << " 学号：" << stuArray[i].id << endl;
    }    

    return 0;
}