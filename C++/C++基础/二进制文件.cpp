#include <iostream>
#include <fstream>
using namespace std;

class Person{
public:
    int age;
    char Name[64];

    Person(const char Name[],int age){
        this->age = age;
        strcpy(this->Name,Name);
    }
};

void test01(){
    /*
    ofstream ofs;
    ofs.open("person.txt",ios::out|ios::binary);
    */
    // 上面两个句子等同于
    ofstream ofs("person.txt",ios::out|ios::binary);
    Person p = Person("zhangsan",19);
    ofs.write((const char*)&p ,sizeof(Person));

    ofs.close(); 
}


int main(){
    test01();
    return 0;
}