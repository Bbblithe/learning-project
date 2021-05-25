#include <stdio.h>

int main(){
    int sum = 1;
    int n = 1 ;

    while(n <= 100){
        sum*=n;
        n++;
    }
    printf("%d\n",sum);
    return 0;
}