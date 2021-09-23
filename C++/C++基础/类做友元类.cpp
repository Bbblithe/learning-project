#include <iostream>
using namespace std;

class Building{
    friend class Goodguy;
public:
    Building();

public :
    string SittingRoom;// 客厅

private :
    string BedRoom;
};

// 类外写成员函数
Building::Building(){
    SittingRoom = "客厅" ;
    BedRoom = "卧室" ;
}

// 类做友元
class Goodguy{
public :
    Goodguy();

    void visit(); // 参观函数 访问Building中的属性

    Building * building;
};

Goodguy::Goodguy(){
    // 创建建筑物对象
    building = new Building; // new 什么数据类型就返回什么类型指针    
}

void Goodguy::visit(){
    cout << "好基友类正在访问：" << building->SittingRoom << endl;
    cout << "好基友类正在访问：" << building->BedRoom << endl;
}

void test01(){
    Goodguy gg = Goodguy();
    gg.visit();
}

int main(){
    test01();
    return 0;
}