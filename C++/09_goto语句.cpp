#include <iostream>
using namespace std;

int main(){
    // goto 语句 （不建议使用）
    cout << "你好" << endl;

    cout << "我是blithe" << endl;

    goto FLAG;

    cout << "我是傻逼" << endl;

    cout << "也是傻逼" << endl;

    FLAG:

    cout << "再见" << endl;
    return 0;
}