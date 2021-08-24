#include "swap.h"

// 函数的定义
void swap(int* a, int* b){
    int tmep = *a ;
    *a = *b;
    *b = tmep;
}