#include <iostream>
using namespace std;
#define H 5

struct Hero{
    string name;
    int age;
    bool sex;
};

void bubleSort(Hero heros[]){
    for(int i = 0 ; i < H - 1 ; i ++){
        for(int j = 0 ; j < H - i -1 ; j ++){
            if(heros[j].age < heros[j + 1].age){
                Hero temp = heros[j];
                heros[j] = heros[j + 1];
                heros[j + 1] = temp;
            }
        }
    }
}

void printHeros(Hero heros[]){
    for(int i = 0 ; i < H ; i ++){
        cout << "姓名：" << heros[i].name << " 性别：" << ((heros[i].sex)?"男":"女") << " 年龄：" << heros[i].age << endl;
    }   
}


int main(){
    // 创建英雄对象数组
    Hero heros[H] =  {{"张飞",26,1},{"关雨",78,1},{"貂残",18,0},{"黄忠",68,1},{"小巧",14,0}};
    printHeros(heros);
    bubleSort(heros);
    cout << "冒泡排序之后========================================" << endl;
    printHeros(heros);
    return 0;
}