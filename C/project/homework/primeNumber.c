#include <stdio.h>
#include <math.h>

/*
    打印100到200之间的所有素数
*/

// 暴力求解法:试除法
// int main(){
//     int i , a ;
//     for(i = 0 ; i <= 200; i ++){
//         // 判断i是否为素数
//         for(a = 2 ; a < i ; a++ ){
//             if(!(i % a)){
//                 break;
//             }
//         }
//         if(a == i){
//             printf("%d ",i);
//         }
//     }
//     return 0;
// }

// "开方" 法
// int main(){
//     int i;
//     for( i = 0 ; i <= 200; i ++){
//         int j;
//         for(j = 2 ; j <= sqrt(i); j ++){
//             if(!(i%j)){
//                 break;
//             }
//         }
//         if( j > sqrt(i)){
//             printf("%d ",i);
//         }
//     }
// }

// 优化
int main(){
    int i;
    for( i = 101 ; i <= 200; i+=2 ){
        int j;
        for(j = 2 ; j <= sqrt(i); j ++){
            if(!(i%j)){
                break;
            }
        }
        if( j > sqrt(i)){
            printf("%d ",i);
        }
    }
}

