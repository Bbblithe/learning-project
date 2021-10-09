#include <iostream>
using namespace std;

// 钻石继承
class Animal{
public:

    Animal(){
        age = 1;
    }
    int age;
};

// 利用虚继承，解决菱形继承的问题
// 继承之前 加上关键字 virtual变为虚继承
// Animal类称为 虚基类

class Sheep:virtual public Animal{
};

class Camel:virtual public Animal{
};

class Grass_Mud_Horse:public Sheep , public Camel{
};

void test01(){
    Grass_Mud_Horse cnm;
    cnm.Sheep::age = 18;
    cnm.Camel::age = 19;

    // 当菱形进程，两个父类拥有相同数据，需要加以作用域区分
    cout << "cnm.Sheep::age = " << cnm.Sheep::age << endl;
    cout << "cnm.Camel::age = " << cnm.Camel::age << endl;
    cout << "cnm.age = " << cnm.age << endl;

    // 这份数据我们知道，只有一份就可以了，菱形继承导致数据有两份，资源浪费
}

int main(){
    test01();
    return 0;
}