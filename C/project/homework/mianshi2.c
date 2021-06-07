#include <stdio.h>

int i; // 全局变量 - 全局变量不初始化默认值是0

int main(){
    i--;
    // -1
    // 10000000000000000000000000000001 原码
    // 11111111111111111111111111111110 反码
    // 11111111111111111111111111111111 补码
    if( i > sizeof(i)){ // sizeof() - 计算变量/类型 所占内存大小 >= 0 无符号数
        printf(">\n");
    }else{
        printf("<\n");
    }
    return 0;
}