#include <iostream>
using namespace std;
#define STACKSIZE 10

template <typename T>
class SeqStack{
public:
    SeqStack(){
        top = -1;
    }

    ~SeqStack(){
        top = -1;
    }

    void Push(T a){
        if(top == STACKSIZE - 1){
            throw "⬆上溢";
        }
        data[++top] = a;
    }

    T Pop(){
        if(top == -1){
            throw "⬇下溢";
        }
        return data[top--];
    }
     
    T Peek(){
        if(top == -1){
            cout << "栈已空，无法弹栈" << endl;
            return 101;
        }
        return data[top];
    }

    int Empty(){
        return top == -1;
    }

    // 增加私有属性的访问方法
    int getTop(){
        return top;
    }

private:
    int top;
    T data[STACKSIZE];
};

int main(){
    SeqStack<int> stack;
    srand((unsigned int)time (NULL)); // 增加这行代码

    for (int i = 0; i < STACKSIZE; i++){
        int num = rand() % 100 + 1;
        cout << num << " " ;
        stack.Push(num);
    }

    int count = 0;

    cout << "\n请输入需要出栈的个数:" ;
    cin >> count ;
    int count2 = count ;
    for(int i = 0 ; i <count ; i++ ){
        // if(count > stack.getTop()+1){
        //     cout << "栈中剩余元素低于出栈个数！" << endl;
        //     break;
        // }

        if(count2 > stack.getTop()+1){
            cout << "栈中剩余元素低于出栈个数！" << endl;
            break;
        }
        count2 --;
        cout << stack.Pop() << " ";
        if(i == count - 1){
            cout << endl;
        }
    }
    return 0;
}