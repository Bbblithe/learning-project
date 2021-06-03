#include <stdio.h>

// int main(){
    
//     int a = 10 ;// 在内存里申请4个字节
//     int* p = &a; // 去地址
//     printf("%p\n",p);
//     *p = 20; // 解引用操作符
//     printf("%d\n",a);
//     // 有一种变量是用来存放地址的 - 指针变量
//     // printf("%p\n",&a);// 0x7ffee7b79768

//     return 0;
// }

// int main(){

//     char ch = 'w';
//     char* pc = &ch;
//     printf("%p\n",pc); // 0x7ffee6d3b76b
//     printf("%lu\n",sizeof(pc));//8 ,说明我的linux系统是x64位机器
//     // 32个bit位，因此32位平台，只需要4个字节 -- X32
//     // 64个bit位，因此64位平台，需要8个字节 -- X64
//     return 0;
// }

// int main(){
//     int a = 10;
//     int* p = &a; 

// }

// int main(){
//     int a = 0x11223344;
//     int* pa = &a;
//     // 解引用操作对饮其指针类型的直接大小控制
//     // int*的指针，则能够访问空间为4个字节大小
//     *pa = 0;
//     char* pc = &a;
//     // char*的指针，则只能够访问1个字节空间的大小
//     *pc = 0;
//     // printf("%p\n",pa);
//     // printf("%p\n",pc);
//     return 0;
// }

// int main(){
//     int a = 0x11223344;
//     int* pa = &a;
//     char* pc = &a;
//     printf("%p\n",pa);
//     printf("%p\n",pa+1);
//     printf("%p\n",pc);
//     printf("%p\n",pc+1);
// }

int main(){
    int arr[10] = {0};
    int* p = arr; // 数组名-首元素的地址

    return 0;
}