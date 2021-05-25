#include <stdio.h>

int main(){
    int year = 0;
    int count = 0;
    for(year = 100 ; year <= 2000; year++){
        // 判断yaer是否为闰年
        // 1.能被4整出并且不能被100整除是闰年
        // 2.能被400整除是闰年
        if(!(year%400) || (!(year % 4) && year % 100)){
            printf("%d\n",year);
            count++;
        }
    }
    printf("总共有%d\n",count);
    return 0;
}