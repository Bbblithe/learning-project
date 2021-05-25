#include <stdio.h>

int main(){
    int ch = 0;
    // 键盘上输入 "control + Z "时，getchar则会自动自动结束
    // EOF - end of file 文件结束标志-> -1
    while((ch = getchar()) != EOF){
        putchar(ch);
    }
    // putchar(ch);
    return 0;
}