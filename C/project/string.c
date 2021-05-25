#include <stdio.h>
#include <string.h>

// int main(){
//     char arr1[] = "abc"; // 使用数组存储这个字符串
//     //"abc" == 'a' 'b' 'c' '\0' --- '\0'字符串的结束标志

//     // char arr2[] = {'a','b','c'};
//     char arr2[] = {'a','b','c','\0'};

//     printf("%s\n",arr1);// abc
//     // printf("%s\n",arr2);// abcabc.
//     printf("%s\n",arr2);// abc
// }

int main(){
    char arr1[] = "abc";
    char arr2[] = {'a','b','c','\0'};
    int arr1length = strlen(arr1);
    int arr2length = strlen(arr2); // 如果shu
    printf("%d\n",arr1length);
    printf("%d\n",arr2length);
}