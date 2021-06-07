#include <stdio.h>

// int main(){
    
//     int a = 10 ;// 在内存里申请4个字节
//     int* p = &a; // 去地址
//     printf("%p\n",p);
//     *p = 20; // 解引用操作符
//     printf("%d\n",a);
//     // 有一种变量是用来存放地址的 - 指针变量
//     // printf("%p\n",&a);// 0x7ffee7b79768

//     return 0;
// }

// int main(){

//     char ch = 'w';
//     char* pc = &ch;
//     printf("%p\n",pc); // 0x7ffee6d3b76b
//     printf("%lu\n",sizeof(pc));//8 ,说明我的linux系统是x64位机器
//     // 32个bit位，因此32位平台，只需要4个字节 -- X32
//     // 64个bit位，因此64位平台，需要8个字节 -- X64
//     return 0;
// }

// int main(){
//     int a = 10;
//     int* p = &a; 

// }

// int main(){
//     int a = 0x11223344;
//     int* pa = &a;
//     // 解引用操作对饮其指针类型的直接大小控制
//     // int*的指针，则能够访问空间为4个字节大小
//     *pa = 0;
//     char* pc = &a;
//     // char*的指针，则只能够访问1个字节空间的大小
//     *pc = 0;
//     // printf("%p\n",pa);
//     // printf("%p\n",pc);
//     return 0;
// }

// int main(){
//     int a = 0x11223344;
//     int* pa = &a;
//     char* pc = &a;
//     printf("%p\n",pa);
//     printf("%p\n",pa+1);
//     printf("%p\n",pc);
//     printf("%p\n",pc+1);
// }

// int main(){
//     int arr[10] = {0};
//     * p = arr; // 数组名-首元素的地址
//     for(int i = 0 ; i < 10 ; i ++){
//         *(p + i) = 1;
//     }
//     return 0;
// }

// int main(){
//     //int a;// 局部变量不初始化，默认是随机值
//     int *p; // 局部指针变量，就被初始化随机值
//     *p = 20; // 这是一个野指针
//     return 0;
// }

// int main(){
//     int arr[10] = {0};
//     int *p = arr;
//     int i = 0;
//     for(i = 0 ; i < 12 ; i++){
//         p++;// 当指针指向的范围超出数组arr的范围时，p就是野指针
//     } 
//     return 0;
// }

// int* test(){
//     int a = 10;// 局部变量的创建，在方法调用结束时局部变量摧毁
//     return &a;// 返回的是局部变量的地址
// }

// int main(){
//     int* p = test(); // 接收到局部变量的地址
//     *p = 20;// 此时局部变量已经被释放了
//     return 0;
// }

// int main(){
//     // 未初始化的指针变量
//     int *p ; // 局部变量不初始化，里边放的是一个随机值
//     *p = 20;
//     printf("%d\n",*p);
//     return 0;
// }   

// int main(){
//     int* p = NULL; // NULL- 用来初始化指针的，给指针赋值
//     return 0;
// }   

// int main(){
//     int arr[10] = {1,2,3,4,5,6,7,89,9,10};
//     int sz = sizeof(arr)/sizeof(arr[0]);
//     int *p = arr;
//     for(int i = 0 ; i < sz ; i ++){
//         printf("%d ",*(p + i));
//     }
//     return 0;
// }

// int main(){
//     char ch[5] = {0};
//     int arr[10] = { 1, 2,3,4,5,6,7,8,90,10};
//     printf("%d\n",&arr[0] - &arr[9]);
//     printf("%d\n",&arr[9] - &ch[0]);// 报错
//     return 0;
// }
// int my_strlen(char* str){
//     char* strat = str;
//     char* end = str;
//     while(*end != '\0'){
//         end ++;
//     }
//     return end - strat;
// }


// int main(){
//     //strlen - 求字符串长度
//     // 递归 - 模拟实现了strlen - 计数器的方式1，递归的方式2
//     char arr[] = "bit";

//     int len = my_strlen(arr);
//     printf("%d\n",len);
//     return 0;
// }

// int main(){
//     int arr[10] = { 0 };
//     printf("%p\n",arr);// 地址-首元素的地址
//     printf("%p\n",arr + 1);

//     printf("%p\n",&arr[0]);
//     printf("%p\n",&arr[0] + 1);

//     printf("%p\n",&arr);
//     printf("%p\n",&arr+1);
//     // 1.&arr - &数组名：数组名这里不是首元素的地址，数组名表示整个数组 - &数组名 取出的是整个数组的地址
//     // 2.sizeof(arr) - sizeof(数组名) - 这里的数组名表的的是整个数组 - sizeof(数组名)计算的是整个数组的大小

//     return 0;
// }

// int main(){
//     int arr[10] = { 0 };
//     int* p = arr;
//     for(int i = 0 ; i < 10 ; i++){
//         *(p+i) = i;
//     }

//     for(int b = 0 ; b < 10 ; b ++ ){
//         printf("%d\n",*(p+b));
//     }
//     return 0;  
// }

// int main(){
//     int a = 10;
//     int* pa = &a ;
//     int** ppa = &pa;// ppa 就是二级指针
//     int*** pppa = &ppa;
//     printf("%p\n",pppa);
//     return 0;
// }

// 指针数组

int main(){
    int a = 10;
    int b = 20;
    int c = 30;
    // int* pa = &a;
    // int* pb = &b;
    // int* pc = &c;

    // 整形数组 - 存放整形
    // 字符数组 - 存放字符
    // 指针数组 - 存放指针
    // int arr[10];
    int* arr2[10] = {&a, &b ,&c}; // 指针数组
    for (int i = 0 ; i < 3 ; i ++){
        printf("%d\n",*arr2[i]);
    }
    return 0;
}