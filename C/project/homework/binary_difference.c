#include <stdio.h>

int get_diff_bit(int m ,int n){
    int count = 0;
    int temp = m^n;
    while(temp){
        temp = temp & temp-1;
        count ++;
    }
    return count;
}

int main(){
    int m = 0 ;
    int n = 0 ;
    scanf("%d%d",&m,&n);
    int count = get_diff_bit(m , n);

    printf("count = %d\n",count);
    return 0;
}