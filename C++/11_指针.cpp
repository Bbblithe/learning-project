#include <iostream>
using namespace std;

int main(){
    // 1、定义一个指针
    int a = 10;
    // 指针定义的语法：数据类型*指针变量名
    int* p = &a;

    cout << "p的实际值:" << p << endl;
    cout << "地址a:" << &a << endl;

    // 2、使用指针
    *p = 1000;
    cout << "a = " << a << endl;
    cout << "*p = " << *p << endl;

    // 指针在32位操作系统下：占用4个字节，在64位操作系统下所占用字节为8
    // 同一操作系统下，不管什么类型的指针都是相同的字节大小
    cout << "sizeof int* = " << sizeof(p) << endl;

    //空指针
    // 1、空指针用于给指针变量进行初始化
    int* p = NULL;

    // 2、空指针是不可进行访问的
    // 0～255之间的内存编号是系统占用的，因此不可以访问
    *p = 100;

    //野指针:指针指向一块非法的空间
    // 在程序中应该尽量避免野指针
    int* pin = (int* )0x1100ace3;

    cout << *pin << endl;
    return 0;
}