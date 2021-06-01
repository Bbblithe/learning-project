#include <stdio.h>
#include <string.h>


// 书类
struct Book{
    char name[20]; // C语言程序设计
    short price;
};

int main(){
    // 利用结构体类型，创建一个该类型的变量
    struct Book b1 = {"C语言程序设计",55};

    // 修改基本类型可以直接使用
    b1.price = 30;

    // 但是这里的name 是一个char数组，因此name属性的修改需要改char数组的值
    // 一个一个遍历修改太复杂了，通过string.h库函数中的函数
    // strcpy()

    strcpy(b1.name,"C++");
    printf("%s\n",b1.name);



    struct Book* b1address = &b1;
    printf("%s\n",b1address->name);
    printf("%d\n",b1address->price); // 通过指针访问其属性
    printf("书名:%s\n",b1.name);
    printf("价格:%d元\n",b1.price);
    b1.price = 10;
    printf("降价后价格:%d\n",b1.price);
}
