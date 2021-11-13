#include <iostream>
using namespace std;

template <class T>
struct Node{
    T data;
    Node<T>* next;
};

template <class T>
class LinkQueue{
public:
    LinkQueue(){
        front = new Node<T>;
        rear = front;
    }

    ~LinkQueue(){
        Node<T>* previous = nullptr;
        while(front->next != nullptr){
            previous = front;
            front = front->next;
            delete previous;
        }
        delete front;
    }

    void EnQueue(T x){
        // Node<T>* t = nullptr;
        // if(rear == front){
        //     rear = new Node<T>;
        //     rear->data = x;
        //     front->next = rear;
        // }else{
        //     t = new Node<T>;
        //     t->data = x;
        //     rear->next = t;
        //     rear = t;
        // }

        Node<T>* t = new Node<T>;
        t->data = x;
        t->next = nullptr;
        rear->next = t; 
        rear = t;
    }

    T DeQueue(){
        // if(front == rear){
        //     throw "下溢";
        // }else{
        //     T a = front1->next->data;
        //     front = front->next;
        //     return a;
        // }

        if(front == rear){
            throw "下溢";
        }
        Node<T>* p = front->next;
        T a = p->data;
        front->next = p->next;
        if(front->next == nullptr){
            rear = front;
        }
        delete p;
        return a;
    }

    T getHead(){
        return front->next->data;
    }

    int Empty(){
        return front == rear;
    }

    void showQueue(){
        Node<T>* current = front->next;
        // while(current != nullptr){
        cout << "{";
        while(current != nullptr && front != rear){
            cout << current->data << " " ;
            current = current->next;
        }
        cout << "}" << endl;
    }

    int SizeOfQueue(){
        int count = 0;
        Node<T>* current = front->next;
        while(current != nullptr){
            count ++ ;
            current = current->next;
        }
        return count;
    }

private:
    Node<T>* front;
    Node<T>* rear;
};

int main(){
    srand((unsigned int)time (NULL));
    int count;
    LinkQueue<int> q1;
    cout << "入队顺序:" ;
    for (int i = 0; i < 10; i++){
        int num = rand() % 100 + 1;
        cout << num << " " ;
        q1.EnQueue(num);
    }

    cout << "\n请输入需要出队的个数:" ;
    cin >> count ;
    if(count > q1.SizeOfQueue() || count < 0){
        cout << "栈中剩余元素低于出队个数！" << endl;
        count = 0;
        goto result; // 增加goto语句来实现最后当输入非法
    }

    for(int i = 0 ; i < count ; i ++){
        if(count){
            cout << q1.DeQueue() << "出队！" << endl;
        }
    }

    // while(count --){
    //     cout << q1.DeQueue() << "出队！" << endl;;
    // }

    result: //
    cout << "出队" << count << "之后剩余队列:" ;
    q1.showQueue();
    
    return 0 ;
}