#include <iostream>
// 包含头文件
#include <fstream>
using namespace std;

class Person{
public:
    char Name[64];
    int age;

    Person(){
        age = 0;
    }

    Person(const char Name[],int age){
        strcpy(this->Name,Name);
        this->age = age;
    }
};

void test01(){
    // 创建流对象
    ifstream ifs;
    ifs.open("person.txt",ios::in|ios::binary);
    if(!(ifs.is_open())){
        cout << "文件打开失败" << endl;
        return ;
    }

    Person p ;
    ifs.read((char*)&p , sizeof(Person));

    cout << "姓名:" << p.Name << "年龄：" << p.age << endl;

    ifs.close();
}

int main(){
    test01();
    return 0;
}