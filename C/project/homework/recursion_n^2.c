#include <stdio.h>

double Pow(int n , int k){
    if(k < 0){
        return (1.0 / (Pow(n, -k)));
    }
    if(k > 0){
        return n * Pow(n , k -1);
    }
    return 1;
}

int main(){
    int n,k;
    scanf("%d %d",&n,&k);
    printf("%f\n",Pow(n,k));
}