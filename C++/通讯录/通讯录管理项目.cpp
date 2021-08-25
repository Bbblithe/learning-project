#include <iostream>
using namespace std;
#define MAX 1000

struct Contacts{
    string name;
    int sex;
    int age;
    long number;
    string address;
};

struct Address_list{
    Contacts contacts[MAX];
    int count;
};

void showMenu(){
    cout << "1、添加联系人" << endl;
    cout << "2、显示联系人" << endl;
    cout << "3、删除联系人" << endl;
    cout << "4、查找联系人" << endl;
    cout << "5、清空联系人" << endl;
    cout << "6、修改联系人" << endl;
    cout << "0、退出通讯录" << endl;
}

void addPerson(Address_list* adl){
    // 判断通讯录是否已满，如果满了就不再添加
    if(adl->count == MAX){
        cout << "通讯录内存空间不足，添加失败！" << endl;
        return ;
    }

    // 姓名
    cout << "请输入联系人姓名:" ;
    cin >> adl->contacts[(adl->count)].name;

    // 性别
    cout << "请输入性别(真代表男，假代表女):" ;
    cin >> adl->contacts[(adl->count)].sex;

    // 年龄
    cout << "请输入年龄:" ;
    cin >> adl->contacts[(adl->count)].age; 

    // 电话
    cout << "请输入联系电话：" ;
    cin >> adl->contacts[(adl->count)].number;

    // 住址1
    cout << "请输入家庭住址：" ;
    cin >> adl->contacts[(adl->count++)].address;

    system("clear");
    cout << "添加信息成功！" << endl;
}

int main(){
    Address_list AddressBook;
    AddressBook.count = 0;

    int select; // 创建用户选择输入变量

    while(true){
        showMenu(); // 菜单的调用

        cin >> select; // 用户输入

        switch(select){
            case 1: //  添加联系人
                addPerson(&AddressBook);
                break;
            case 2: // 显示联系人
                break;
            case 3: // 删除联系人
                break;
            case 4: // 查找联系人
                break;
            case 5: // 清空联系人
                break; 
            case 6: // 修改联系人
                break;
            case 0: // 退出通讯录
                cout << "已退出，欢迎下次使用" << endl; 
                return 0;
            default:
                cout << "输入有误，请检查后再次输入！" << endl;
        }
    }
    return 0;
}