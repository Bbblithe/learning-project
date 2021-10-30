#include <iostream>
using namespace std; 
// 1.包含头文件
#include <fstream>

// 文本文件 写文件

void test01(){
    // 2.创建流对象
    ofstream ofs;

    // 3、指定打开方式
    ofs.open("text.txt",ios::out);

    // 4、写内容
    ofs << "姓名：张三" << endl;
    ofs << "adsfasdfjasdfjaskdf" << endl;

    ofs.clear();
    ofs.close();
}

int main(){
    test01();
    return 0;
}