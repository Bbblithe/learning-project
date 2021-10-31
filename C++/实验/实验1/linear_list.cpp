#include<iostream>
using namespace std;
const int MaxSize = 100;

template<typename DataType>
class SeqList {
public:
    SeqList();       //建立空的顺序表
    SeqList(DataType a[], int n);  //建立长度为n的顺序表
    ~SeqList();
    int locate(DataType x);    //按值查找
    void Insert(int i, DataType x);  //插入操作，在第i个位置插入x
    DataType Delete(int i);    //删除第i个元素
    void PrintList();     //遍历操作函数
    DataType data[MaxSize];
    int length;
};

template<typename DataType>
SeqList<DataType>::SeqList(DataType a[], int n) {
    if (n > MaxSize) throw "参数非法";
    for (int i = 0; i != n; ++i)
        data[i] = a[i];
    length = n;
}

// 析构函数实现，由于并没有开辟堆内数据，于是对象在销毁时会自动释放空间。无需要手动释放
template<typename DataType>
SeqList<DataType>::~SeqList(){
    for(int i = 0 ; i < length ; i ++){
        data[i] = 0;
    }
    // delete data;
    length = 0;
}

template<typename DataType>
void SeqList<DataType>::PrintList() {
    for (int i = 0; i != length; ++i)
        cout << data[i] << "\t";
    cout << endl;
}

template<typename DataType>
int SeqList<DataType>::locate(DataType x)  {
    for (int i = 0; i != length; ++i)
        if (data[i] == x) return i + 1;
    return 0;
}

template<typename DataType>
void SeqList<DataType>::Insert(int i, DataType x){
    if (length == MaxSize) throw"上溢";
    // if(i < 0 || i > length + 1)
    if (i<1 || i>length + 1) throw"插入位置错误";
    for (int j = length; j >= i; j--)
        data[j] = data[j - 1];
    data[i - 1] = x;
    length++;
}
template<typename DataType>
DataType SeqList<DataType>::Delete(int i)//删除操作
{
    DataType x;
    if (length == 0) throw"下溢";
    if (i<1 || i>length) throw"删除位置错误";
        x = data[i - 1];

    /*
    for(int j = length - 1 ; j > i ; j --){
        data[j] = data[j + 1];
    }
    */

    for(int j = length - 1 ; j > i-1 ; j --){
        data[j - 1] = data[j];
    }

    length--;
    return x;
}

int main()
{
    //建立10个0到100的随机生成的数字的顺序表
    int a[10] ;
    int i;
    srand((unsigned int)time (NULL)); // 增加这行代码
    for (int i = 0; i < 10; i++)
        a[i] = rand() % 100 + 1;
    SeqList<int> L(a,10);
    L.PrintList();
    cout << "在第一个位置插入数字 10" << endl;
    L.Insert(1,10);
    L.PrintList();
    cout << "删除第10个元素" << endl;
    L.Delete(10);
    L.PrintList();

    int o = L.locate(22);
    if(o == 0){
        cout << "该元素不存在" << endl;
    }else{
        cout << "该元素在" << o << endl;
    }

    cout << "The data List is:" << endl;
    L.PrintList();
    return 0;
}