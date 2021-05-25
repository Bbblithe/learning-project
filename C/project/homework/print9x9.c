#include <stdio.h>
/*
    打印9x9乘法表
*/

int main(){
    int out,in;
    for(out = 1 ; out <= 9 ; out++){
        for(in = out ; in > 0 ; in --){
            printf("%d*%d=%-2d  ",out,in,out*in);
        }
        printf("\n");
    }
}