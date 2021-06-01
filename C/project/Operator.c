#include <stdio.h>


// int main(){
//     short a = 0;
//     int b = 10;
//     printf("%lu",sizeof(a = b + 5)); // 这里a是多少sizeof还是由a来决定的
//     printf("%d",a); // 结果是0，因为sizeof函数里的运算式并不会执行
//     return 0;
// }

// int main(){
//     int a = 11;
//     a |= (1 << 2);
//     printf("%d\n",a);
//     a &= (~(1 << 2));
//     printf("%d\n",a);
//     // 00000000000000000000000000001011
//     // 按位或以下，数字则可以将11二进制 的第三位0 变为1
//     // 00000000000000000000000000000100

//     // int a = 0 ;
//     // // ~ 按(2进制)位取反
//     // // 00000000000000000000000000000000
//     // // 上面0取反得到下面
//     // // 11111111111111111111111111111111 - 补码
//     // // 11111111111111111111111111111110 - 反码
//     // // 10000000000000000000000000000001 - 原码
//     // // -1
//     // printf("%d\n",~a); // 打印的是原码

//     return 0;
// }

// int main(){
//     int a = 10;
//     printf("%d\n",++a);// 前置++，后使用，先加一
//     printf("%d\n",a++);// 后置++，先使用，后加一
//     return 0 ;
// }

// int main(){
//     int a = (int)3.14;
//     return 0 ;
// }

void test1(int arr[]){
    printf("%lu\n",sizeof(arr));
}
void test2(char ch[]){
    printf("%lu\n",sizeof(ch));
}

int main(){
    int arr[10] = {0};
    char ch[10] = {0};
    printf("%lu\n",sizeof(arr));
    printf("%lu\n",sizeof(ch));
    test1(arr);
    test2(ch);
    return 0 ;
}