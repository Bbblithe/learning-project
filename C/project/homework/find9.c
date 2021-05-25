#include <stdio.h>
/* 
    找出1-100中有多少个数字包含9;
*/

int main(){
    int i = 0,count = 0;
    for(i = 1; i <= 100; i ++){
        if(i % 10 == 9 || i / 10 == 9){
            count ++;
        }
    }
    printf("%d\n",count);
    return 0;
}