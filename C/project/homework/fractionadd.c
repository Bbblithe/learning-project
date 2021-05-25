#include <stdio.h>
/*
求出1/1 - 1/2 + 1/3 - 1/4 .... + 1/99 - 1/100
*/
int main(){
    int i = 0 ;
    double sum = 0;
    for(i = 1; i <= 100 ; i ++){
        if(i % 2){
            sum += 1.0/i;
        }else{
            sum -= 1.0/i;
        }
    }
    printf("%f\n",sum);
    return 0;

}