#include <iostream>
using namespace std;

// 默认情况下 输出一个小数，会显示出6位有效数字
int main(){
    double Pi = 3.1415926;
    cout << "PI = " << Pi << endl;

    // 科学计数法
    float f2 = 3e2; // 3 * 10^2 
    cout << "f2 = " << f2 << endl ;

    float f3 = 3e-2; // 3 * 10^-2
    cout << "f3 = " << f3 << endl;
    return 0;
}