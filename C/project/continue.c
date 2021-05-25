#include <stdio.h>

int main(){
    int i = 0;

// 死循环
    // while (i <= 10 ){
    //     if(i == 5){
    //         continue;
    //     }
    //     printf("%d\n",i);
    //     i++;
    // }

    while( i <= 10){
        i++;
        if(i == 5){
            continue;
        }
        printf("%d\n",i);
    }
}