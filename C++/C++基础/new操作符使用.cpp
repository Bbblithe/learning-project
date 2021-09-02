#include <iostream>
using namespace std;

// 1、new的基本语法
int* func(){
    // 在堆区创建整形数据
    // new返回的是该数据类型的指针
    int* p1 = new int(10);
    cout << "func函数中的p1:" << p1 << endl;
    return p1;
}

 void test01(){
    int* p2 = func();
    cout << *p2 << endl;
    // 堆区的数据 由程序员管理开辟，管理释放
    // 如果想释放堆区的数据，利用关键字 delete
    
    cout << "test01()函数中的p2:" << p2 << endl; // 内存已经被释放，再次访问就是非法操作，会报错！
    cout << *p2 << endl;

    delete p2;

    cout << "释放内存空间站之后的p2:" << p2 << endl;
}

// 在堆区利用new开辟数组
void test02(){
    // 创建10 个整形的数组，在堆区(heap)
    int* array = new int[10]; // 10代表数组中有10个元素

    for(int i = 0 ; i < 10 ; i++ ){
        array[i] = i + 100; // 给10个元素赋值， 100 ～ 109
    }

    for(int i = 0 ; i < 10 ; i ++){
        cout << array[i] << endl;
    }
    // 释放堆区数组
    // 释放数组的时候，需要加上[才可以
    delete[] array;
}

int main(){
    test02();
    return 0;
}