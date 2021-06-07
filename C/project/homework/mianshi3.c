#include <stdio.h>

int main(){
    int a , b, c;
    a = 5;
    c = ++a; // a = 6 , c = 6
    b = ++c,c++,++a,a++; // c = 8 , b = 7 , a = 8
    b += a++ + c; // b=7+16=23 a = 9 c = 8
    printf("a = %d b = %d c = %d\n",a,b,c);
    return 0;
}