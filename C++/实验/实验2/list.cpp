#include <iostream>
using namespace std;

template <typename Datatype>
struct Node
{
    Datatype data;
    Node<Datatype>* next;
};

template <class T>
void sort(T arr[], T length);

template <typename Datatype>
class LinkList {
public:
    LinkList() {
        first = new Node<Datatype>;
        first->next = nullptr;
    }

    /*
    LinkList(Datatype b[],int n){
        first = new Node<DataType>;
        Node<DataType>* r = first, * s = nullptr;
        for (int i = 0; i < n; i++)
        {
            s = new Node<DataType>;
            s->data = a[i];
            r->next = s;
            r = s;
        }
        r->next = nullptr;
    }
    */

    LinkList(Datatype b[], int n) {
        sort(b, n);
        first = new Node<Datatype>;
        Node<Datatype>* p = first, * s = nullptr;
        for (int i = 0; i < n; i++) {
            s = new Node<Datatype>;
            s->data = b[i];
            p->next = s;
            p = s;
        }
        s->next = nullptr;
    }

    ~LinkList() {
        Node<Datatype>* p = first;
        while (first != nullptr) {
            p = first->next;
            delete first;
            first = p;
        }
    }

    // int Length(){
        // return length;
    // }

    int Length() {
        int count = 0;
        Node<Datatype>* p = first->next;
        while (p != nullptr) {
            count++;
            p = p->next;
        }
        return count;
    }

    Datatype Get(int i) {
        Node<Datatype>* d = first;
        for (int j = 0; j < i; j++) {
            if (d->next != nullptr) {
                d = d->next;
            }
            else {
                cout << "没有该元素" << endl;
                return -9999;
            }
        }
        return d->data;
    }

    int Locate(Datatype x) {
        // Node<Datatype>* p = first;
        Node<Datatype>* p = first->next;
        int count = 0;
        while (p->next != nullptr) {
            count++;
            if (p->data == x) {
                return count;
            }
            p = p->next;
        }
        return 0;
    }

    //void Insert(int i, Datatype x);

    void Insert(Datatype x) {
        // Node<Datatype>* node = first->next;
        // Node<Datatype>* father = first;
        // Node<Datatype>* nn = new Node<Datatype>;
        // nn->data = x;
        // if(node == nullptr){
        //     first->next = nn;
        //     nn->next = nullptr;
        //     return ;
        // }
        // while(node != nullptr && x > node->data){
        //     father = node;
        //     node = node->next;
        // }
        // father->next = nn;
        // nn->next=node;

        Node<Datatype>* nn = new Node<Datatype>;
        nn->data = x;
        Node<Datatype>* previous = first;
        Node<Datatype>* current = first->next;

        while (current != nullptr && x > current->data) {
            previous = current;
            current = current->next;
        }

        if (current == nullptr && previous == nullptr) {
            first->next = nn;
        }
        else {
            previous->next = nn;
        }
        nn->next = current;
    }

    void PrintList() {
        Node<Datatype>* p = first->next;
        cout << "first->";
        if (p == nullptr) {
            cout << "{null}" << endl;
            return;
        }
        while (p->next != nullptr) {
            cout << "{" << p->data << "}->";
            p = p->next;
        }
        cout << "{" << p->data << "}" << endl;
    }

    Datatype Delete(int i) {
        Node<Datatype>* current = first->next;
        Node<Datatype>* previous = first;
        int count = 0;
        if (this->Length() < i || i < 1) {
            cout << "链表中不存在该位置";
            return -9999;
        }
        while (count++ < i - 1) {
            previous = current;
            current = current->next;
        }
        Datatype deleteOne = current->data;
        previous->next = current->next;
        delete current;
        return deleteOne;
    }

    int Empty() {
        if (first->next != nullptr) {
            return 1;
        }
        return 0;
    }

    LinkList<Datatype> merge(LinkList<Datatype>& L1) {
        LinkList<Datatype>* L3 = new LinkList<Datatype>;
        Node<Datatype>* current3 = L3->first;
        Node<Datatype>* current1 = L1.first->next;
        Node<Datatype>* current2 = first->next;
        while (current1 != nullptr && current2 != nullptr) {
            if (current1->data < current2->data) {
                // Node<Datatype>* nn1 = new Node<Datatype>;
                // Node<Datatype>* nn2 = new Node<Datatype>;
                // nn1->data = current2->data;
                // nn2->data = current1->data;
                // current3->next = nn1;
                // nn1->next = nn2;
                // nn2->next = nullptr;
                // current3 = current3->next->next;
                // if (current1 != nullptr && current2 != nullptr) {
                //     current1 = current1->next;
                //     current2 = current2->next;
                // }
                Node<Datatype>* nn1 = new Node<Datatype>;
                nn1->data = current1->data;
                current3->next = nn1;
                current1 = current1->next;
                current3 = current3->next;
            }
            else {
                // Node<Datatype>* nn1 = new Node<Datatype>;
                // Node<Datatype>* nn2 = new Node<Datatype>;
                // nn1->data = current1->data;
                // nn2->data = current2->data;
                // current3->next = nn1;
                // nn1->next = nn2;
                // nn2->next = nullptr;
                // current3 = current3->next->next;
                // if (current1 != nullptr && current2 != nullptr) {
                //     current1 = current1->next;
                //     current2 = current2->next;
                // }
                Node<Datatype>* nn2 = new Node<Datatype>;
                nn2->data = current2->data;
                current3->next = nn2;
                current2 = current2->next;
                current3 = current3->next;
            }
        }
        // if(current1!=nullptr){
        //     current3->next = current1;
        // }
        while(current1 != nullptr){
            Node<Datatype>* nnode = new Node<Datatype>;
            nnode->data = current1->data;
            current3->next = nnode;
            current1 = current1->next;
            current3 = current3->next;
        }
        // if (current2!=nullptr){
        //     current3->next = current2;
        // }
        while(current2 != nullptr){
            Node<Datatype>* nnode = new Node<Datatype>;
            nnode->data = current2->data;
            current3->next = nnode;
            current2 = current2->next;
            current3 = current3->next;
        }
        return *L3;
    }

private:
    Node<Datatype>* first;
    // int length;
};

template <class T>
void swap(T* a, T* b) {
    T temp = *a;
    *a = *b;
    *b = temp;
}

template <class T>
void sort(T arr[], T length) {
    T out, min, in;
    for (out = 0; out < length - 1; out++) {
        min = out;
        for (in = out + 1; in < length; in++) {
            if (arr[in] < arr[min]) {
                min = in;
            }
        }
        swap(&arr[out], &arr[min]);
    }
}



int main() {
    int arr[10] = { 1,23,3,2320,-1,-345,486,9,123,2 };
    int arr2[10] = {15,255,73,332,70,411,278,109,269,64};
    LinkList<int> a(arr, 10);
    LinkList<int> b(arr2, 10);
    LinkList<int> c;
    cout << "------------------" << endl;
    c.PrintList();
    cout << "插入元素99" << endl;
    c.Insert(99);
    c.PrintList();
    cout << "插入元素88" << endl;
    c.Insert(88);
    c.PrintList();
    cout << "------------------" << endl;
    // cout << b.Length() << endl;
    // cout << a.Locate(29) << endl;
    a.PrintList();
    cout << "a链表的长度" << a.Length() << endl;
    b.PrintList();
    cout << "b链表的长度" << b.Length() << endl;
    LinkList<int> d = b.merge(a);
    d.PrintList();
    cout << "融合之后d的长度是" << d.Length() << endl;
    return 0;
}