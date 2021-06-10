#include <stdio.h>
#include <string.h>

int my_strlen(char* str){
    int count = 0;
    while(*str != '\0'){
        count ++;
        str++;
    }
    return count;
}

// void reverse_string(char arr[]){
//     int left = 0;
//     int right = my_strlen(arr) - 1;
//     while(left < right){
//         int temp = arr[left];
//         arr[left++] = arr[right];
//         arr[right--] = temp;
//     }
// }

// int main(){
//     char arr[] = "abcdef";
//     reverse_string(arr);
//     printf("%s",arr);
//     return 0;
// }

void reverse_string(char arr[]){
    char temp = arr[0];
    int len = my_strlen(arr);
    arr[0] = arr[len - 1];
    arr[len - 1] = '\0';
    if(my_strlen(arr + 1) >= 2){
        reverse_string(arr+1);
    }
    arr[len - 1] = temp;
}

int main(){
    char arr[] = "abcdefgcadf";
    reverse_string(arr);
    printf("%s\n",arr);
    return 0;
}