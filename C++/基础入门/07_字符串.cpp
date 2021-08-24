#include <iostream>
#include <string> // 在C++11 库中已经默认引入 string，所以可以不引用

using namespace std;

int main(){
    // 1、C风格字符串
    // (其实就是用一个字符数组接收)
    char str[] = "hello 你好";
    cout << str << endl;

    // 2、C++风格字符串
    string str2 = "你好中国！";
    cout << str2 << endl;
    return 0;
}