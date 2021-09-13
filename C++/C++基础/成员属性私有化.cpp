#include <iostream>
using namespace std;

// 成员属性设置为私有
// 1、可以自己控制读写权限
// 2、对于写可以检测数据有效性

// 类 
class Person{
public :
    void setName(string p_name){
        name = p_name;
    }

    string getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    // 设置年龄
    void setAge(int Page){
        if(Page > 0 && Page < 150){
            age = Page;
        }else{
            age = 0;
        }
    }

    void setLover(string love){
        lover = love;
    }

private:
    string name; // 可读可写
    int age; // 只读
    string lover; // 只写
};

int main(){
    Person p ;
    p.setName("Blithe");
    cout << "姓名为：" << p.getName() << endl;
    cout << "年龄为" << p.getAge() << endl;
    p.setLover("李佳燕"); // 数据不可以访问，仅可以设置
    p.setAge(1000);
    cout << "年龄为" << p.getAge() << endl;
    return 0;
}