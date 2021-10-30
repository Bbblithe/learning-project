#include <iostream>
using namespace std;
#include <fstream>

int main(){
    // 创建读取流对象
    ifstream in;

    // 打开文件
    in.open("text.txt",ios::in);

    if(!in.is_open()){
        cout << "文件打开失败" << endl;
        return 0;
    }

    // 读数据
    // 第一种
    /*
    char buf[1024] = {0};
    while(in >> buf){
        cout << buf << endl;
    }
    */

    // 第二种
    /*
    char buf[1024] = {0};
    while(in.getline(buf,sizeof(buf))){
        cout << buf << endl;
    }
    */

    // 第三种
    /*
    string buf;

    while(getline(in,buf)){
        cout << buf << endl;
    }
    */
    
    // 第四种
    char c;
    while((c = in.get()) != EOF){
        cout << c;
    }
    
    in.close();
    return 0;
}