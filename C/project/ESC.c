#include <stdio.h>
#include <string.h>

// 转义字符讲解
int main(){
    // printf("abc\n"); // '\' 就是一个 转义字符
    // printf("c:\\test\\32\\test.c\n"); // 这里由于\t 变成了一个换行符
    // printf("%c\n",'\'');
    // printf("%s\n","\"");
    // return 0;

    // printf("%lu\n",strlen("c:\test\382\test.c"));
    // \32 -- 32是两个八进制数字
    // 32 作为8进制代表的那个十进制数字，作为ASCII码值
    // 32 -- > 10进制 26 - 作为ASCII码代表的字符
    printf("%c\n",'\x61');
    return 0;
}