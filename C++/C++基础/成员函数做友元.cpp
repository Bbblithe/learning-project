#include <iostream>

using namespace std;

class Building;

class GoodGuy{
public:
    GoodGuy();

    void visit(); // 让visit函数可以访问Building中私有成员
    void visit2(); // 不可以访问Building中私有成员

    Building* building;
};

class Building{

    friend void GoodGuy::visit();

public :
    Building();
public :
    string SittingRoom;
private :
    string BedRoom;
};

// 类外实现成员函数
Building::Building(){
    SittingRoom = "客厅" ;
    BedRoom = "卧室" ;
}

GoodGuy::GoodGuy(){
    building = new Building;
}

void GoodGuy::visit(){
    cout << "visit函数正在访问" << building->SittingRoom << endl;
    cout << "visit函数正在访问" << building->BedRoom << endl;
}

void GoodGuy::visit2(){
    cout << "visit02函数正在访问" << building->SittingRoom << endl;
}

void test01(){
    GoodGuy gg = GoodGuy();
    gg.visit();
    gg.visit2();
}

int main(){
    test01();
    return 0;
}