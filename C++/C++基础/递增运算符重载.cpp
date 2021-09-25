#include <iostream>
using namespace std;

// 重载递增运算符

// 自定义整形
class Integer{
    friend ostream& operator<<(ostream& cout,Integer i);
public :
    Integer(){
        number = 0;
    }

    // 重载前置++运算符
    Integer& operator++(){
        number ++;
        // 在将自身作为返回
        return *this;
    }

    // 重载++后置运算符
    Integer operator++(int){ // int代表占位参数，可以永固区分前置和后置递增
        // 先 记录当时结果
        Integer temp = *this;
        // 后 递增
        number ++;
        // 最后将记录结果做返回
        return temp;
    }
private :
    int number;
};

// 重载左移运算符 返回引用是为了一直对同一个对象进行操作
ostream& operator<<(ostream& cout,Integer i){
    cout << i.number ;
    return cout;
}

void test01(){
    Integer i;
    cout << ++(++i) << endl;
    cout << i << endl;
}

void test02(){
    Integer i;
    cout << i++ << endl;
    cout << i << endl;
}


int main(){
    // test01();
    test02();
    return 0;
}