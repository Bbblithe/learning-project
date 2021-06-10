#include <stdio.h>

int DigitSum(unsigned int num){
    if(num >= 10){
        return DigitSum(num / 10) + num % 10;
    }
    return num; 
}

int main(){
    unsigned int num = 0 ;
    scanf("%d",&num);
    printf("ret = %d\n",DigitSum(num));
    return 0;
}