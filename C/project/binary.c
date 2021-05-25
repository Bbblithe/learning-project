#include <stdio.h>

int main(){
    int a[] = {1,2,3,4,6,7,8,9,10};
    int key,mid;
    int lowerBound = 0;
    int upperBound = (sizeof(a)/sizeof(a[1])-1); // 计算元素个数，-1则是最大值下标
    scanf("%d",&key);

    // int flag = 0; // 可以通过布尔标记，但是空间复杂度上升。
    while(lowerBound <= upperBound){
            mid = (lowerBound+upperBound)/2;
            if(key < a[mid]){
                upperBound = mid-1;
            }else if(key == a[mid]){
                printf("该元素下标为%d\n",mid);
                // flag = 1;
                break;
            }else{
                lowerBound = mid+1;
            }
    }
    // if(flag == 0){
    //     printf("不好意思，数组中不存在该元素\n");
    // }
    if(lowerBound > upperBound){
        printf("不好意思，数组中不存在该元素\n");
    }
    return 0;
}