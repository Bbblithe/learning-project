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

int main(){

    char ch = 'w';
    char* pc = &ch;
    printf("%p\n",pc); // 0x7ffee6d3b76b
    printf("%lu\n",sizeof(pc));//8 ,说明我的linux系统是x64位机器
    // 32个bit位，因此32位平台，只需要4个字节 -- X32
    // 64个bit位，因此64位平台，需要8个字节 -- X64
    return 0;
}