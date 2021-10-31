#include <iostream>
using namespace std;
template<typename NameType,typename Agetype>
class Person{
public:
    Person(NameType Name , Agetype age){
        this->Name = Name;
        this->age = age;
    }
    
    void showPerson(){
        cout << "name: " << this->Name << " age : " <<  this->age << endl;
    }

    NameType Name;
    Agetype age;

};

void test1(){
    Person<string,int> p("孙悟空",999);
    p.showPerson();
}

int main(){
    test1();
    return 0;
}