#include <iostream>
using namespace std;
#define MAXSIZE 10

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
        Node<T>* t = new Node<T>;
        t->data = x;
        t->next = nullptr;
        rear->next = t; 
        rear = t;
    }

    T DeQueue(){
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

    // T getHead(){
    //     return front->next->data;
    // }

    int Empty(){
        return front == rear;
    }

    // void showQueue(){
    //     Node<T>* current = front->next;
    //     cout << "{";
    //     while(current != nullptr && front != rear){
    //         cout << current->data << " " ;
    //         current = current->next;
    //     }
    //     cout << "}" << endl;
    // }

    // int SizeOfQueue(){
    //     int count = 0;
    //     Node<T>* current = front->next;
    //     while(current != nullptr){
    //         count ++ ;
    //         current = current->next;
    //     }
    //     return count;
    // }

private:
    Node<T>* front;
    Node<T>* rear;
};


template <class T>
class MGraph{
public:
    MGraph(T data[],int n,int e){
        int a,b;
        vertexNum = n;
        edgeNum = e;
        for(int i = 0 ; i < vertexNum ; i ++){
            vertex[i] = data[i];
            visited[i] = 0;
            for(int j = 0 ; j < vertexNum ; j ++){
                edge[i][j] = 0;
            }
        }
        for(int i = 0 ; i < edgeNum ; i ++){
            cout << "请输入有边的两个节点:" ;
            cin >> a >> b;
            edge[a][b] = 1;
            edge[b][a] = 1;
        }
    }

    ~MGraph(){
        for(int i = 0 ; i < vertexNum ; i ++){
            for(int j = 0 ; j < vertexNum ; j ++){
                edge[i][j] = 0;
            }
        }
    }

    void DFTraverse(int v){
        cout << vertex[v] << " "; visited[v] = 1;
        for(int i = 0 ; i < edgeNum ; i ++){
            if(visited[i] != 1 && edge[v][i] == 1){
                DFTraverse(i);
            }
        }
    }

    void BFTraverse(int v){
        int a;
        LinkQueue<int> queue;
        cout << vertex[v] << " " ;
        visited[v] = 1;
        queue.EnQueue(v);
        // while(queue.Empty()){
        while(!queue.Empty()){
            a = queue.DeQueue();
            for( int i = 0 ; i < vertexNum ; i ++){
                if(visited[i] == 0 && edge[a][i] == 1){
                    cout << vertex[i] << " "; 
                    visited[i] = 1; 
                    queue.EnQueue(i);
                }
            }
        }
    }

    // 增加这个函数对visited进行重制
    void clear(){
        for(int i = 0 ; i < vertexNum ; i ++){
            visited[i] = 0;
        }
    }

private:
    T vertex[MAXSIZE];
    int edge[MAXSIZE][MAXSIZE];
    int vertexNum,edgeNum;
    // 私有属性增加visited数组
    int visited[MAXSIZE];
};


int main(){
    string data[6] = {"V0","V1","V2","V3","V4"};
    MGraph<string> a(data,5,6);
    cout << "深度遍历结果: " ;
    a.DFTraverse(0);
    cout << endl;
    a.clear();
    cout << "广度遍历结果: " ;
    a.BFTraverse(0);
    cout << endl;
    return 0;
}