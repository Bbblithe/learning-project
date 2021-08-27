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

// 1、添加联系人函数
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

// 2、显示所有联系人函数
void showPerson(Address_list* adl){
    // 判断通讯录中人数是否为0，如果是0，则提示空
    if(!(adl->count)){
        cout << "当前记录为空" << endl;
    }else{
        for(int i = 0 ; i < adl->count ; i ++){
            cout << "姓名：" << adl->contacts[i].name << " 性别：" << (adl->contacts[i].sex?"男":"女")
            << " 年龄：" << adl->contacts[i].age << " 电话：" << adl->contacts[i].number << " 住址：" << 
            adl->contacts[i].address << endl ;
        }
    }
}

// 检测联系人是否存在，如果存在，返回联系人在数组中具体的位置，不存在则返回-1
int isExist(Address_list* adl,string name){ // 参数1:通讯录， 参数2:名字
    for(int i = 0 ; i < adl->count ; i++){
        if(adl->contacts[i].name == name){
            return i;
        }
    }
    return -1; // 如果遍历结束都没有找到
}

// 3、删除联系人函数
void deletePerson(Address_list* adl){
    string name;
    cout << "输入删除联系人姓名：" ;
    cin >> name;
    int res = isExist(adl,name);
    if( res == -1) {
        cout << "查无此人！" << endl;
    }else{
        for(int i = res ; i < adl->count ; i ++){
            adl->contacts[i] = adl->contacts[i+1];
        }
        adl->count--;
        cout << name << "删除成功！" << endl;
    }
}

void findPerson(Address_list* adl){
    string name;
    cout << "请输入查找的联系人姓名：" ;
    cin >> name;
    int res = isExist(adl,name);
    if(res == -1){
        cout << "查无此人！" << endl;
    }else{
        cout << "姓名：" << adl->contacts[res].name << " 性别：" << (adl->contacts[res].sex?"男":"女")
        << " 年龄：" << adl->contacts[res].age << " 电话：" << adl->contacts[res].number << " 住址：" << 
        adl->contacts[res].address << endl ;
    }
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
                showPerson(&AddressBook);
                break;
            case 3: // 删除联系人
                deletePerson(&AddressBook);
                break;
            case 4: // 查找联系人
                findPerson(&AddressBook);
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