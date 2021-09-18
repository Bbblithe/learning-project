#include <iostream>
using namespace std;

// 建筑物
class Building{
    // goodGuy全局函数加入友元，可以直接访问私有成员
    friend void goodGuy(Building b);
public:

    Building(){
        SittingRoom = "客厅";
        BedRoom = "卧室";
    }

    string SittingRoom; // 客厅
private:
    string BedRoom; // 卧室
};

// 全局函数
void goodGuy(Building b){
    cout << "好基友的全局函数正在访问" << b.SittingRoom << endl;
    cout << "好基友的全局函数正在访问" << b.BedRoom << endl;
}

void test01(){
    Building b;
    goodGuy(b);
}

int main(){
    test01();
    return 0;
}