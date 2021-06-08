#include<stdio.h>

// int count_bit_one(unsigned int a){
//     int count = 0;
//     while(a){
//         if(a % 2 == 1){
//             count ++;
//         }
//         a /= 2;
//     }
//     return count;
// }

// int count_bit_one(int a){
//     int count = 0;
//     for(int i = 0 ; i < 32 ; i++){
//         count += a&1;
//         a>>=1;
//     }
//     return count;
// }

int count_bit_one(int a){
    int count = 0;
    while(a){
        a = a & (a - 1);
        count++;
    }
    return count;
}

// 13
// n & (n - 1)
// 1101 n 
// 1100 n -1
// 1100 n
// 1011 n - 1
// 1000 n 
// 0111 n - 1
// 0000 n


int main(){
    int a = 13;
    scanf("%d",&a);
    // 写一个函数求a的二进制（补码）表示中有几个1
    int count = count_bit_one(a);
    printf("count = %d\n",count);
    return 0;
}