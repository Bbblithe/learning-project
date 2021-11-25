#include <iostream>
#include <stack>
using namespace std;
#define STACKSIZE 32

template <class T>
struct Node{
    T data;
    Node<T>* leftChild,* rightChild;
};

template <typename T>
class SeqStack{
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

private:
    int top;
    T data[STACKSIZE];
};

template<class T>
class BinaryTree{
public:
    BinaryTree(){
        root = nullptr;
    }

    ~BinaryTree(){
        destroy(root);
    }

    void insert(T d){
        Node<T>* newNode = new Node<T>();
        newNode->data = d;
        if(root == nullptr){
            root = newNode;
        }else{
            Node<T>* current = root;
            Node<T>* parent;
            while(true){
                parent = current;
                if(d < current->data){
                    current = current->leftChild;
                    if(current == nullptr){
                        parent->leftChild = newNode;
                        return;
                    }
                }else{
                    current = current->rightChild;
                    if(current == nullptr){
                        parent->rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }


    Node<T>* find(int key){
        Node<T>* current = root;
        while(current->data != key){
            if(key < current->data){
                current = current->leftChild;
            }else{
                current = current->rightChild;
            }
            if(current == nullptr){
                return nullptr;
            }
        }
        return current;
    }

    void traverse(int traverseType){
        switch (traverseType){
            case 1:
                cout<< "Preorder traveral: " ;
                preOrder(root);
                break;
            case 2:
                cout << "Inorder traversal: " ;
                inOrder(root);
                break;
            case 3:
                cout << "Postorder traversal: " ;
                break;
            default:
                cout << "not such traversal number" << endl;
        }
        cout << endl;
    }

    void displayTree(){
        SeqStack<Node<T>*> gloabalStack;
        gloabalStack.push(root);
        int nBlanks = 32;
        bool flag = false;
        cout << ".................................................................." << endl;
        while(!flag){
            SeqStack<Node<T>*> localStack;
            flag = true;

            for(int j = 0 ; j < nBlanks ; j ++){
                cout << " " ;
            }

            while(!gloabalStack.empty()){
                Node<T>* temp = gloabalStack.pop();
                if(temp != nullptr){
                    cout << temp->data;
                    localStack.push(temp->leftChild);
                    localStack.push(temp->rightChild);

                    if(temp->leftChild != nullptr || temp->rightChild != nullptr){
                        flag = false;
                    }
                }else{
                    cout << "--" ;
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
    Node<T>* root;
        void preOrder(Node<T>* localRoot){
        if(localRoot != nullptr){
            cout << localRoot->data << " " ;
            preOrder(localRoot->leftChild);
            preOrder(localRoot->rightChild);
        }
    }

    void inOrder(Node<T>* localRoot){
        if(localRoot != nullptr){
            inOrder(localRoot->leftChild);
            cout << localRoot->data << " " ;
            inOrder(localRoot->rightChild);
        }
    }

    void postOrder(Node<T>* localRoot){
        if(localRoot != nullptr){
            postOrder(localRoot->leftChild);
            postOrder(localRoot->rightChild);
            cout << localRoot->data << " " ;
        }
    }

    void destroy(Node<T>* localRoot){
        if(localRoot != nullptr){
            destroy(localRoot->leftChild);
            destroy(localRoot->rightChild);
            delete localRoot;
        }
    }
};


int main(){
    BinaryTree<int> theTree;
    int number = 0;
    while(true){
        cout << "请输入你要插入的数字,输入9999结束：";
        cin >> number ;
        if(number == 9999){
            break;
        }
        theTree.insert(number);
    }

    while(true){
        cout << "Enter first letter of show, insert, find, quit,or traverse: ";
        char choice;
        Node<int>* found = nullptr;
        cin >> choice;
        switch(choice){
            case 's':
                theTree.displayTree();
                break;
            case 'i':
                cout << "Enter value to insert: ";
                cin >> number;
                theTree.insert(number);
                break;
            case 'f':
                cout <<  "Enter value to find: " ;
                cin >> number;
                // Node<int>* found = nullptr;
                found = theTree.find(number);
                if(found != nullptr){
                    cout << "Found: " << found->data << endl;
                }else{
                    cout << "Could not find " << number << endl;;
                }
                break;
            case 't':
                cout << "Enter type 1(PreOrder) ,2(InOrder) or 3(PostOrder): " ;
                cin >> number;
                theTree.traverse(number);
                break;
            case 'q':
                cout << "Goodbye! ..." ;
                return 0;
            default:
                cout << "Invalid entry\n" ;
                break;
        }
    }
    return 0;
}