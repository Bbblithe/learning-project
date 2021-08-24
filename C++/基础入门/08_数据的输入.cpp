#include <iostream>
using namespace std;

int main(){
    // 1、整形输入
    int a = 0;
    cout << "请给整形变量a赋值：";
    cin >> a;
    cout << "您输入a的值是" << a << endl;

    // 2、浮点型
    float f = 3.14f;
    cout << "请给浮点型变量f赋值" ;
    cin >> f;
    cout << "您输入f的值是" << f << endl;

    // 剩余类型同理
    return 0;
}