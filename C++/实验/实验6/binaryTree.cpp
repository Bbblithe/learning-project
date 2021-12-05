#include<iostream>
using namespace std;
// #define STACKSIZE 10
#define STACKSIZE 20

template<typename T>
struct BiNode {
    T data;
    BiNode<T>* lchild, * rchild;
};

template <typename T>
class SeqStack{
private:
    int top;
    T data[STACKSIZE];

public:
    SeqStack(){
        top = -1;
    }

    ~SeqStack(){
        top = -1;
    }

    void push(T a){
        if(top == STACKSIZE - 1){
            throw "⬆上溢";
        }
        data[++top] = a;
    }

    T pop(){
        if(top == -1){
            throw "⬇下溢";
        }
        return data[top--];
    }
     
    T peek(){
        if(top == -1){
            cout << "栈已空，无法弹栈" << endl;
            return 101;
        }
        return data[top];
    }

    bool empty(){
        return top == -1;
    }

    // 增加私有属性的访问方法
    int getTop(){
        return top;
    }
};

template<typename T>
class BiTree {
public:
    BiTree() { root = Creat(); }    
    ~BiTree() { Release(root); }
    void DisplayLeaf() { DispLeaf(root);}
    int getNum(){return getSum(root);}
    int getDeepth(){return getHeight(root);}

    void displayTree(){
        SeqStack<BiNode<T>*> gloabalStack;
        gloabalStack.push(root);
        int nBlanks = 32;
        bool flag = false;
        cout << ".................................................................." << endl;
        while(!flag){
            SeqStack<BiNode<T>*> localStack;
            flag = true;

            for(int j = 0 ; j < nBlanks ; j ++){
                cout << " " ;
            }

            while(!gloabalStack.empty()){
                BiNode<T>* temp = gloabalStack.pop();
                if(temp != nullptr){
                    cout << temp->data;
                    localStack.push(temp->lchild);
                    localStack.push(temp->rchild);

                    if(temp->lchild != nullptr || temp->rchild != nullptr){
                        flag = false;
                    }
                }else{
                    cout << "--" ;
                    // gloabalStack.push(nullptr);
                    // gloabalStack.push(nullptr);
                    localStack.push(nullptr);
                    localStack.push(nullptr);
                }
                for(int j = 0 ; j < nBlanks * 2 - 2 ; j ++){
                    cout << " " ;
                }
            }
            cout << endl;
            nBlanks /= 2;
            while( !localStack.empty()){
                gloabalStack.push(localStack.pop());
            }
            cout << ".................................................................." << endl;
        }
    }
private:
    int getSum(BiNode<T>* root){
        if(root == nullptr){
            // return 1;
            return 0;
        }else{
            // return (getSum(root->lchild) + 1 + getSum(root->rchild) + 1);
            return (getSum(root->lchild) + getSum(root->rchild) + 1);
        }
    }

    void Release(BiNode<T>* bt){
        if (bt == nullptr) return;
        else {
        Release(bt->lchild);
        Release(bt->rchild);
        delete bt;
        }
    }
    void DispLeaf(BiNode<T>* b){
        if (b!=NULL) 
        {
            if (b->lchild==NULL && b->rchild==NULL){ 
                printf("%c ",b->data);	
            }
            DispLeaf(b->lchild);		
            DispLeaf(b->rchild);
        }
    }

    int getHeight(BiNode<T>* root){
        if(root == nullptr){
            return 0;
        }else{
            return (getHeight(root->lchild) > getHeight(root->rchild) ? (getHeight(root->lchild)+1) : (getHeight(root->rchild) + 1));
        }
    }

    BiNode<T> *Creat()
    {
        BiNode<T>* bt;
        char ch;
        cin >> ch;
        if (ch == '#')
            bt = nullptr;
        else {
            bt = new BiNode<T>; bt->data = ch;
            bt->lchild = Creat();
            bt->rchild = Creat();
        }
        return bt;
    }


    BiNode<T>* root;
};
int main(){   
    cout << "请输入前序遍历的该满二叉树，并以'#'代表节点为空:";
    BiTree<char>T;
    cout << "前序遍历叶子节点: ";
    T.DisplayLeaf();
    cout << endl;
    cout << "二叉树如下" <<endl;
    T.displayTree();
    cout << "二叉树节点数" << T.getNum() << endl;
    cout << "二叉树的深度为" << T.getDeepth() << endl;
    return 0;
}