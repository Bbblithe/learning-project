#include <stdio.h>

int main(){
    int m = 666;
    int n = 18;
    scanf("%d%d",&m,&n);
    while(m % n){
        int temp = n;
        n = m%n;
        m = temp;
    }
    printf("%d\n",n);
}