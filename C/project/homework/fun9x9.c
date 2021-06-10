#include <stdio.h>

void print_table(int n){
    
    for(int i = 1; i <= n ; i ++){// 控制行
        for(int j = 1; j <= i ; j++){
            printf("%d*%d=%-3d ",i,j,i*j);
        }
        printf("\n");
    }
}

int main(){
    int a;
    scanf("%d",&a);
    print_table(a);
    return 0;
}