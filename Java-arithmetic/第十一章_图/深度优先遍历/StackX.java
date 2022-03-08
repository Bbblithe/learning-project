package 第十一章_图.深度优先遍历;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/8 20:59
 * Description:
 */


class StackX {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackX(int max){
        maxSize = max;
        stackArray = new int[max];
        top = -1;
    }

    public void push(int value){
        stackArray[++top] = value;
    }

    public int pop(){
        return stackArray[top--];
    }

    public int peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return(top == -1);
    }
}

