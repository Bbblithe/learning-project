#include <stdio.h>

void print_oddAndEven(int a){
    printf("odd : ");
    for(int i = 30 ; i >= 0 ; i-= 2){
        printf("%d ",(a >> i) & 1);
    }
    printf("\n");
    printf("even : ");
    for(int i = 31; i >= 1; i -= 2){
        printf("%d ",(a >> i) & 1);
    }
    printf("\n");
}

int main(){
    int m = 0 ;
    scanf("%d",&m);
    print_oddAndEven(m);
    return 0;
}