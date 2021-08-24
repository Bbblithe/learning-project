#include "swap.h"
using namespace std;

int main(){
    int a = 100;
    int b = 0;
    cout << "a = " << a << endl;
    cout << "b = " << b << endl;

    swap(&a,&b);

    cout << "a = " << a << endl;
    cout << "b = " << b << endl;
    return 0;
}